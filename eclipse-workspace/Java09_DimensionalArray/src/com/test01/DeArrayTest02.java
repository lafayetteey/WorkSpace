package com.test01;

public class DeArrayTest02 {
	public void test01() {
		//구구단을 2차원 배열에 넣어보자
		int[][] dArr = new int[8][9];
	
		
		for(int i =0; i<dArr.length; i++) {
			for(int j=0 ; j<dArr[i].length; j++) {
				
				dArr[i][j] = (i +2) * (j+1);
				System.out.print((i+2) + "*" + (j+1) +"= " + dArr[i][j]+ "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		//
		int[][]arr = new int[8][9];
		int val =1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				val = i*j;
				arr[i][j] = ++val;
				System.out.print("\t" + dArr[i][j]);
			}
			System.out.println();
		}
		
	}
}
