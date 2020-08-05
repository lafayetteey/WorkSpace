package com.test01;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class URI2 {
	public static void main(String args[]) throws IOException {
		byte[] b = new byte[1];
		URL url = new URL("http://down.humoruniv.org/hwiparambbs/data/pds/a_4761688227_f9cfdce95d9fa63f05e53f35281ed920c7f40e79.jpg");
		
		URLConnection urlConnection = url.openConnection();
		urlConnection.connect();
		
		//이미지 URL의 이미지가 들어옴
		DataInputStream di = new DataInputStream(urlConnection.getInputStream());
		
		//a.jpg 로 저장
		FileOutputStream fo = new FileOutputStream("a.jpg");
		
		while(di.read(b, 0 , 1) != -1) {
			fo.write(b, 0 , 1);
		}
		System.out.println("완료");
		di.close();
		fo.close();
		
	}
}
