package com.collection.part03_map.properties.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
	public void testProp() {
		//설정 파일의 값을 읽어서 적용할때 사용된다.
		//String만 사용
		Properties prop = new Properties();
		
		prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		prop.setProperty("url", "jdbc:oracle:thin:@localhost:1521:xe");
		prop.setProperty("user", "KH");
		prop.setProperty("password", "KH");
		prop.setProperty("userID", "drw333");
		System.out.println("prop : " + prop);
		
		//저장
		try {
			prop.store(new FileOutputStream("driver.properties"), "jdbc driver");
			
			prop.store(new FileWriter("driver.txt"), "JDBC DRIVER");
			
			prop.storeToXML(new FileOutputStream("driver.xml"), "jdbc DRIVER");
			
			prop.store(new FileOutputStream("driver.xml"), "this is Java");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void testProp2() {
		//파일에서 읽어와 Properties에 저장
		Properties prop = new Properties();
		
		try {
			prop.load(new FileInputStream("driver.properties"));
			prop.loadFromXML(new FileInputStream("driver.xml"));
			
			System.out.println(prop.getProperty("driver"));
			System.out.println(prop.getProperty("url"));
			System.out.println(prop.getProperty("user"));
			System.out.println(prop.getProperty("password"));
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
