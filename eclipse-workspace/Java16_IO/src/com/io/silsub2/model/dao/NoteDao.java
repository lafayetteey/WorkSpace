package com.io.silsub2.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.io.silsub2.controller.NoteManager;

public class NoteDao {
	public void fileSave(StringBuilder sb, String fileName) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
			bw.append(sb);
			System.out.println(fileName + "에 성공적으로 저장하였습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public String fileOpen(String fileName) {
		FileReader fr = null;
		BufferedReader br = null;
		String str = " ";
		StringBuilder sb = null;
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			int val;
			sb = new StringBuilder();
			while ((val = br.read()) != -1) {
				sb.append((char) val);
			}
			str = sb.toString();
			System.out.println(str);
		} catch (IOException e) {
			e.getStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return sb.toString();
	}

}
