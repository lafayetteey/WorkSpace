package com.test01.model;

public class Book {
	//field
	private String title;
	private String author;
	private String publisher;
	private int price;
	
	//constructor
	//��ü ���� �� �ʵ尪 �ʱ�ȭ
	public Book() {		
	}
	
	public Book(String title, String author, String publisher, int price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
	
	//getter (���ϰ� ����)
	public String getTitle() {
		return title;
	}
	//setter (���ϰ� ����)
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
	
	//���� �޼ҵ�
	public String info() {
		return title + ", " + author + ", " + publisher + ", " + price;		
	}
}
