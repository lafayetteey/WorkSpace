package com.silsub1.example_0401;

import java.util.Scanner;

public class ForWhile {
	Scanner sc = new Scanner(System.in);
	
	public void printStar1() {
		System.out.print("���� �ϳ� �Է�: ") ;	
		int num =sc.nextInt();
		//�ٱ��� for���� ���ǹ��� ���� ������ �������� ����
			for(int i = 1; i <=num; i++) {
				for(int j = 1; j<=num; j++) {
					if(num>0) {
						if(i == j) {
							System.out.print(j);
						} else {
							System.out.print("*");
						}
					} else {
						System.out.println("����� �ƴմϴ�.");
					}
				}
				System.out.println();
			}		
		}

	
	public void printStar1_1() {
		System.out.print("���� �Է�: ");
		int num = sc.nextInt();
		if(num>0) {
			for(int r =1; r<=num; r++) {
				for(int j =1; j<=r; j++) {
					if(r==j) {
						System.out.print(j);
					} else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("����� �ƴմϴ�.");
		}
	}
	public void printStar2() {
		System.out.print("���� �ϳ� �Է�: ");
		int num = sc.nextInt();
	
		if(num>0) {
			for(int i =1; i<=num; i++) {
				for(int j =1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else {
			for(int i= 1; i<=Math.abs(num); i++) {
				for(int j = Math.abs(num); j>=i; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		} 
		if(num==0) {
			System.out.println("��� ����� �����ϴ�.");
		}	
	}
	
	public void selectMenu() {
		

	}
	public void countinputCharacter() {
	/*[���� 4]
			  : ���ڿ� ���� �Է¹ް�, �� ���� ���� �ϳ��� �Է¹޾�,
			   ���ڿ� �� �ȿ� �Է¹��ڰ� �� �� �����ϴ��� �� ������ �����
			   ��, �����ڸ� �Է¹޵��� ��.
			 - �޼ҵ�� : public void countInputCharacter(){}
				ex>
				���ڿ� �Է� : application
				���� �Է� : p
				���Ե� ���� : 2 ��
				====================
				���ڿ� �Է� : apple_test123
				�����ڰ� �ƴմϴ�.*/
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();
		System.out.print("���� �Է�: ");
		char ch = sc.next().charAt(0);
		
		int count = 0;
		
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'z') {
				char ch1 = str.charAt(i);
				if (ch1==ch){
					count ++;			
				}
			} else {
				System.out.println("�����ڰ� �ƴմϴ�.");	
				break;
			}
		}
		System.out.println("���Ե� ����: " + count);	
	}
	
	public void countCharacters() {
		System.out.print("���ڿ� �Է�: ");
		String str = sc.nextLine();
		System.out.print("���� �Է�: ");
		char ch = sc.next().charAt(0);
		
		int count = 0;
		for(int i =0 ; i<str.length(); i++) {
			//�����ڵ�
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'z' ) {
				char ch1 = str.charAt(i);
				if(ch1 == ch) {
					count++;
				}
			} else {
				System.out.println("�����ڰ� �ƴմϴ�.");
				System.exit(0);
			}
			
		}
		
		System.out.println("���Ե� ����: " + count);
	}
	
}


