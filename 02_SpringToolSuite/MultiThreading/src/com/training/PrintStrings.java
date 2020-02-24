package com.training;

public class PrintStrings {

	public static void printStrings(String str1, String str2) {
		System.out.println(str1);
		
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(str2);

	}

}
