package com.test.oi.part03_addStream.ch01_byteToChar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestStream {
	public void input() {
		// 콘솔창에서 입력받은 키보드 값과 Stream 연결(표준 입출력:System.in(byte단위)) , System.in 과 System.out은 기반스트림
		// Reader는 문자단위이므로 InputStreamReader로 문자 변환 시켜줌
		// 보조 스트림 변수 = new 보조스트림(new 보조 스트림(new 기반스트림(외부자원)));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자열 입력 : ");
		try {
			String val = br.readLine();
			System.out.println("val : " + val);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void output() {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			bw.write("Java Oracle JDBC");
			// buffer에 남아있는 데이터를 모두 내보는 메소드 flush()
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public void output2() {
		BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			bw2.write("Java So Difficult");
			bw2.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw2.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
