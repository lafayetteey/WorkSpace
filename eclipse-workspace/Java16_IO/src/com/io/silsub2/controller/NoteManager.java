package com.io.silsub2.controller;

import java.util.Scanner;

import com.io.silsub2.model.dao.NoteDao;

public class NoteManager {
	private Scanner sc = new Scanner(System.in);

	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		String fileName = " ";
		String answer = " ";
		String str = " ";
		while (true) {
			if (!str.equals("exit")) {
				System.out.println("파일에 저장할 내용을 입력하세요");
				str = sc.nextLine();
				sb.append(str);
			} else {
				System.out.println("저장하시겠습니까? (y/n)");
				answer = sc.next();
				if (answer.equals("Y") || answer.equals("y")) {
					System.out.println("저장할 파일명을 입력하세요");
					fileName = sc.next();
					new NoteDao().fileSave(sb, fileName);
				} else {
					return;
				}
			}
		}

	}
	
//	public void fileSave2() {
//		StringBuilder sb = new StringBuilder();
//		System.out.println("파일에 저장할 내용을 입력 :");
//		
//		while(true) {
//			String str = sc.nextLine();
//			if(str.equals("exit")) {
//				break;
//			} else {
//				sb.append(str + "\n");
//			}
//		}
//		System.out.println("저장하시겠습니까(y / n)");
//		String answer = sc.nextLine();
//		if(answer.equals("y") || answer.equals("y")) {
//			System.out.println("저장할 파일명을 입력하세요.");
//			String fileName = sc.nextLine();
//			new NoteDao().fileSave(sb, fileName);
//		} else {
//			System.out.println("저장하지 않고 메뉴로 돌아갑니다.");
//			return;
//		}
//	}

	public void fileOpen() {
		System.out.println("열기할 파일명을 입력하세요");
		String fileName = sc.next();
		StringBuilder sb = new StringBuilder();
		new NoteDao().fileOpen(fileName);

	}
}
