package com.io.silsub.model.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileIOTest {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileWriter fr = null;
		String answer = " ";
		System.out.println("파일명 입력");
		try {
			String fName = br.readLine();
			fr = new FileWriter(fName);
			while(true) {
				System.out.println("파일에 저장할 내용을 입력하세요");
				answer = br.readLine();
				if(! answer.equals("exit")) {
					fr.write(answer);
				} else {
					System.out.println("저장완료");
					break;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void fileOpen() { 
		FileReader fr = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("읽을 파일명");
			String fName = br.readLine();
			 fr = new FileReader(fName);
			int val;
			StringBuilder sb = new StringBuilder();
			while((val=fr.read()) != -1) {
				sb.append((char)val);
			}
			String str = sb.toString();
			System.out.println(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
