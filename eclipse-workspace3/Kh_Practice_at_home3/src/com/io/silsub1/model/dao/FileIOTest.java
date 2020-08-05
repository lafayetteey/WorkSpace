package com.io.silsub1.model.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileIOTest {

	public static void main(String[] args) {
		filesave();
	}

	public static void filesave() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileWriter fw = null;
		try {
			System.out.println("파일명을 입력하세요");
			String fName = br.readLine();
			fw = new FileWriter(fName);
			String str = " ";
			while(true) {
			if(!str.equals("exit")) {
				System.out.println("파일에 저장할 내용을 입력하세요");
				str = br.readLine();
				fw.write(str);
			} else {
				System.out.println("파일에 성공적으로 저장 되었습니다.");
				break;
			}
			}
		} catch (IOException e) {e.printStackTrace();
		
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

	public void fileread() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileReader fr = null;
		StringBuilder sb = new StringBuilder();
		try {
			System.out.println("읽을 파일명을 입력하세요 ");
			String fName = br.readLine();
			fr = new FileReader(fName);
			int val = 0;
			while((val = fr.read()) != -1) {
				sb.append((char)val);
			}
			String str = sb.toString();
			System.out.println(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
