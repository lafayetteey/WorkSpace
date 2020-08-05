package com.silsub1.model;

import java.util.Scanner;

public class Sample {
	Scanner sc = new Scanner(System.in);
	public void munjea1() {
		int[][] iarr = new int[4][4];
		
		for(int i=0; i<iarr.length-1; i++) {
			for(int j=0; j<iarr[i].length-1; j++) {
				iarr[i][j] = (int)(Math.random()*100) +1;
			}
		}
		for(int i=0; i<iarr.length-1; i++) {
			for(int j=0; j<iarr[i].length -1; j++) {
				iarr[i][3] += iarr[i][j];
				iarr[3][i] += iarr[j][i];
			}
			iarr[3][3] += iarr[i][3] + iarr[3][i];
		}
		
		for(int i=0; i<iarr.length; i++) {
			for(int j=0; j<iarr[i].length; j++) {
				System.out.print(iarr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
				
	}

	public void munjae2() {
		int iarr[][] = new int[3][];
		int sum[] = new int[iarr.length];
		
		for(int i=0; i<iarr.length; i++) {	
			System.out.print("열 갯수 입력 : ");
			iarr[i] = new int[sc.nextInt()];
			for(int j=0; j<iarr[i].length; j++) {
				iarr[i][j] = (int) (Math.random()*100) +1;
				sum[i] = iarr[i][j];
			}
		}
		for(int i=0; i<iarr.length; i++) {	
			if(sum[i]%5==0) {
				System.out.println("[" + i + "] 열의 합계: " + sum[i]);
			}
		}
		System.out.println();
	}

	public void munjae3() {
		int iarr[][] = new int[5][5];
		int count = 1;
		for(int i=0; i<iarr.length; i++) {
			if(i%2==0) {
				for(int j=0; j<iarr[i].length; j++) {
					iarr[i][j] = count;
					count++;
				} 
			} else {
				for(int j=4; j>=0; j--) {
					iarr[i][j] = count;
					count++;
				}
			}		
		}
		for(int i=0; i<iarr.length; i++) {
			for(int j=0; j<iarr[i].length; j++) {
				System.out.print(iarr[i][j] + "\t");
			}
			System.out.println();
		}	
	}
	
	public void munjea4() {
		int iarr[][] = new int[5][5];
		int count = 1;
		for(int i=0; i<iarr.length; i++) {
			for(int j=0; j<iarr[i].length; j++) {
				iarr[j][i] = count;
				count++;
			}
		}
		for(int i=0; i<iarr.length; i++) {
			for(int j=0; j<iarr[i].length; j++) {
				System.out.print(iarr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}
	
}
