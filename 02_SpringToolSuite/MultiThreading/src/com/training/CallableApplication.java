package com.training;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableApplication {

	public static void main(String[] args) {
		ExecutorService service = Executors.newSingleThreadExecutor();

//		System.out.println(service);

//		ExecutorService servcice2 = Executors.newFixedThreadPool(2);
		Factorial noFact = new Factorial(11);
		Future<Integer> result = service.submit(noFact);
		

//		if (result.isDone()) {
			try {
				System.out.println("Factorial of 11 = " + result.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//		}
		
		service.shutdown();
	}
}
