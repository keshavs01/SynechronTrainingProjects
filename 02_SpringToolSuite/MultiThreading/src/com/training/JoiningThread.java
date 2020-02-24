package com.training;

import java.util.Scanner;

public class JoiningThread {

	public static void main(String[] args) {
		System.out.println("Main Thread start");
		
		Runnable task = ()->{
			System.out.println("Joining Thread");
			Scanner sc = new Scanner(System.in);
			String name = sc.nextLine();
			System.out.println("Joining thread finish");
			
			
		};
		Thread thread = new Thread(task);
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Bye");
		System.out.println("Finish main");
		
	}
	
}
