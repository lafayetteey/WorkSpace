
package com.test01.run;

import java.util.Scanner;

import com.test01.model.Book;

public class ObjectArrayTest {

	public static void main(String[] args) {
		//��ü �迭 ���� �� �Ҵ�
		//Ŭ������ �迭�� = new Ŭ������[];
		
//		Book[] bk = new Book[3];
//		�ʱ�ȭ
//		�迭�ȿ��� Ŭ�������� ��ü�� �����մ�.
//		bk[0] = new Book();
//		bk[1] = new Book();
//		bk[2] = new Book();
		
		
		//���� �� �Ҵ�� ���ÿ� �ʱ�ȭ
		Book[] bk = { 
				new Book("�ڹ��� ����", "ȫ�浿" ,"����" , 10000), 				
				new Book("C����� ����", "�����" , "KH", 210000) , 				
				new Book("���α׷���" , "�̼���" , "���̿���ġ" , 3000) 
				};
		
		
		//���
//		System.out.println(bk);
//		System.out.println(bk[0]);
//		System.out.println(bk[0].getTitle());
//		System.out.println(bk[1]);
//		System.out.println(bk[1].getTitle());
		
		
		//�������
		System.out.println("���� ���� : " + bk.length);
		//�������� ���
		for(int i=0; i<bk.length; i++) {
		System.out.println(bk[i].info());
		}
		
		//�����˻�
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� å ���� : ");
		String sTitle = sc.nextLine();
		
		for(int i=0; i<bk.length; i++) {
			if(bk[i].getTitle().equals(sTitle)) {
				System.out.println(bk[i].info());
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
