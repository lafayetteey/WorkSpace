package com.io.silsub2.view;

import java.util.Scanner;

import com.io.silsub2.controller.NoteManager;

public class NoteMenu {
	
	public void menu() {
		NoteManager nm = new NoteManager();
		Scanner sc = new Scanner(System.in);
		
		int num =0;
		while(num < 3) {
			System.out.println("*** My Note ***");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 끝내기");
			num = sc.nextInt();
			switch(num) {
			case 1 : nm.fileSave(); break;
			case 2 : nm.fileOpen(); break;
			case 3 : System.out.println("프로그램 종료"); break;
			}
		}
	}

}
