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
		System.out.println("����");

		do {
			System.out.print("�Է� : ");
			String input = sc.nextLine();

			System.out.println("����� �� ��:" + input);

			int random = (int) (Math.random() * 3);
			String computer = " ";

			switch (random) {
			case 1:
				computer = "����";
				break;
			case 2:
				computer = "����";
				break;
			case 3:
				computer = "��";
				break;
			}

			System.out.println("��ǻ�Ͱ� ���� :" + computer);

			if (computer.equals(input)) {
				System.out.println("�����ϴ�. �ٽ� ����");
			} else {
				boolean win = false;

				if (computer.equals("����")) {
					if (input.equals("����")) {
						win = true;
					}
				} else if (computer.equals("����")) {
					if (input.equals("��")) {
						win = true;
					}
				} else {
					if(input.equals("����")) {
						win = true;
					}
				}
				if(win) {
					System.out.println("�̰���ϴ�.");
					break;
				} else {
					System.out.println("�����ϴ�.");
					break;
				}
			}
		} while (true);
	}
}
	

