package com.io.silsub1.model.dao;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileIOTest {

	public static void main(String[] args) {

		fileSave();

	}

	public static void fileSave() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileWriter fw = null;

		try {
			System.out.print("파일명 입력 : ");
			String fileName = br.readLine();
			fw = new FileWriter(fileName);
			String answer = "";
			while (true) {
				if (answer.equals("exit")) {
					System.out.println("파일에 저장할 내용 입력 : ");
					answer = br.readLine();
					fw.write(answer);
				} else {
					System.out.println("파일에 성공적으로 저장되었습니다.");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
