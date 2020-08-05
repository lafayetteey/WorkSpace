package com.io.silsub2.controller;

import java.util.Scanner;

import com.io.silsub2.model.dao.NoteDao;

public class NoteManager {
	Scanner sc = new Scanner(System.in);

	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		String memo = " ";
		while (true) {
			if (!memo.equals("exit")) {
				System.out.println("파일에 저장할 내용을 입력하세요");
				memo = sc.next();
				sb.append(memo);
			} else {
				break;
			}
		}
		System.out.println("저장 하시겠습니까 ( y / n )");
		String answer = sc.next();
		if(answer.equals("y") || answer.equals("Y")) {
			System.out.println("저장할 파일명을 입력하세요");
			String fileName = sc.next();
			new NoteDao().fileSave(sb, fileName);
		}
	}

	public void fileOpen() {
		System.out.println("열기할 파일명을 입력해주세요 : ");
		String fileName = sc.next();
		StringBuilder sb = new StringBuilder();
		new NoteDao().fileOpen(fileName);	
	}
	

}
