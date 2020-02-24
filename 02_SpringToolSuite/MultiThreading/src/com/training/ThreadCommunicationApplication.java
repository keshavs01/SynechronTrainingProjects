package com.training;

public class ThreadCommunicationApplication {
	
	public static void main(String[] args) {
		
		BankAccount ramsAcct = new BankAccount();
		
		Runnable task1 = ()->{
			System.out.println("Acct Balance = "+ramsAcct.withdraw(5000));
		};
		
		Runnable task2 = ()->{
			System.out.println("Acct Balance = "+ramsAcct.deposit(3000));
		};
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start();
		t2.start();
		
	}

}
