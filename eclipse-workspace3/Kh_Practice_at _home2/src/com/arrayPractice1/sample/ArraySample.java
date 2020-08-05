package com.arrayPractice1.sample;

import java.util.Random;
import java.util.Scanner;

public class ArraySample {
	public void test1() {
		int arr[] = new int[10];
		int count =0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int) (Math.random()*100) +1;
			count += arr[i];
		}
		System.out.println(count);
	}
	
	public void test2() {
		int arr[] = new int[10];
		
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100) +1;
		}
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			} else if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
	
	public void test3() {
		Random rd = new Random();
		byte iarr[] = new byte[10];
		int count = 0;
		for(int i=0; i<iarr.length; i++) {
			iarr[i] = (byte) rd.nextInt(Byte.MAX_VALUE);
		}
		
		for(int i=0; i<iarr.length; i++) {
			if(iarr[i]%2==0) {
				System.out.print(iarr[i] + "\t");
				count += iarr[i];
			}
		}
		System.out.println(count);
	}

	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		String str = sc.next();
		int sum =0;
		if(str !=null && str.length() > 0 ) {
			for(int i =0; i<str.length(); i++) {
				String val = str.substring(i, i+1);
				int num = Integer.parseInt(val);
				sum += num;	
			}
		} else {
			System.out.println("숫자를 입력하세요 ");
		}
		System.out.println(sum);		
	}
	
	public void test5() {
		int[][] iarr = new int[5][5];
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

	public void test6() {
		Scanner sc = new Scanner(System.in);
		int iarr[][] = new int[3][];
		
		
	}
}
