package casestudy;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.time.LocalDate;

//default data for testing
class DataSeeder {

    // seed the bank model with sample accounts and historic transactions
    static void seed(BankModel bm) {
        // savings accounts
        LocalDate now = LocalDate.now();
        for (int i = 0; i < 4; i++) {
            int accNo = 1000 + (i + 1);
            SavingsAccount s = new SavingsAccount(accNo, "sav_user" + (i + 1), "sav" + (i + 1) + "@mail.com",
                    "90000000" + (i + 1), 15000 + i * 2000);
            LocalDate opened = now.minusMonths(6).minusDays(i * 3);
            s.setDateOpened(opened);
            bm.openAccount(s);

            // add 4 historic txns spaced weekly from opened date
            addHistoricTransaction(bm, s, 2000, "CREDIT", "initial deposit", opened.plusDays(2));
            addHistoricTransaction(bm, s, 500, "DEBIT", "atm withdraw", opened.plusWeeks(1));
            addHistoricTransaction(bm, s, 1500, "CREDIT", "salary", opened.plusWeeks(3));
            addHistoricTransaction(bm, s, 700, "DEBIT", "grocery", opened.plusWeeks(5));
        }

        // salary accounts
        for (int i = 0; i < 4; i++) {
            int accNo = 2000 + (i + 1);
            SalaryAccount sa = new SalaryAccount(accNo, "sal_user" + (i + 1), "sal" + (i + 1) + "@mail.com",
                    "91000000" + (i + 1), 5000 + i * 500);
            LocalDate opened = now.minusMonths(4).minusDays(i * 2);
            sa.setDateOpened(opened);
            bm.openAccount(sa);

            addHistoricTransaction(bm, sa, 8000, "CREDIT", "salary credit", opened.plusDays(3));
            addHistoricTransaction(bm, sa, 1200, "DEBIT", "bill payment", opened.plusWeeks(2));
            addHistoricTransaction(bm, sa, 500, "DEBIT", "utility", opened.plusWeeks(4));
            addHistoricTransaction(bm, sa, 200, "DEBIT", "mobile rechr", opened.plusWeeks(6));
        }

        // current accounts
        for (int i = 0; i < 4; i++) {
            int accNo = 3000 + (i + 1);
            CurrentAccount ca = new CurrentAccount(accNo, "cur_user" + (i + 1), "cur" + (i + 1) + "@mail.com",
                    "92000000" + (i + 1), 2000 + i * 1000, 5000 + i * 1000);
            LocalDate opened = now.minusMonths(5).minusDays(i * 4);
            ca.setDateOpened(opened);
            bm.openAccount(ca);

            addHistoricTransaction(bm, ca, 3000, "CREDIT", "initial topup", opened.plusDays(5));
            addHistoricTransaction(bm, ca, 1000, "DEBIT", "supplier pay", opened.plusWeeks(1));
            addHistoricTransaction(bm, ca, 2500, "DEBIT", "equipment", opened.plusWeeks(3));
            addHistoricTransaction(bm, ca, 4000, "CREDIT", "client payment", opened.plusWeeks(6));
        }

        // loan accounts
        for (int i = 0; i < 4; i++) {
            int accNo = 4000 + (i + 1);
            double loanAmt = 50000 + i * 10000;
            LoanAccount la = new LoanAccount(accNo, "loan_user" + (i + 1), "loan" + (i + 1) + "@mail.com",
                    "93000000" + (i + 1), loanAmt);
            LocalDate opened = now.minusMonths(8).minusDays(i * 7);
            la.setDateOpened(opened);
            bm.openAccount(la);

            // repayments and charges
            addHistoricTransaction(bm, la, 5000, "CREDIT", "emi payment 1", opened.plusDays(10));
            addHistoricTransaction(bm, la, 5000, "CREDIT", "emi payment 2", opened.plusMonths(1));
            addHistoricTransaction(bm, la, 10000, "CREDIT", "partial prepayment", opened.plusMonths(3));
            addHistoricTransaction(bm, la, 2000, "DEBIT", "late fee", opened.plusMonths(4)); // fee will reduce balance
                                                                                             // further
        }

        System.out.println("Data seeding complete sample accounts and transactions added");
    }

