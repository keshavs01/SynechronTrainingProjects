package com.training;

public class PrintingTask implements Runnable {

	private String str1;
	private String str2;
	public PrintingTask(String str1, String str2) {
		super();
		this.str1 = str1;
		this.str2 = str2;
		Thread td = new Thread(this);
		td.start();
	}
	
	@Override
	public void run() {
		PrintStrings.printStrings(str1, str2);
	}

}
