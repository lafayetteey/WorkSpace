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
		// 10개의 숫자가 들어갈 num 배열 생성
		int[] num = new int[10];

		for (int i = 0; i < num.length; i++) {
			// 10개의 공간에 난수 저장
			num[i] = (int) (Math.random() * 100) + 1;
			System.out.println(i + "번째 들어간 값은: " + num[i]);
		}
		// 0번째 배열의 값으로 min 과 max를 초기화
		int min = num[0];
		int max = num[0];
		System.out.println("0번 배열의 값으로 초기화 한 후의 min의 값: " + min);
		System.out.println("0번 배열의 값으로 초기화 한 후의 max의 값: " + max);

		for (int i = 0; i < num.length; i++) {
			// num[i]의 값이 max보다 크면 max 변수에 담는다.
			if (max < num[i]) {
				max = num[i];
				// num[i]의 값이 min보다 작으면 min변수에 담는다.
			} else if (min > num[i]) {
				min = num[i];
			}

		}
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);

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
		System.out.println("짝수의 합: " + sum);
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
		System.out.println("난수들의 짝수의 합: " + sum);
	}

	public void test4() {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		System.out.print("숫자 입력: ");
		String value = sc.next(); // 오로지 문자만 받는다
		// sc.nextLine() : 공백도 같이 문자로 인식해서 받는다.
		// value가 null값이 아니고 길이가 0이 아닌경우(숫자가 들어온경우)
		if (value != null && value.length() > 0) {
			for (int i = 0; i < value.length(); i++) {
				// endIndex 이전까지 잘라온다
				// ex) 3을 입력하면 0,1,2 까지 잘라온다.
				// 아래 코드는 for문을 돌면서 증가되는 i의 0인덱스만 잘라오겟다는 뜻
				String str = value.substring(i, i + 1);
				// 문자열을 원하는 타입으로 parse 해준다.
				// Integer.parseInt() , Double.parseDouble()
				int num = Integer.parseInt(str);
				sum += num;
			}
		} else {
			System.out.println("입력된 값이 없습니다.");
		}
		System.out.println("합계: " + sum);
	}

	// charAt() 을 이용해서 입력받은 문자열의 숫자 합을 구함
	public void test5() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.print("숫자 입력: ");
		String val = sc.next();
		for (int i = 0; i < val.length(); i++) {
			//문자의 유니코드 값을 구하는 출력문
			//-48로 유니코드 값의 숫자를 실제 정수로 구할 수 있다.
			//System.out.println( (int)val.charAt(i)-48 );
			sum += (int)val.charAt(i) - 48;
		}
		System.out.println("합계: " + sum);
	}

	public void test4_1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		String val = sc.next();
		
		int sum = 0;
		
		if(val != null && val.length()>0) {
			for(int i=0; i<val.length(); i++) {
				String str = val.substring(i, +i);
				int parse = Integer.parseInt(str);
				sum += parse;
			}
		} else {
			System.out.println("문자열이 아닙니다.");
		}
		System.out.println("합계: " + sum);
	}

	public void test5_1() {
		Scanner sc = new Scanner(System.in) ;
		System.out.print("숫자 입력: ");
		String val = sc.next();
		
		int sum = 0;
		for(int i=0; i<val.length(); i++) {
			//문자열의 유니코드 -48 (ex: 1의 유니코드는 49 이므로
			//-48을 넣으면 1로 출력된다.
			int num = (int)(val.charAt(i) - 48) ;
			sum += num;
		}
		System.out.println("합계: " + sum);
	}

	public void test6() {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력: ");
		String val = sc.next();
		
		if(val != null && val.length() > 0) {
			for(int i =0; i<val.length(); i++) {
				String str = val.substring(i , i+1);
				int num = Integer.parseInt(str);
				sum += num;
			}
		} else {
			System.out.println("문자열이 아닙니다.");
		}
		System.out.println("입력한 문자열의 합계 : "+sum);
	}

	public void test7() {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int sum = 0;
		
		for(int i =0; i<str.length(); i++) {
			int num = (int) (str.charAt(i) - 48) ;
			sum += num;
		}
		System.out.println("합계: " + sum);
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
		System.out.println("짝수들의 합 : " + sum);
}

}