    // helper that inserts a transaction with a historic date directly into account
    // and branch log
    static Transaction addHistoricTransaction(BankModel bm, Account a, double amount, String type,
            String remark,
            LocalDate date) {

        // ensure internal array capacity
        if (a.transactionCount >= a.transactions.length) {
            Transaction[] newArr = new Transaction[a.transactions.length * 2];
            System.arraycopy(a.transactions, 0, newArr, 0, a.transactions.length);
            a.transactions = newArr;
        }

        int txId = Account.TX_COUNTER.incrementAndGet();

        // compute new balance as per transaction type
        double newBal;
        if ("CREDIT".equalsIgnoreCase(type)) {
            newBal = a.balance + amount;
        } else { // DEBIT
            newBal = a.balance - amount;
        }
        a.balance = newBal;

        Transaction tx = new Transaction(txId, a.accountNumber, amount, a.balance, remark, type);
        // override date to historic date
        tx.date = date;

        a.transactions[a.transactionCount] = tx;
        a.transactionCount++;

        // mirror to branch log
        bm.addToAllTransactions(tx);

        return tx;
    }
}

class Transaction {
    int transactionId;
    int accountNumber;
    double amount;
    double balance;
    String remark;
    String type;
    LocalDate date;

    Transaction(int transactionId, int accountNumber, double amount, double balance, String remark, String type) {
        this.transactionId = transactionId;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.balance = balance;
        this.remark = remark;
        this.type = type;
        this.date = LocalDate.now();
    }

    public String toString() {
        return "ID: " + transactionId + " | Type: " + type + " | Amt: " + amount + " | Bal: " + balance + " | "
                + remark;
    }
}

abstract class Account {
    int accountNumber;
    String accountHolderName;
    String accountHolderEmail;
    String accountHolderMobile;
    double balance;
    String status;

    Transaction[] transactions;
    int transactionCount;

    LocalDate dateOpened;

    // to get unique id for each transaction
    static final AtomicInteger TX_COUNTER = new AtomicInteger(1000);

    Account(int accountNumber, String name, String email, String mobile, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = name;
        this.accountHolderEmail = email;
        this.accountHolderMobile = mobile;
        this.balance = balance;
        this.status = "ACTIVE";
        this.dateOpened = LocalDate.now();

        this.transactions = new Transaction[10];
        this.transactionCount = 0;
    }

    String getAccountHolderName() {
        return accountHolderName;
    }

    void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    String getAccountHolderEmail() {
        return accountHolderEmail;
    }

    void setAccountHolderEmail(String accountHolderEmail) {
        this.accountHolderEmail = accountHolderEmail;
    }

    String getAccountHolderMobile() {
        return accountHolderMobile;
    }

    void setAccountHolderMobile(String accountHolderMobile) {
        this.accountHolderMobile = accountHolderMobile;
    }

    Transaction[] getTransactions() {
        return transactions;
    }

    void setTransactions(Transaction[] transactions) {
        this.transactions = transactions;
    }

    int getTransactionCount() {
        return transactionCount;
    }

    void setTransactionCount(int transactionCount) {
        this.transactionCount = transactionCount;
    }

    LocalDate getDateOpened() {
        return dateOpened;
    }

    void setDateOpened(LocalDate dateOpened) {
        this.dateOpened = dateOpened;
    }

    void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    void setStatus(String status) {
        this.status = status;
    }

    // deposit funds into account and create a transaction record
    void deposit(double amount) {
        if (status.equals("FREEZE") || status.equals("CLOSED")) {
            System.out.println("Transaction Failed: Account is " + status);
            return;
        }
        this.balance += amount;
        addTransaction(amount, "CREDIT", "Deposit");
        System.out.println("Deposit Successful. New Balance: " + this.balance);
        accountLifeCycle();
    }

    // withdraw funds using account specific rules and record transaction
    final void withdraw(double amount) {
        if (status.equals("INACTIVE") || status.equals("FREEZE") || status.equals("CLOSED")) {
            System.out.println("Transaction Failed: Account is " + status);
            return;
        }
        if (!canWithdraw(amount)) {
            System.out.println("Transaction Failed: Insufficient funds or limit exceeded.");
            return;
        }
        this.balance -= amount;
        addTransaction(amount, "DEBIT", "Withdrawal");
        System.out.println("Withdrawal Successful. New Balance: " + this.balance);
        accountLifeCycle();
    }

