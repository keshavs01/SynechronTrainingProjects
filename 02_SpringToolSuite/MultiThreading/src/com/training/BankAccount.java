package com.training;

public class BankAccount {
	
	private double balance = 3000;
	
	public synchronized double deposit(double amount) {
		this.balance = this.balance + amount;
		notify();
		System.out.println("Ämount Deposited");
		return this.balance;
	}
	
	public synchronized double withdraw(double amount) {
		System.out.println("Withdrawing Balance");
		if(this.balance < amount) {
			System.out.println("Low Balance - Waiting for Deposited");
			try {
				wait();
				System.out.println("Wait OVER");		
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		
		System.out.println("OK - Withdrawing balance");
		
		this.balance = this.balance - amount;
		
		return this.balance;
	}

}
