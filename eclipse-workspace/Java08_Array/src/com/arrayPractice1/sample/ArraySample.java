package com.arrayPractice1.sample;

import java.util.Random;
import java.util.Scanner;

public class ArraySample {

	public void test1() {
		int num[] = new int[10];
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 100) + 1;

			sum += num[i];

		}
		System.out.println(sum);
	}

	public void test2() {
		// 10���� ���ڰ� �� num �迭 ����
		int[] num = new int[10];

		for (int i = 0; i < num.length; i++) {
			// 10���� ������ ���� ����
			num[i] = (int) (Math.random() * 100) + 1;
			System.out.println(i + "��° �� ����: " + num[i]);
		}
		// 0��° �迭�� ������ min �� max�� �ʱ�ȭ
		int min = num[0];
		int max = num[0];
		System.out.println("0�� �迭�� ������ �ʱ�ȭ �� ���� min�� ��: " + min);
		System.out.println("0�� �迭�� ������ �ʱ�ȭ �� ���� max�� ��: " + max);

		for (int i = 0; i < num.length; i++) {
			// num[i]�� ���� max���� ũ�� max ������ ��´�.
			if (max < num[i]) {
				max = num[i];
				// num[i]�� ���� min���� ������ min������ ��´�.
			} else if (min > num[i]) {
				min = num[i];
			}

		}
		System.out.println("�ִ밪: " + max);
		System.out.println("�ּҰ�: " + min);

	}

	public void test3() {
		Random rd = new Random();
		byte[] bt = new byte[10];
		int sum = 0;

		for (byte i = 0; i < bt.length; i++) {
			bt[i] = (byte) (rd.nextInt(Byte.MAX_VALUE));
			if (bt[i] % 2 == 0) {
				sum += bt[i];
			}
		}
		System.out.println("¦���� ��: " + sum);
	}

	public void test3_1() {
		Random rd = new Random();
		byte[] barr = new byte[10];
		int sum = 0;

		for (int i = 0; i < barr.length; i++) {
			barr[i] = (byte) (rd.nextInt(Byte.MAX_VALUE));
			if (barr[i] % 2 == 0) {
				sum += barr[i];
			}
		}
		System.out.println("�������� ¦���� ��: " + sum);
	}

	public void test4() {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		System.out.print("���� �Է�: ");
		String value = sc.next(); // ������ ���ڸ� �޴´�
		// sc.nextLine() : ���鵵 ���� ���ڷ� �ν��ؼ� �޴´�.
		// value�� null���� �ƴϰ� ���̰� 0�� �ƴѰ��(���ڰ� ���°��)
		if (value != null && value.length() > 0) {
			for (int i = 0; i < value.length(); i++) {
				// endIndex �������� �߶�´�
				// ex) 3�� �Է��ϸ� 0,1,2 ���� �߶�´�.
				// �Ʒ� �ڵ�� for���� ���鼭 �����Ǵ� i�� 0�ε����� �߶���ٴٴ� ��
				String str = value.substring(i, i + 1);
				// ���ڿ��� ���ϴ� Ÿ������ parse ���ش�.
				// Integer.parseInt() , Double.parseDouble()
				int num = Integer.parseInt(str);
				sum += num;
			}
		} else {
			System.out.println("�Էµ� ���� �����ϴ�.");
		}
		System.out.println("�հ�: " + sum);
	}

	// charAt() �� �̿��ؼ� �Է¹��� ���ڿ��� ���� ���� ����
	public void test5() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.print("���� �Է�: ");
		String val = sc.next();
		for (int i = 0; i < val.length(); i++) {
			//������ �����ڵ� ���� ���ϴ� ��¹�
			//-48�� �����ڵ� ���� ���ڸ� ���� ������ ���� �� �ִ�.
			//System.out.println( (int)val.charAt(i)-48 );
			sum += (int)val.charAt(i) - 48;
		}
		System.out.println("�հ�: " + sum);
	}

	public void test4_1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		String val = sc.next();
		
		int sum = 0;
		
		if(val != null && val.length()>0) {
			for(int i=0; i<val.length(); i++) {
				String str = val.substring(i, +i);
				int parse = Integer.parseInt(str);
				sum += parse;
			}
		} else {
			System.out.println("���ڿ��� �ƴմϴ�.");
		}
		System.out.println("�հ�: " + sum);
	}

	public void test5_1() {
		Scanner sc = new Scanner(System.in) ;
		System.out.print("���� �Է�: ");
		String val = sc.next();
		
		int sum = 0;
		for(int i=0; i<val.length(); i++) {
			//���ڿ��� �����ڵ� -48 (ex: 1�� �����ڵ�� 49 �̹Ƿ�
			//-48�� ������ 1�� ��µȴ�.
			int num = (int)(val.charAt(i) - 48) ;
			sum += num;
		}
		System.out.println("�հ�: " + sum);
	}

	public void test6() {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է�: ");
		String val = sc.next();
		
		if(val != null && val.length() > 0) {
			for(int i =0; i<val.length(); i++) {
				String str = val.substring(i , i+1);
				int num = Integer.parseInt(str);
				sum += num;
			}
		} else {
			System.out.println("���ڿ��� �ƴմϴ�.");
		}
		System.out.println("�Է��� ���ڿ��� �հ� : "+sum);
	}

	public void test7() {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int sum = 0;
		
		for(int i =0; i<str.length(); i++) {
			int num = (int) (str.charAt(i) - 48) ;
			sum += num;
		}
		System.out.println("�հ�: " + sum);
	}

	public void test8() {
		Random rd = new Random();
		byte arr[] = new byte[10];
		
		int sum =0;
		
		for(int i =0 ; i<arr.length; i++) {
			arr[i] = (byte) (rd.nextInt(Byte.MAX_VALUE));
			if(arr[i]%2==0) {
				sum += arr[i];
			} 	
	}
		System.out.println("¦������ �� : " + sum);
}

}


