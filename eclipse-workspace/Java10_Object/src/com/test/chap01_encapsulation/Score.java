package com.test.chap01_encapsulation;


public class Score {
	//field
	private String name;
	private int kor =90;
	private int eng = 84;
	private int mat = 97;


	public Score() {
	}
	
	//������ ���Ͽ� ����ϴ� �޼ҵ�
	public void sum() {
		System.out.println("����: " + (kor+eng+mat));
	}
	//����� ���Ͽ� ����ϴ� �޼ҵ�
	public void avg1() {

		System.out.println("���: " + (kor + eng + mat) /3.0);
	}
	//���ϳ��� ������ ���� ������ ã�� �޼ҵ�
	public void maxPoint() {
		
		if(kor>eng && kor >mat) {
			System.out.println("��� ���� ���� ����");
		} else if(eng>kor && eng > mat) {
			System.out.println("��� ���� ���� ����");
		} else {
			System.out.println("������ ���� ���� ����");
		}
		
	}
	//���� ���� ������ ���� ������ ã�� �޼ҵ�
	public void minPoint() {
		if(kor<eng && kor < mat) {
			System.out.println("��� ���� ���� ����");
		} else if(eng < kor && eng < mat) {
			System.out.println("��� ���� ���� ����");
		} else {
			System.out.println("������ ���� ���� ����");
		}
		
	}
	//�ʵ尪�� Ȯ���Ҽ��ִ� information() �޼ҵ�
	public void information() {
		System.out.println("name " + name + " kor " + kor + " eng " + eng + " mat " + mat);
	}
}
