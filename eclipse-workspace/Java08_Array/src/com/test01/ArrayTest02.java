package com.test01;

public class ArrayTest02 {
	public static void main(String[] args) {
		//1. a~z ���� ������ �� ������ �迭 ���
		
		char[] ch = new char[26];
		for(int i =0; i<ch.length; i++) {
			//ch������ a~z���� ����
			//a�� int �����ڵ�� ��ȯ �� �ٽ� char ������ ����Ÿ�Ժ�ȯ
			ch[i] = (char) ((int) ('a' +i));
		}
		
		
		//prn(ch);
		
		//2. 1������ ���� �迭�� �Ųٷ� ���
		//3. 1������ ���� �迭�� �빮�ڷ� �ٲپ� ���
		upper(ch);
	}
	
	private static void upper(char[] ch) {
		char[] up = new char[26];
		for(int i =0 ; i<ch.length; i ++) {
		//�ƽ�Ű �ڵ� ����
		//�빮�ڿ� �ҹ����� ���� �� ��ŭ ch[i]���� ���ش�.
		//(int) ��ȯ �ʼ�.
		ch[i] = Character.toUpperCase(ch[i]);
		//ch[i] = (char)((int) ch[i]- 35);
		}
		prn(ch);
	}

	private static void reverse(char[] ch) {
		char[] re = new char[26];
		int temp = 0;
		//�ε����� 0 ���� �����ϱ� ������ -1�� ����� �Ѵ�.
		//ex) 26�ε����� �� �ε����� 25��
		for(int i = ch.length -1; i>=0; i--) {
			re[temp] = ch[i];
			temp++;					
		}
		prn(re);
	}

	public static void prn(char[] ch) {
		for(int i =0; i<ch.length; i++) {
			System.out.print(ch[i] + " ");
			if(i%6==5) {
				System.out.println();
			}
		}
		System.out.println();
		
	}
	
}
