package com.test01;

public class DeArrayTest {
	public void testInit() {
		// 2���� �迭�� ����
		// ������ �ϰ� �Ǹ� stack������ ���۷��� ������ ����
		int[][] iarr1;
		int iarr[][];

		// heap������ 2���� �迭�� �Ҵ��Ѵ�.
		// 3�� 5ĭ�� �迭�� ���� // 3�� 5��
		iarr1 = new int[3][5];

		// 2�迭 ��� �Ҵ��� �ʿ�� ������
		// �׷��� �� �� �迭�� �ݵ�� �Ҵ��ؾ��Ѵ�.
		// �����Ͱ� ����Ǵ� �迭�� ���۷����� �����ϴ� �迭��
		// �ݵ�� ũ�⸦ �����ؾ��Ѵ�.
		iarr = new int[3][];
		// 3��,5ĭ¥�� �迭 ����
		iarr[0] = new int[5];
		iarr[1] = new int[5];
		iarr[2] = new int[5];
		// �ʱⰪ�� ������ jvm �� 0���� ä���.
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(iarr[i][j]);
			}
			System.out.println();
		}
	}

	public void testInit2() {
		// ���� �� �Ҵ��� ���ÿ� ��
		int[][] iarr = new int[3][5];
		// �迭 �ε����� �����Ͽ� �� ���
//		iarr[0][0] = 1;
//		iarr[0][1]= 2;
//		iarr[0][2]= 3;
//		iarr[0][3]= 4;
//		iarr[0][4] = 5;
//		
//		iarr[1][0] = 6;
//		iarr[1][1] = 7;
//		iarr[1][2] = 8;
//		iarr[1][3] = 9;
//		iarr[1][4] = 10;
//		
//		iarr[2][0] =11;
//		iarr[2][1] =12;
//		iarr[2][2] =13;
//		iarr[2][3] = 14;
//		iarr[2][4] = 15;
		
		int val =1;
		for(int i=0; i<iarr.length; i++) {
			for(int j =0; j<iarr[i].length; j++) {
				//val �� 1 ���� ����־� ���� �����ڰ� �ƴ� ���� �����ڸ� ���
				iarr[i][j] =  val++;
			}
		}
		
		PrintArray(iarr);
		
//		
//		for (int i = 0; i < iarr.length; i++) {
//			for (int j = 0; j < iarr[i].length; j++) {
//				System.out.print("\t" + iarr[i][j]);
//			}
//			System.out.println();
//		}	
	}
	
	public void PrintArray(int[][] iarr) {
		for(int i=0; i<iarr.length; i++) {
			for(int j =0; j<iarr[i].length; j++) {
				System.out.print("\t" + iarr[i][j]);
			}
			System.out.println();
		}
	}
		
	public void testInit3() {
		//�����迭(�ึ�� �����ϴ� �迭�� �ٸ� �迭)
		//���۷����� �����ϴ� �迭�� ����
		int [][] iarr = new int[3][];
		
// 		PrintArray(iarr);
		//0��° �࿡ 5�� �迭 ����
		iarr[0] = new int[5];
		//1��° �࿡ 3�� �迭 ����
		iarr[1] = new int[3];
		//2��° �࿡ 10��¥�� �迭����
		iarr[2] = new int[10];
		
		int val =0;
		//iarr �� ���� ��ĭ���� üũ �� j++ 
		for(int i =0; i<iarr.length; i++) {
			for(int j=0; j<iarr[i].length; j++) {
				iarr[i][j] = ++val;
			}
		}
		
	//	PrintArray(iarr);
		
	}

	public void testInit4() {
		//������ �迭�� �Ҵ�� �ʱ�ȭ�� ���ÿ� �� �� �ִ�.
		//3�� 5ĭ¥���� �迭����
//		int [][] iarr = { {1,2,3,4,5}, {6,7,8,9,10} , {11,12,13,14,15} };
		
		//3��¥�� �����迭
		int[][] iarr = 
			{{1,2,3}, {4,5,6,7,8,9}, {10,11,12,13} };
		
		PrintArray(iarr);
	}

	
	
	
}
