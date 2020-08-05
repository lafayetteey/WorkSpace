package com.test01;

public class DeArrayTest {
	public void testInit() {
		// 2차원 배열의 선언
		// 선언을 하게 되면 stack영역에 레퍼런스 변수가 생성
		int[][] iarr1;
		int iarr[][];

		// heap영역에 2차원 배열을 할당한다.
		// 3줄 5칸의 배열을 생성 // 3행 5열
		iarr1 = new int[3][5];

		// 2배열 모두 할당할 필요는 없지만
		// 그러나 행 의 배열은 반드시 할당해야한다.
		// 데이터가 저장되는 배열의 레퍼런스를 보관하는 배열은
		// 반드시 크기를 지정해야한다.
		iarr = new int[3][];
		// 3행,5칸짜리 배열 생성
		iarr[0] = new int[5];
		iarr[1] = new int[5];
		iarr[2] = new int[5];
		// 초기값이 없으면 jvm 이 0으로 채운다.
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(iarr[i][j]);
			}
			System.out.println();
		}
	}

	public void testInit2() {
		// 선언 과 할당을 동시에 함
		int[][] iarr = new int[3][5];
		// 배열 인덱스에 접근하여 값 기록
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
				//val 에 1 값이 들어있어 전위 연산자가 아닌 후위 연산자를 사용
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
		//가변배열(행마다 참조하는 배열이 다른 배열)
		//레퍼런스를 보관하는 배열만 선언
		int [][] iarr = new int[3][];
		
// 		PrintArray(iarr);
		//0번째 행에 5열 배열 생성
		iarr[0] = new int[5];
		//1번째 행에 3열 배열 생성
		iarr[1] = new int[3];
		//2번째 행에 10열짜리 배열생성
		iarr[2] = new int[10];
		
		int val =0;
		//iarr 행 마다 몇칸인지 체크 후 j++ 
		for(int i =0; i<iarr.length; i++) {
			for(int j=0; j<iarr[i].length; j++) {
				iarr[i][j] = ++val;
			}
		}
		
	//	PrintArray(iarr);
		
	}

	public void testInit4() {
		//다차원 배열의 할당과 초기화를 동시에 할 수 있다.
		//3줄 5칸짜리의 배열생성
//		int [][] iarr = { {1,2,3,4,5}, {6,7,8,9,10} , {11,12,13,14,15} };
		
		//3줄짜리 가변배열
		int[][] iarr = 
			{{1,2,3}, {4,5,6,7,8,9}, {10,11,12,13} };
		
		PrintArray(iarr);
	}

	
	
	
}
