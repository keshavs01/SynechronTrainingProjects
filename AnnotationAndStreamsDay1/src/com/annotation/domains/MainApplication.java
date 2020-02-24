package com.annotation.domains;

public class MainApplication {

	public static void main(String[] args) {
		UsingAnnotations anno = new UsingAnnotations();
		System.out.println(anno.getTable() + anno.selectQuery());
	}

}
