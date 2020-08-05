package com.test.oi.part03_addStream.ch02_buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestStream {
	public void output() {
		//new ������Ʈ��(new ���� ��Ʈ��(new��ݽ�Ʈ��(�ܺ��ڿ�)));
		//try with resource
		try (BufferedWriter bw = 
					new BufferedWriter(
							new FileWriter("sample2.txt")))	{
		bw.write("�ȳ��ϼ���\n");
		bw.write("�ݰ����ϴ�\n");
		bw.write("�������̳׿�\n");
		
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void input() {
		try(BufferedReader br = new BufferedReader(new FileReader("sample2.txt"))) {
			String tmp;
			while ((tmp = br.readLine()) != null) {
				System.out.println(tmp);
			}		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
