package com.test01.model;

public class Book {
	//field
	private String title;
	private String author;
	private String publisher;
	private int price;
	
	//constructor
	//객체 생성 시 필드값 초기화
	public Book() {		
	}
	
	public Book(String title, String author, String publisher, int price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
	
	//getter (리턴값 있음)
	public String getTitle() {
		return title;
	}
	//setter (리턴값 없음)
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int Price) {
		this.price = price;
	}
	
	//정보 메소드
	public String info() {
		return title + ", " + author + ", " + publisher + ", " + price;		
	}
}
