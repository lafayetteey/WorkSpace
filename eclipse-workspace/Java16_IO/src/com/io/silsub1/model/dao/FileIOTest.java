package com.io.silsub1.model.dao;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileIOTest {
	public static void main(String args[]) {
		new FileIOTest().fileSave();
	}

	public void fileSave() {
		BufferedReader br = null;
		FileWriter fw = null;

		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("파일명 입력");
			String fName = br.readLine();
			fw = new FileWriter(fName);
			String answer = " ";
			while(true) {
				if(! answer.equals("exit")) {
					System.out.println("파일에 저장할 내용을 입력하세요");
					answer = br.readLine();
					fw.write(answer);
				} else {
					System.out.println("파일에 성공적으로 저장 되었습니다.");
					break;
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void fileOpen() {
		
	}
}
