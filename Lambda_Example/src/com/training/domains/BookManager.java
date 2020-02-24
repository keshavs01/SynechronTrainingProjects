package com.training.domains;

import java.util.*;

public class BookManager {
	
	private List<Book> bookList;
	
	public List<Book> initBooks(){
		this.bookList = new ArrayList<>();	
		this.bookList.add(new Book(100,"First book","First Author", 230));
		this.bookList.add(new Book(101,"Second book","Second Author", 430));	
		return this.bookList;
	}
	
	public List<Book> addBooks(Book ...books){
		for(Book eachbook:books){
			this.bookList.add(eachbook);
		}
		return this.bookList;
	}
	
	public List<Book> getBooks(){
		return this.bookList;
	}

}