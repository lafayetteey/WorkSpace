package com.test.oi.part03_addStream.ch01_byteToChar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestStream {
	public void input() {
		// �ܼ�â���� �Է¹��� Ű���� ���� Stream ����(ǥ�� �����:System.in(byte����)) , System.in �� System.out�� ��ݽ�Ʈ��
		// Reader�� ���ڴ����̹Ƿ� InputStreamReader�� ���� ��ȯ ������
		// ���� ��Ʈ�� ���� = new ������Ʈ��(new ���� ��Ʈ��(new ��ݽ�Ʈ��(�ܺ��ڿ�)));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���ڿ� �Է� : ");
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
			// buffer�� �����ִ� �����͸� ��� ������ �޼ҵ� flush()
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
