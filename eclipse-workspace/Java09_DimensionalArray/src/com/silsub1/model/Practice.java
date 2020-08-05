package com.silsub1.model;

import java.util.Scanner;

public class Practice {
	public void Practice1() {
//		1. 4��4�� 2�����迭 ���� �� ����
//		2. 0��0������ 2��2������ 1���� 100������ ������ ������ ����� ����
//		3. �Ʒ��� ����ó�� ó����
		int[][] iArr = new int[4][4];
		int sum = 0;

		for (int i = 0; i < iArr.length - 1; i++) {
			for (int j = 0; j < iArr[i].length - 1; j++) {
				iArr[i][j] = (int) (Math.random() * 100) + 1;
			}
		}
		for (int i = 0; i < iArr.length - 1; i++) {
			for (int j = 0; j < iArr[i].length - 1; j++) {
				iArr[i][3] += iArr[i][j];
				iArr[3][i] += iArr[j][i];
			}
			iArr[3][3] += iArr[i][3] + iArr[3][i];
		}

		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j < iArr[i].length; j++) {
				System.out.print(iArr[i][j] + "\t");
			}
			System.out.println();
		}

	}

	public void Practice2() {
		Scanner sc = new Scanner(System.in);
		int iArr[][] = new int[3][];
		int sum[] = new int[iArr.length];

		for (int i = 0; i < iArr.length; i++) {
			System.out.print("���� ���� �Է�: ");
			int column = sc.nextInt();
			iArr[i] = new int[column];

			for (int j = 0; j < iArr[i].length; j++) {
				iArr[i][j] = (int) (Math.random() * 100) + 1;
				sum[i] = iArr[i][j];
			}
		}
		System.out.println();

		for (int i = 0; i < iArr.length; i++) {
			if (sum[i] % 5 == 0) {
				System.out.println("[" + i + "] ���� ����: " + sum[i]);
			}
			System.exit(0);
		}
	}

	public void Practice3() {
		int iArr[][] = new int[5][5];
		int sum = 1;

		for (int i = 0; i < iArr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < iArr[i].length; j++) {
					iArr[i][j] += sum;
					sum++;
				}
			} else {
				for (int j = 4; j >= 0; j--) {
					iArr[i][j] += sum;
					sum++;
				}
			}
		}
		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j < iArr[i].length; j++) {
				System.out.print(iArr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}

	public void Practice4() {
		int[][] iArr = new int[5][5];
		int sum = 1;

		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j < iArr[i].length; j++) {
				iArr[j][i] += sum;
				sum++;
			}
		}
		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j < iArr[i].length; j++) {
				System.out.print(iArr[i][j] + "\t");
			}
			System.out.println();
		}

	}

	public void Alphabet() {
		char ch[] = new char[26];

		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char) ((int) 'a' + i);
			System.out.print("\t" + ch[i]);
			if (i % 6 == 5) {
				System.out.println();
			}
		}
		upper(ch);
	}

	public void upper(char[] ch) {
		for (int i = 0; i < ch.length; i++) {
			ch[i] = Character.toUpperCase(ch[i]);
		}
	}

	public void test1() {
		int[][] iArr = new int[4][4];

		for (int i = 0; i < iArr.length - 1; i++) {
			for (int j = 0; j < iArr[i].length - 1; j++) {
				iArr[i][j] = (int) (Math.random() * 100) + 1;
			}
		}
		for (int i = 0; i < iArr.length - 1; i++) {
			for (int j = 0; j < iArr[i].length - 1; j++) {
				iArr[i][3] += iArr[i][j];
				iArr[3][i] += iArr[j][i];
			}
			iArr[3][3] = iArr[i][3] + iArr[3][i];
		}

		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j < iArr[i].length; j++) {
				System.out.print(iArr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void test2() {
		int[][] iArr = new int[3][];
		Scanner sc = new Scanner(System.in);

		int sum[] = new int[iArr.length];

		for (int i = 0; i < iArr.length; i++) {
			System.out.print("�� ������ �Է��ϼ���: ");
			int num = sc.nextInt();
			iArr[i] = new int[num];
			for (int j = 0; j < iArr[i].length; j++) {
				iArr[i][j] = (int) (Math.random() * 100) + 1;
				sum[i] = iArr[i][j];
			}
		}

		for (int i = 0; i < iArr.length; i++) {
			if (sum[i] % 5 == 0) {
				System.out.print("[" + i + "]�� �հ�� :" + sum[i]);
			}

			System.out.println();
		}

	}

	public void test3() {
		int iarr[][] = new int[3][];
		Scanner sc = new Scanner(System.in);
		int[] sum = new int[iarr.length];
		// 3��¥�� �迭�� �̹� ������������� �ǵ帱�ʿ�� ����.

		for (int i = 0; i < iarr.length; i++) {
			System.out.print(i + "��° 1���� �迭 ��: ");
			iarr[i] = new int[sc.nextInt()];
			// �����
			for (int j = 0; j < iarr[i].length; j++) {
				iarr[i][j] = (int) (Math.random() * 100) + 1;
				sum[i] += iarr[i][j];
			}
		}
		
		for(int i=0; i<iarr.length; i++) {
			for(int j=0; j<iarr[i].length; j++) {
				System.out.print(iarr[i][j] + "\t");
			}
			System.out.println();
		}
		
		for(int i =0; i<sum.length; i++) {
			if(sum[i]%5==0) {
				System.out.print(i + "��: " + sum[i]);
			}
 		}
	}
}