    // print account transactions between two dates and show summary
    final void getStatementByDate(LocalDate start, LocalDate end) {
        Transaction[] result = new Transaction[transactionCount];
        int count = 0;

        for (int i = 0; i < transactionCount; i++) {
            LocalDate txDate = transactions[i].date;
            if ((txDate.isEqual(start) || txDate.isAfter(start)) && (txDate.isEqual(end) || txDate.isBefore(end))) {
                result[count++] = transactions[i];
            }
        }

        Transaction[] finalData = new Transaction[count];
        System.arraycopy(result, 0, finalData, 0, count);

        System.out.println("\n--- Statement for Account " + accountNumber + " from " + start + " to " + end + " ---");
        if (count == 0) {
            System.out.println("No transactions in given date range.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println(finalData[i].toString());
            }
            System.out.println("Total: " + count);
        }
        System.out.println("---------------------------------------------");

    }

    // add a transaction to the account transaction array resizing if needed
    void addTransaction(double amount, String type, String remark) {
        if (transactionCount >= transactions.length) {
            Transaction[] newArr = new Transaction[transactions.length * 2];
            System.arraycopy(transactions, 0, newArr, 0, transactions.length);
            transactions = newArr;
        }

        int txId = TX_COUNTER.incrementAndGet();
        Transaction tx = new Transaction(txId, this.accountNumber, amount, this.balance, remark, type);

        transactions[transactionCount] = tx;
        transactionCount++;
    }

    // return the most recent transaction or null if none
    Transaction getLastTransaction() {
        if (transactionCount > 0) {
            return transactions[transactionCount - 1];
        }
        return null;
    }

    abstract boolean canWithdraw(double amount);

    abstract void accountLifeCycle();

    abstract double calculateInterest();

    int getAccountNumber() {
        return accountNumber;
    }

    double getBalance() {
        return balance;
    }

    String getStatus() {
        return status;
    }
}

class SavingsAccount extends Account {
    static double minBalance = 10000.0;
    static double interestRate = 4.0;

    SavingsAccount(int accountNumber, String name, String email, String mobile, double balance) {
        super(accountNumber, name, email, mobile, balance);
        if (balance < minBalance)
            status = "INACTIVE";
    }

    static double getMinBalance() {
        return minBalance;
    }

    static void setMinBalance(double minBalance) {
        SavingsAccount.minBalance = minBalance;
    }

    static double getInterestRate() {
        return interestRate;
    }

    static void setInterestRate(double interestRate) {
        SavingsAccount.interestRate = interestRate;
    }

    // allow withdrawal only if min balance remains after withdrawal
    boolean canWithdraw(double amount) {
        return (balance - amount) >= minBalance;
    }

    // update account status based on current balance and min balance rule
    void accountLifeCycle() {
        if (balance < minBalance) {
            status = "INACTIVE";
        } else {
            status = "ACTIVE";
        }
    }

    // calculate interest for this account based on configured rate
    double calculateInterest() {
        if (balance <= 0)
            return 0.0;
        return (balance * interestRate / 100.0) / 12.0; // monthly interest
    }
}

class SalaryAccount extends Account {
    LocalDate lastTransactionDate;
    static int inactiveMonthsLimit = 2;

    SalaryAccount(int accountNumber, String name, String email, String mobile, double balance) {
        super(accountNumber, name, email, mobile, balance);
        this.lastTransactionDate = LocalDate.now();
    }

    LocalDate getLastTransactionDate() {
        return lastTransactionDate;
    }

    void setLastTransactionDate(LocalDate lastTransactionDate) {
        this.lastTransactionDate = lastTransactionDate;
    }

    static int getInactiveMonthsLimit() {
        return inactiveMonthsLimit;
    }

    static void setInactiveMonthsLimit(int inactiveMonthsLimit) {
        SalaryAccount.inactiveMonthsLimit = inactiveMonthsLimit;
    }

    // check inactivity and ensure sufficient balance for withdrawal
    boolean canWithdraw(double amount) {
        if (amount < 0)
            return false;
        LocalDate cutoff = lastTransactionDate.plusMonths(inactiveMonthsLimit);
        if (LocalDate.now().isAfter(cutoff)) {
            status = "INACTIVE";
            notifyUser();
            return false;
        }
        return (balance - amount) >= 0;
    }

    // override to update last transaction date when a transaction is recorded
    void addTransaction(double amount, String type, String remark) {
        super.addTransaction(amount, type, remark);
        lastTransactionDate = LocalDate.now();
    }

