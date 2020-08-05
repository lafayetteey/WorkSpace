package com.test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client implements Runnable {

	public static void main(String[] args) {
		Thread thread = new Thread(new Client());
		thread.start();
	}

	@Override
	public void run() {
		try {
			Socket clientSocket;
			PrintWriter out;
			BufferedReader in = null;
			BufferedReader stdIn = null;
			
			System.out.println("server에 접속합니다......");
			//8888 이란 포트를 가진 서버와의 연결 요청
			clientSocket = new Socket("localhost" , 7575);
			
			//데이터를 서버로 내보냄
			out = new PrintWriter(clientSocket.getOutputStream(), true);
			
			//데이터를 서버에서 가지고 옴
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			
			stdIn = new BufferedReader(new InputStreamReader(System.in));
			
			String inputLine;
			
			while((inputLine = stdIn.readLine()) != null) {
				out.println(inputLine);
				System.out.println("server로부터" + "다시 받은 메세지 : " + in.readLine() );
			}
			
			clientSocket.close();
			out.close();
			in.close();
			stdIn.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
		
	}

}
