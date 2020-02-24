package com.training;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Factorial implements Callable<Integer> {

	private Integer number;

	public Factorial(Integer number) {
		super();
		this.number = number;
	}



	@Override
	public Integer call() throws Exception {
		int result = 1;
		if(this.number ==0 || this.number == 1) {
			return 1;
		} else {
			for(int i=2;i <=this.number; i++) {
				result *= i;
				TimeUnit.MILLISECONDS.sleep(50);
			}
		}
		return result;
	}

}