    // evaluate inactivity and notify user when account becomes inactive
    void accountLifeCycle() {

        LocalDate now = LocalDate.now();
        long months = (now.getYear() - lastTransactionDate.getYear()) * 12
                + (now.getMonthValue() - lastTransactionDate.getMonthValue());

        if (months >= inactiveMonthsLimit) {
            if (!status.equals("INACTIVE")) {
                status = "INACTIVE";
                notifyUser();
            }
        } else {
            status = "ACTIVE";
        }
    }

    // salary accounts do not earn interest in this model
    double calculateInterest() {
        return 0.0;
    }

    // notify account holder that account is inactive
    void notifyUser() {
        System.out.println("Notify: Salary account " + accountNumber + " for " + accountHolderName + " is INACTIVE.");
    }
}

class CurrentAccount extends Account {
    double overdraftLimit;
    static double overdraftLimitInterest = 5.0;

    CurrentAccount(int accountNumber, String name, String email, String mobile, double balance, double overdraftLimit) {
        super(accountNumber, name, email, mobile, balance);
        this.overdraftLimit = overdraftLimit;
    }

    double getOverdraftLimit() {
        return overdraftLimit;
    }

    void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    static double getOverdraftLimitInterest() {
        return overdraftLimitInterest;
    }

    static void setOverdraftLimitInterest(double overdraftLimitInterest) {
        CurrentAccount.overdraftLimitInterest = overdraftLimitInterest;
    }

    // allow withdrawal up to overdraft limit
    boolean canWithdraw(double amount) {
        return (balance - amount) >= -overdraftLimit;
    }

    // check overdraft breach and freeze account if required
    void accountLifeCycle() {
        if (balance < -overdraftLimit) {
            status = "FREEZE";
        } else {
            status = "ACTIVE";
        }
    }

    // calculate interest charged on overdraft when balance is negative
    double calculateInterest() {
        if (balance < 0) {
            return -(Math.abs(balance) * overdraftLimitInterest / 100.0);
        }
        return 0.0;
    }
}

class LoanAccount extends Account {
    double loanAmount;
    double amountRepaid;
    double interestRate = 10.5;
    LocalDate emiDueDate;
    boolean isLoanCleared;

    LoanAccount(int accountNumber, String accountHolderName, String email, String mobile, double loanAmount) {
        super(accountNumber, accountHolderName, email, mobile, -loanAmount);
        this.loanAmount = loanAmount;
        this.amountRepaid = 0.0;
        this.interestRate = 10.5;
        this.emiDueDate = LocalDate.now().plusMonths(1);
        this.isLoanCleared = false;
    }

    double getLoanAmount() {
        return loanAmount;
    }

    void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    double getAmountRepaid() {
        return amountRepaid;
    }

    void setAmountRepaid(double amountRepaid) {
        this.amountRepaid = amountRepaid;
    }

    double getInterestRate() {
        return interestRate;
    }

    void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    LocalDate getEmiDueDate() {
        return emiDueDate;
    }

    void setEmiDueDate(LocalDate emiDueDate) {
        this.emiDueDate = emiDueDate;
    }

    boolean isLoanCleared() {
        return isLoanCleared;
    }

    void setLoanCleared(boolean isLoanCleared) {
        this.isLoanCleared = isLoanCleared;
    }

    // loan accounts do not allow withdrawals
    boolean canWithdraw(double amount) {
        return false;
    }

    // accept repayment for loan and update loan status when cleared
    void deposit(double amount) {
        if (isLoanCleared) {
            System.out.println("Loan is already cleared.");
            return;
        }
        super.deposit(amount);
        amountRepaid += amount;
        if (balance >= 0) {
            isLoanCleared = true;
            status = "CLOSED";
            balance = 0;
            System.out.println("Congratulations! Loan Cleared.");
        }
    }

    // check if loan has been cleared and update status
    void accountLifeCycle() {
        if (balance >= 0 && !isLoanCleared) {
            isLoanCleared = true;
            status = "CLOSED";
        }
    }

    // calculate interest on outstanding loan balance
    double calculateInterest() {
        if (balance < 0 && !isLoanCleared) {
            return -(Math.abs(balance) * (interestRate / 100.0)) / 12.0; // monthly interest to charge
        }
        return 0.0;
    }
}

class BankModel {
    String branchCode;

    Account[] accounts;
    int accountCount;

    Transaction[] allTransactions;
    int allTransactionsCount;

