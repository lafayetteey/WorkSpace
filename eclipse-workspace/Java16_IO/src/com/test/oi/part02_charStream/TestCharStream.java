package com.test.oi.part02_charStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestCharStream {
	public void fileSave() {
		
			//문자 기반 통로
			FileWriter fw = null;
		try {	
			fw = new FileWriter("sample.txt");
			fw.write("비도오고 그래서");
			fw.write('A');
			fw.write(' ');
			char[] carr = { 'a' , 'b' , 'c' , 'd' };
			fw.write(carr);
					
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
	}
	public void fileOpen() {
		FileReader fr = null;
		
		try {
			fr = new FileReader("sample.txt");
			int val;
			while((val = fr.read()) != -1) {
				System.out.print((char)val);
			}	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void fileWrite() {
		FileWriter fw1 = null;
		
		try {
			fw1 = new FileWriter("sample.txt");
			fw1.write("월요일");
			fw1.write("오전 9시");
			char carr[] = {'a', 'b' , 'c' , 'd' , 'e'};
			fw1.write(carr);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw1.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void fileRead() {
		FileReader fr2 = null;
		
		try {
			fr2 = new FileReader("sample.txt");
			int val;
			while((val = fr2.read()) != -1);
			System.out.println((char)val);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr2.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
