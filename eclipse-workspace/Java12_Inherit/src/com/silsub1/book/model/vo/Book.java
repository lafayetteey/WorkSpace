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
		//클래스의 풀 패키지 명과 객체의 해쉬코드를 16진수로 변환하여 리턴하는 메소드
		return title + ", " + author + ", " + price;
	}
	
	//동등성 .equals()
	//두 객체의 주소값을 비교하여 같으면 true, 다르면 false를 리턴
	//객체가 가진 값까지 비교하기 위한 목적으로 오버라이딩
	@Override
	public boolean equals(Object obj) {
		//주소가 같으면 같은객체
		if(this == obj ) {
			return true;
		}
		//전달 받은 객체가 null 인경우 false
		if(obj == null) {
			return false;
		}
		//전달받은 객체를 형변환 하여 각 필드별로 비교시작
		Book other = (Book) obj;
		
		//field비교
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
		
		//기본 자료형의 경우 값만 일치 하는지 비교 (int 등)
		if(price != other.price) {
			return false;
		}
		
		//모든 조건을 통과 하면 두객체는 같은객체 이므로
		return true;
	}
	
	//hashcode 재정의를 통해 다른 객체의 주소값을 동일하게 맞춰준다
	//hashcode : 객체 주소값의 정수
	@Override
	public int hashCode() {
		return (title+author+price).hashCode();
	}
	
	
}