    BankModel(String branchCode) {
        this.branchCode = branchCode;
        this.accounts = new Account[10];
        this.accountCount = 0;
        this.allTransactions = new Transaction[20];
        this.allTransactionsCount = 0;
    }

    String getBranchCode() {
        return branchCode;
    }

    void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    Account[] getAccounts() {
        return accounts;
    }

    void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    int getAccountCount() {
        return accountCount;
    }

    void setAccountCount(int accountCount) {
        this.accountCount = accountCount;
    }

    Transaction[] getAllTransactions() {
        return allTransactions;
    }

    void setAllTransactions(Transaction[] allTransactions) {
        this.allTransactions = allTransactions;
    }

    int getAllTransactionsCount() {
        return allTransactionsCount;
    }

    void setAllTransactionsCount(int allTransactionsCount) {
        this.allTransactionsCount = allTransactionsCount;
    }

    // add an account to the branch and resize array when needed
    void openAccount(Account account) {
        if (accountCount >= accounts.length) {
            Account[] newAccs = new Account[accounts.length * 2];
            System.arraycopy(accounts, 0, newAccs, 0, accounts.length);
            accounts = newAccs;
        }

        accounts[accountCount] = account;
        accountCount++;
        System.out.println("Account opened: " + account.getAccountNumber());
    }

    // mark account as closed if present
    void closeAccount(int accountNumber) {
        int index = -1;
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber() == accountNumber) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            accounts[index].status = "CLOSED";
            System.out.println("Account closed: " + accountNumber);
        }
    }

    // find an account by account number
    Account searchAccount(int accountNumber) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber() == accountNumber)
                return accounts[i];
        }
        return null;
    }

    // add a branch level transaction to the daily log resizing when needed
    void addToAllTransactions(Transaction t) {
        if (t == null)
            return;
        if (allTransactionsCount >= allTransactions.length) {
            Transaction[] newArr = new Transaction[allTransactions.length * 2];
            System.arraycopy(allTransactions, 0, newArr, 0, allTransactions.length);
            allTransactions = newArr;
        }
        allTransactions[allTransactionsCount] = t;
        allTransactionsCount++;
    }

    // perform withdrawal via account and mirror transaction to branch log if
    // successful
    void withdraw(int accountNumber, double amount) {
        Account a = searchAccount(accountNumber);
        if (a == null) {
            System.out.println("Account not found");
            return;
        }
        double before = a.getBalance();
        a.withdraw(amount);
        if (a.getBalance() != before) {
            addToAllTransactions(a.getLastTransaction());
        }
    }

    // perform deposit via account and mirror transaction to branch log if
    // successful
    void deposit(int accountNumber, double amount) {
        Account a = searchAccount(accountNumber);
        if (a == null) {
            System.out.println("Account not found");
            return;
        }
        double before = a.getBalance();
        a.deposit(amount);
        if (a.getBalance() != before) {
            addToAllTransactions(a.getLastTransaction());
        }
    }

    // fetch and print account statement for given date range
    void getAccountStatement(int accountNumber, LocalDate start, LocalDate end) {
        Account a = searchAccount(accountNumber);
        if (a == null) {
            System.out.println("No transactions found");
            return;
        }
        a.getStatementByDate(start, end);
    }

    // run end of day tasks apply lifecycle and post interest only on first day of
    // month
    void generateEODReport() {
        System.out.println("\n--- EOD Report (Today's Transactions) ---");

        for (int i = 0; i < accountCount; i++) {
            Account a = accounts[i];

            a.accountLifeCycle();

            // Apply interest only on the FIRST DAY OF MONTH
            LocalDate today = LocalDate.now();
            if (today.getDayOfMonth() == 1) {
                double interest = a.calculateInterest();
                if (interest != 0) {
                    a.balance += interest;
                    String type = interest > 0 ? "CREDIT" : "DEBIT";
                    a.addTransaction(Math.abs(interest), type, "Interest Applied");
                    addToAllTransactions(a.getLastTransaction());
                }
            }
        }

        if (allTransactionsCount == 0) {
            System.out.println("No transactions today.");
        } else {
            for (int i = 0; i < allTransactionsCount; i++) {
                Transaction t = allTransactions[i];
                System.out.println("Acc:" + t.accountNumber + " | " + t.toString());
            }
            System.out.println("Total Txns Today: " + allTransactionsCount);
        }
        System.out.println("------------------");
    }

}

