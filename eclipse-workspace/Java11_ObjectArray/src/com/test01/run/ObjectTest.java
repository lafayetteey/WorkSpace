package com.test01.run;

import java.util.Scanner;

import com.test01.model.Book;

public class ObjectTest {

	public static void main(String[] args) {
		//1. Book class ��ü 3�� ����
		Book b1 = new Book("�ڹ��� ����" , "ȫ�浿" , "����" , 27000);
		Book b2 = new Book("C����� ����" , "�����" , "KH" , 13000);
		Book b3 = new Book("���α׷���", "�̼���", "���̿���ġ" ,5500);
		
		
		
		//���
//		System.out.println(b1.info());
//		System.out.println(b2.info());
//		System.out.println(b3.info());
		
		//�����˻�
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� å ���� �Է�: ");
		String sTitle = sc.nextLine();
		
		if(b1.getTitle().equals(sTitle)) {
			System.out.println(b1.info());
		} else if(b2.getTitle().equals(sTitle)) {
			System.out.println(b2.info());
		} else if(b3.getTitle().equals(sTitle) ) {
			System.out.println(b3.info());
		}
		
	}

}
