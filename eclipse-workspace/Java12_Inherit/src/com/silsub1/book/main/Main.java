package com.silsub1.book.main;

import com.silsub1.book.model.vo.Book;

public class Main {

	public static void main(String[] args) {
		//Book��ü ����
		Book b1 = new Book("������ ����" , "������" , 100);
		Book b2 = new Book("�̰��� �ڹٴ�" , "�����" , 17000);
		
		//toString() �� ��ü ȣ�� �� �ڵ����� JVM�� �ڿ� ����
		System.out.println("b1= " + b1.toString());
		System.out.println("b2= " + b2.toString());
		System.out.println("------------------------------------------------");
		////
		System.out.println("b1�� b2 �� ���� ��ü? : " + b1.equals(b2));
		
		
		//���� ����(�ּҰ��� ����)
		Book b3 = b1;
		System.out.println("b1�� b3 �� ���� ��ü? : " + b1.equals(b3));
		
		
		Book b4 = new Book("������ ����", "������" , 100);
		System.out.println("b1�� b4�� ���� ��ü? : " + b1.equals(b4));
		
		
		//
		System.out.println("b1�� hashcode :" + b1.hashCode());
		System.out.println("b4�� hashcode :" + b4.hashCode());
		
	
		
	}

}
