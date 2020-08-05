package com.silsub1.model;

import java.util.Scanner;

public class Sample {
	public void munjea1() {
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
			
			iArr[3][3] += iArr[i][3];
			iArr[3][3] += iArr[3][i];
		}
		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j < iArr[i].length; j++) {
				System.out.print("\t" + iArr[i][j]);
			}
			System.out.println();
		}

	}

	public void munjea1_1() {
		int[][] iarr = new int[4][4];
		int sum = 0;

		// 1.값기록
		for (int i = 0; i < iarr.length - 1; i++) {
			for (int j = 0; j < iarr[i].length - 1; j++) {
				iarr[i][j] = (int) (Math.random() * 100) + 1;
			}
		}
		// 계산
		for (int i = 0; i < iarr.length - 1; i++) {
			for (int j = 0; j < iarr[i].length - 1; j++) {
				iarr[i][3] += iarr[i][j];
				iarr[3][j] += iarr[j][i];
			}

			iarr[3][3] += iarr[i][3] + iarr[3][i];
		}

		// 출력확인
		for (int i = 0; i < iarr.length; i++) {
			for (int j = 0; j < iarr[i].length; j++) {
				System.out.print(iarr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void munjea2() {
		Scanner sc = new Scanner(System.in);
		int[][] iArr = new int[3][];
		int sum[] = new int[iArr.length];

		for (int i = 0; i < 3; i++) {		
			System.out.print("열의 갯수: ");
			int col = sc.nextInt();
			iArr[i] = new int[col];
			for (int j = 0; j < iArr[i].length; j++) {
				iArr[i][j] = (int) (Math.random() * 100) + 1;
				sum[i] += iArr[i][j];
			}
		}
		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j < iArr[i].length; j++) {
			}
			System.out.println();
		}
		for (int i = 0; i < iArr.length; i++) {
			if (sum[i] % 5 == 0) {
				System.out.println("[" + i + "]열의 합계" +sum[i]);
			} else {
				System.out.println("합계 중 5의 배수가 없습니다.");
			}
		}
	}

	public void munjea3() {
		int iArr[][] = new int[5][5];
		int num = 1; //대입할 숫자를 1로 초기화
		
		for(int i =0; i<iArr.length; i++) {
			if(i%2==0) { //i(행번호)를 2로 나눠서 나머지가 행의 숫자가 0인 경우(즉 0번째,2번째,4번째 행인 경우)
				for(int j = 0; j<iArr[i].length; j++) {
					iArr[i][j] = num;
					num++;
				}
			} else { //i(행번호)를 2로 나눠서 나머지가 0이 아닌 경우, 즉 1번째 , 3번째 행인 경우
				for(int j=4; j>=0; j--) {
					iArr[i][j] = num;
					num++;
				}
			}
		}
		for(int i =0 ; i<iArr.length; i++) {
			for(int j =0; j<iArr[i].length; j++) {
				System.out.print(iArr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	
	public void munjea4() {
		int iArr[][] = new int[5][5];
		int num = 1;
		
		for(int i =0; i<iArr.length; i++) {
			if(i%2==0) { //0/2/4행
				for(int j=0; j<iArr[i].length; j++) {
					iArr[i][j] = num;
					num++;
				}
		} else {
			for(int j=4; j>=0; j--) {
				iArr[i][j] = num;
				num++;
			}
		}	
	}
		for(int i=0; i<iArr.length; i++) {
			for(int j=0; j<iArr[i].length; j++) {
				System.out.print(iArr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

	public void munjea5() {
		
		int[][] iArr = new int[5][5];
		int result = 1;
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				iArr[j][i] = result;
				result++;
			}
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++ ) {
				System.out.print(iArr[i][j] + "\t");
			}
			System.out.println();
 		}
	}

	public void Practice1() {
		int[][] iArr = new int[5][5];
		int num = 1;
		
		for(int i =0; i<iArr.length; i++) {
			if(i%2==0) {
				for(int j=0; j<iArr[i].length; j++) {
					iArr[i][j] = num;
					num++;
				}
			} else {
				for(int j=4; j>=0; j--) {
					iArr[i][j] = num;
					num++;
				}
			}
		}
		for(int i=0; i<iArr.length; i++) {
			for(int j=0; j<iArr[i].length; j++) {
				System.out.print(iArr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public void Practice2() {
		int[][] iArr = new int[5][5];
		int num= 1;
		
		for(int i =0 ; i<iArr.length; i++) {
			for(int j=0; j<iArr[i].length; j++) {
				iArr[j][i] = num;
				num++;
			}
		}
		for(int i=0; i<iArr.length; i++) {
			for(int j=0; j<iArr[i].length; j++) {
				System.out.print(iArr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void Practice3 () {
		int[][] iArr = new int [5][5];
		int sum = 1;
		
		for(int i=0; i<iArr.length; i++) {
			if(i%2==0) {
				for(int j=0; j<iArr[i].length; j++) {
					iArr[i][j] = sum;
					sum++;
				}
			} else {
				for(int j = 4; j>=0; j--) {
					iArr[i][j] = sum;
					sum++;
				}
			}
		}
		
		for(int i=0; i<iArr.length; i++) {
			for(int j=0; j<iArr[i].length; j++) {
				System.out.print( iArr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	
	public void Practice4() {
		int iArr[][] = new int[5][5];
		int sum = 1;
		
		for(int i=0; i<iArr.length; i++) {
			for(int j=0; j<iArr[i].length; j++) {
				iArr[j][i] = sum;
				sum++;
			}
		}
		for(int i=0; i<iArr.length; i++) {
			for(int j=0; j<iArr[i].length; j++) {
				System.out.print(iArr[i][j] + "\t");
			}
			System.out.println();
		}
		
  	}
}

