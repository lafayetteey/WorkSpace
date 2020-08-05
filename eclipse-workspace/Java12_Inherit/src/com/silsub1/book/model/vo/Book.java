package com.silsub1.book.model.vo;

import com.silsub1.book.main.Main;

public class Book {
	private String title;
	private String author;
	private int price;
	
	public Book() {
		
	}
	public Book(String title , String author , int price ) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		//Ŭ������ Ǯ ��Ű�� ��� ��ü�� �ؽ��ڵ带 16������ ��ȯ�Ͽ� �����ϴ� �޼ҵ�
		return title + ", " + author + ", " + price;
	}
	
	//��� .equals()
	//�� ��ü�� �ּҰ��� ���Ͽ� ������ true, �ٸ��� false�� ����
	//��ü�� ���� ������ ���ϱ� ���� �������� �������̵�
	@Override
	public boolean equals(Object obj) {
		//�ּҰ� ������ ������ü
		if(this == obj ) {
			return true;
		}
		//���� ���� ��ü�� null �ΰ�� false
		if(obj == null) {
			return false;
		}
		//���޹��� ��ü�� ����ȯ �Ͽ� �� �ʵ庰�� �񱳽���
		Book other = (Book) obj;
		
		//field��
		if(title ==null) {
			if(other.title != null) {
				return false;
			}
		} else if(! title.equals(other.title)) {
			return false;
		}
		if(author == null) {
			if(other.author != null) {
				return false;
			} 
		} else if(! author.equals(other.author)) {
			return false;
		}
		
		//�⺻ �ڷ����� ��� ���� ��ġ �ϴ��� �� (int ��)
		if(price != other.price) {
			return false;
		}
		
		//��� ������ ��� �ϸ� �ΰ�ü�� ������ü �̹Ƿ�
		return true;
	}
	
	//hashcode �����Ǹ� ���� �ٸ� ��ü�� �ּҰ��� �����ϰ� �����ش�
	//hashcode : ��ü �ּҰ��� ����
	@Override
	public int hashCode() {
		return (title+author+price).hashCode();
	}
	
	
}
