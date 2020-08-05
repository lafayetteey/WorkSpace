package com.test.oi.part01_byteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestByteStream {
		public void fileSave() {
			//byte ������ ��� ��� ��Ʈ��
			FileOutputStream fout = null;
			
			try {
				//��� ������ �������� ������ �ڵ����� ������ �����.
				fout = new FileOutputStream("sample.txt");
				fout.write(97);
				byte[] bar = {98,99,100,101,102,10};
				fout.write(bar);
				fout.write(bar , 1, 3);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					fout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		public void fileOpen( ) {
			try {
				FileInputStream fin = new FileInputStream("sample.txt");
				int fileSize =(int) new File("sample.txt").length();
				//System.out.println(fileSize);
				//������ �о ������ ���� ũ�� ��ŭ�� byte�迭 ����
				byte[] bar = new byte[fileSize];
	//			fin.read(bar);
//				for(int i =0; i<bar.length; i++) {
//					System.out.print((char)bar[i] + " ");
//				for( int i=0; i<15; i++) {
//					System.out.print(fin.read());
				int no;
				while ((no = fin.read()) != -1) {
					System.out.print((char)no + " ");
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
		
		public void fileSave2() {
			FileOutputStream fos1 = null;
		
			
			try {
				fos1 = new FileOutputStream("sample.txt");
				fos1.write(1);
				fos1.write(2);
				byte[] arr = {1, 2, 3, 4, 5};
				fos1.write(arr);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		public void fileOpen2() {
			FileInputStream fis = null;
			
			try {
				fis = new FileInputStream("sample.txt");
				int fileSize = (int)new File("sample.txt").length();
				Byte[] barr = new Byte[fileSize];
				int no = 0;
				while((no = fis.read()) != -1) {
					System.out.println(no);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}
}
