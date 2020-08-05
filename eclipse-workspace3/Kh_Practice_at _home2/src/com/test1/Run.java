package com.test1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Run {
	public static void main(String args[]) {
		
		String colors = "orange#blue%red,yellow green";
		
		String[] str = colors.split("[#% ,]");
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		
		StringTokenizer st = new StringTokenizer(colors , "#%,");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}	
		
		
		
		//Run.rps();
	}
	public static void rps() {
		Scanner sc = new Scanner(System.in);
		System.out.println("시작");

		do {
			System.out.print("입력 : ");
			String input = sc.nextLine();

			System.out.println("당신이 낸 것:" + input);

			int random = (int) (Math.random() * 3);
			String computer = " ";

			switch (random) {
			case 1:
				computer = "가위";
				break;
			case 2:
				computer = "바위";
				break;
			case 3:
				computer = "보";
				break;
			}

			System.out.println("컴퓨터가 낸것 :" + computer);

			if (computer.equals(input)) {
				System.out.println("비겼습니다. 다시 시작");
			} else {
				boolean win = false;

				if (computer.equals("가위")) {
					if (input.equals("바위")) {
						win = true;
					}
				} else if (computer.equals("바위")) {
					if (input.equals("보")) {
						win = true;
					}
				} else {
					if(input.equals("가위")) {
						win = true;
					}
				}
				if(win) {
					System.out.println("이겼습니다.");
					break;
				} else {
					System.out.println("졌습니다.");
					break;
				}
			}
		} while (true);
	}
}
	

