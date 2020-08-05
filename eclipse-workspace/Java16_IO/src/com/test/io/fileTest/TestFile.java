package com.test.io.fileTest;

import java.io.File;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) {
		File file = new File("person.txt");
		
		System.out.println("���ϸ� : " + file.getName());
		System.out.println("������ : " + file.getPath());
		System.out.println("������ :" + file.getAbsolutePath());
		System.out.println("���Ͽ뷮 : " + file.length());
		
		try {
			boolean b = file.createNewFile();
			System.out.println(b);
			
//			boolean b2 = file.delete();
//			System.out.println(b2);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}

}
