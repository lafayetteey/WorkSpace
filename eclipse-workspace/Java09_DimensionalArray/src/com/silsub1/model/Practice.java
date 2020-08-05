package com.silsub1.model;

import java.util.Scanner;

public class Practice {
	public void Practice1() {
//		1. 4행4열 2차원배열 선언 및 생성
//		2. 0행0열부터 2행2열까지 1부터 100사이의 임의의 정수값 기록해 넣음
//		3. 아래의 내용처럼 처리함
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
			System.out.print("열의 갯수 입력: ");
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
				System.out.println("[" + i + "] 열의 합은: " + sum[i]);
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
			System.out.print("열 갯수를 입력하세요: ");
			int num = sc.nextInt();
			iArr[i] = new int[num];
			for (int j = 0; j < iArr[i].length; j++) {
				iArr[i][j] = (int) (Math.random() * 100) + 1;
				sum[i] = iArr[i][j];
			}
		}

		for (int i = 0; i < iArr.length; i++) {
			if (sum[i] % 5 == 0) {
				System.out.print("[" + i + "]의 합계는 :" + sum[i]);
			}

			System.out.println();
		}

	}

	public void test3() {
		int iarr[][] = new int[3][];
		Scanner sc = new Scanner(System.in);
		int[] sum = new int[iarr.length];
		// 3행짜리 배열은 이미 만들어져잇으니 건드릴필요는 없다.

		for (int i = 0; i < iarr.length; i++) {
			System.out.print(i + "번째 1차원 배열 수: ");
			iarr[i] = new int[sc.nextInt()];
			// 값기록
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
				System.out.print(i + "행: " + sum[i]);
			}
 		}
	}
}
