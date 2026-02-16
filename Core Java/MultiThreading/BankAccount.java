package multiThreading1;

public class BankAccount {
	
double curentBalance;
	
	public BankAccount(double c) {
		this.curentBalance=c;
	}

	public synchronized void deposit(double amount) {
		System.out.println(" depositing " + amount);
		this.curentBalance = this.curentBalance + amount;
		System.out.println("Balance after deposit: " + this.curentBalance);
		notifyAll();
	}

	public synchronized void withdraw(double amount) {
		System.out.println(" wants to withdraw " + amount);

		while (this.curentBalance < amount) {
			System.out.println("Insufficient funds (" + this.curentBalance + "). Waiting...");
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Withdrawal interrupted");
				return;
			}
		}

		this.curentBalance = this.curentBalance - amount;
		System.out.println("Withdrawn " + amount + ". Balance now: " + this.curentBalance);
	}

	public synchronized double getBalance() {
		return this.curentBalance;
	}


public class WaitNotifyAnonymousDemo {

	public static void main(String[] args) {

		BankAccount account = new BankAccount(5000);
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				account.withdraw(7000);
				System.out.println(" completed withdrawal");
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				account.deposit(5000);
				System.out.println(" completed deposit");
			}
		});
		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
		}

		System.out.println("Final Balance: " + account.getBalance());

	}
}

}
