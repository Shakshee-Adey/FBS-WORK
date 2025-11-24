# Java Case Study 1 - Bank

## Table of contents
- [Overview](#overview)  
- [Features](#features)  
- [Architecture](#architecture)  
- [Project files](#project-files)  
- [How the code flows](#how-the-code-flows)  
  - [Open account flow](#open-account-flow)  
  - [Deposit flow](#deposit-flow)  
  - [Withdraw flow](#withdraw-flow)  
  - [End of day (EOD) flow](#end-of-day-eod-flow)  
  - [Account statement by date range](#account-statement-by-date-range)  
- [Class and method reference (brief)](#class-and-method-reference-brief)  
  - [Transaction](#transaction)  
  - [Account (abstract)](#account-abstract)  
  - [SavingsAccount](#savingsaccount)  
  - [SalaryAccount](#salaryaccount)  
  - [CurrentAccount](#currentaccount)  
  - [LoanAccount](#loanaccount)  
  - [BankModel](#bankmodel)  
  - [BankController](#bankcontroller)  
  - [BankView](#bankview)  
- [How to compile and run](#how-to-compile-and-run)  
- [Design notes and limitations](#design-notes-and-limitations)  
- [Next improvements (suggestions)](#next-improvements-suggestions)  
- [Source code](#source-code)

---

## Overview
this is a small console based banking case study implemented in java following an mvc pattern the system supports multiple account types and basic branch level operations transactions are recorded at account level and mirrored to branch level for eod reporting

---

## Features
- open accounts savings salary current and loan  
- deposit and withdraw operations with business rules per account type  
- loan repayment via deposit into loan account with automatic loan closure  
- branch level daily transaction log and end of day report  
- interest posting only on the first day of each month  
- account statement retrieval for a specified date range  

---

## Architecture
the project follows mvc separation of concerns

- model `BankModel Account subclasses Transaction` contains business logic and data  
- controller `BankController` mediates between view and model and forwards user actions  
- view `BankView` handles console input output and drives the application loop

data relationships
- branch has many accounts  
- account has many transactions  

---

## How the code flows

### open account flow
1 view collects account details and account type and passes an object array to controller  
2 controller constructs the correct account subclass and calls model openAccount  
3 model stores the account in the branch accounts array and prints confirmation

### deposit flow
1 view asks for account number and amount then calls controller.deposit  
2 controller forwards to model.deposit  
3 model finds account invokes account.deposit which updates balance and adds an account transaction  
4 model then mirrors the account transaction to the branch allTransactions log

### withdraw flow
1 view asks for account number and amount then calls controller.withdraw  
2 controller forwards to model.withdraw  
3 model finds account invokes account.withdraw on the account which checks canWithdraw and status then updates balance and adds an account transaction  
4 model mirrors account transaction to branch log if balance changed

### end of day (eod) flow
1 view triggers controller.generateReport  
2 controller forwards to model.generateEODReport  
3 model iterates accounts calls accountLifeCycle for each account  
4 model applies interest only if current day is first day of month it calls calculateInterest on each account and if non zero it posts the interest to balance creates an account transaction and mirrors it to branch log  
5 model prints the branch level transaction summary for the day

### account statement by date range
1 view collects account number start and end dates and calls controller.getStatement  
2 controller forwards to model.getAccountStatement  
3 model locates the account and calls account.getStatementByDate which prints transactions in the range

---

## Class and method reference (brief)

### Transaction
- constructor sets transaction fields and date  
  small purpose create a single transaction record used by account and branch logs

### Account (abstract)
- `deposit(amount)` deposit funds if account not freeze or closed add a transaction update lifecycle  
- `withdraw(amount)` final method apply withdrawal only if account state and canWithdraw permit and add transaction then lifecycle  
- `getStatementByDate(start,end)` final method prints transactions for specified date range and a small summary  
- `addTransaction(amount,type,remark)` ensure internal array capacity create transaction record and append  
- `getLastTransaction()` return most recent transaction or null  
- `canWithdraw(amount)` abstract account specific withdrawal rule  
- `accountLifeCycle()` abstract account specific lifecycle checks such as min balance or inactive detection  
- `calculateInterest()` abstract return interest amount positive for credit negative for debit it is posted by model only on day 1 of month

### SavingsAccount
- constructor sets status to inactive if opening balance below min balance  
- `canWithdraw` enforces minimum balance rule  
- `accountLifeCycle` sets status active or inactive based on min balance  
- `calculateInterest` returns interest amount based on configured interestRate this value is used by model when posting interest

### SalaryAccount
- tracks `lastTransactionDate` updates it in overridden addTransaction  
- `canWithdraw` disallows if account inactive by inactivity rule otherwise ensure non negative balance  
- `accountLifeCycle` computes months since last transaction and sets status to inactive and notifies user when needed  
- `calculateInterest` returns zero in current model  
- `notifyUser` prints an inactivity notification

### CurrentAccount
- holds overdraftLimit and interest on overdraft  
- `canWithdraw` allows withdrawal up to overdraft limit  
- `accountLifeCycle` freezes account when balance breaches overdraft beyond limit  
- `calculateInterest` returns negative interest amount when balance negative representing cost to customer

### LoanAccount
- opening balance is negative loan amount amountRepaid tracked on deposits  
- `deposit` overridden to behave as loan repayment updates amountRepaid and if balance reaches zero mark loan cleared and close account  
- `accountLifeCycle` checks and marks loan cleared if applicable  
- `calculateInterest` returns negative interest on outstanding loan using interestRate

### BankModel
- `openAccount(account)` add account into branch resizing array when needed  
- `closeAccount(accountNumber)` mark account status closed  
- `searchAccount(accountNumber)` linear search for account  
- `addToAllTransactions(transaction)` append branch level transaction resizing array as needed  
- `withdraw(accountNumber,amount)` find account call account.withdraw and mirror last transaction if balance changed  
- `deposit(accountNumber,amount)` find account call account.deposit and mirror last transaction if balance changed  
- `getAccountStatement(accountNumber,start,end)` find account and call its getStatementByDate which prints statement  
- `generateEODReport()` run lifecycle checks post interest only on first day of month mirror interest transactions to branch log and print branch transactions summary

### BankController
- `openAccount(data)` build specific account subclass from view supplied data and call model.openAccount  
- `deposit(accountNumber,amount)` forward deposit request to model  
- `withdraw(accountNumber,amount)` forward withdraw request to model  
- `getStatement(accNo,start,end)` forward statement request to model  
- `generateReport()` forward eod request to model

### BankView
- user driven console interface with start main menu and helper input methods  
- `start()` drives main loop collects user input and calls controller methods  
- `getNewAccountDetails()` collect info for account creation including overdraft for current accounts  
- `getAccountNumberInput()` `getAmountInput()` prompt for inputs used by controller

---