class BankController {
    BankModel bm;

    BankController(BankModel bm) {
        this.bm = bm;
    }

    // create account from supplied data and add to model
    void openAccount(Object[] data) {

        int type = (int) data[0];
        int id = (int) data[1];
        String name = (String) data[2];
        String email = (String) data[3];
        String mobile = (String) data[4];
        double balance = (double) data[5];
        Account newAcc = null;
        switch (type) {
            case 1:
                newAcc = new SavingsAccount(id, name, email, mobile, balance);
                break;
            case 2:
                newAcc = new SalaryAccount(id, name, email, mobile, balance);
                break;
            case 3:
                double overdraft = (double) data[6];
                newAcc = new CurrentAccount(id, name, email, mobile, balance, overdraft);
                break;
            case 4:
                newAcc = new LoanAccount(id, name, email, mobile, balance);
                break;
        }

        bm.openAccount(newAcc);

    }

    // forward deposit request to model
    void deposit(int accountNumber, double amount) {
        bm.deposit(accountNumber, amount);
    }

    // forward withdraw request to model
    void withdraw(int accountNumber, double amount) {
        bm.withdraw(accountNumber, amount);
    }

    // request statement for account within date range
    void getStatement(int accNo, LocalDate start, LocalDate end) {
        bm.getAccountStatement(accNo, start, end);
    }

    // trigger model eod processing and report generation
    void generateReport() {
        bm.generateEODReport();
    }
}

class BankView {
    Scanner sc;
    BankController controller;

    BankView(BankController controller) {
        this.controller = controller;
        this.sc = new Scanner(System.in);
    }

    void start() {
        boolean running = true;
        while (running) {
            int choice = showMainMenu();
            switch (choice) {
                case 1:
                    Object[] data = getNewAccountDetails();
                    controller.openAccount(data);
                    break;
                case 2:
                    int depId = getAccountNumberInput();
                    double depAmt = getAmountInput();
                    controller.deposit(depId, depAmt);
                    break;
                case 3:
                    int witId = getAccountNumberInput();
                    double witAmt = getAmountInput();
                    controller.withdraw(witId, witAmt);
                    break;
                case 4:
                    controller.generateReport();
                    break;
                case 5:
                    int id = getAccountNumberInput();
                    System.out.print("Enter Start Date (YYYY-MM-DD): ");
                    LocalDate s = LocalDate.parse(sc.next());
                    System.out.print("Enter End Date (YYYY-MM-DD): ");
                    LocalDate e = LocalDate.parse(sc.next());
                    controller.getStatement(id, s, e);
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    displayMessage("Invalid option");
            }
        }
    }

    // display main menu and return user choice
    int showMainMenu() {
        System.out.println("\n1. Open Account");
        System.out.println("2. Deposit / Repay Loan");
        System.out.println("3. Withdraw");
        System.out.println("4. Generate EOD Report");
        System.out.println("5. Get Account Statement (Date Range)");
        System.out.println("6. Exit");
        System.out.print("Select Option: ");
        return sc.nextInt();
    }

    // prompt for account number input
    int getAccountNumberInput() {
        System.out.print("Enter Account Number: ");
        return sc.nextInt();
    }

    // prompt for amount input
    double getAmountInput() {
        System.out.print("Enter Amount: ");
        return sc.nextDouble();
    }

    // collect data required to create new account including overdraft when needed
    Object[] getNewAccountDetails() {
        System.out.print("Enter Account Type (1-Savings 2-Salary 3-Current 4-Loan): ");
        int type = sc.nextInt();

        System.out.print("Enter Account Number: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Mobile: ");
        String mobile = sc.nextLine();

        System.out.print("Enter Opening Balance (or Loan Amount): ");
        double balance = sc.nextDouble();

        double od = 0.0;
        if (type == 3) {
            System.out.print("Enter Overdraft Limit: ");
            od = sc.nextDouble();
        }

        return new Object[] { type, id, name, email, mobile, balance, od };
    }

    // simple message display helper
    void displayMessage(String msg) {
        System.out.println(">> " + msg);
    }
}

class Test {
    public static void main(String[] args) {
        BankModel bm = new BankModel("BR001");
        BankController controller = new BankController(bm);
        BankView view = new BankView(controller);
        // seed sample historical data before starting the UI
        DataSeeder.seed(bm);
        view.start();
    }
}
