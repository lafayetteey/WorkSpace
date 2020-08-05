package com.io.silsub2.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.io.silsub2.controller.NoteManager;

public class NoteDao {
	public void fileSave(StringBuilder sb, String fileName) {
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fw = new FileWriter(fileName);
			bw = new BufferedWriter(fw);
			System.out.println(fileName + "파일에 성공적으로 저장하였습니다.");
		} catch (IOException e) {
			e.getStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public String fileOpen(String fileName) {
		StringBuilder sb = null;
		String str = "";
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			sb = new StringBuilder();
			int val = 0;
			while ((val = br.read()) != -1) {
				sb.append((char) val);
			}
			str = sb.toString();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb.toString();

	}
}
