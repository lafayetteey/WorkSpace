package com.io.silsub2.view;

import java.util.Scanner;

import com.io.silsub2.controller.NoteManager;

public class NoteMenu {
	Scanner sc = new Scanner(System.in);
	
	public void menu () {
		NoteManager nmg = new NoteManager();
		System.out.println("*** My Note ***");
		System.out.println();
		int num =0;
		
		while (num<3) {
			System.out.println("번호를 입력하세요");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 끝내기");
			num = sc.nextInt();
			switch (num) {
			case 1 : 
				nmg.fileSave();
				break;
			case 2 : 
				nmg.fileOpen();
				break;
			case 3 : 
				System.out.println("프로그램 종료.");
				break;
			default : 
				System.out.println("번호선택이 잘못 되었습니다.");
				System.out.println("다시 선택해주세요.");
				return;
			}
		}
		
	}
	
}
