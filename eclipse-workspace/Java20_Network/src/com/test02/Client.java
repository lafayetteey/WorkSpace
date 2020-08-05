package com.test02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws IOException {
		//소켓 생성
		DatagramSocket ds = new DatagramSocket();
		System.out.println("클라이언트");
		
		//data 보냄
		byte[] barr = "연습입니다".getBytes();
		
		//데이터를 패킷으로 감싼다.
		DatagramPacket dp = new DatagramPacket(barr , barr.length , InetAddress.getByName("localhos") , 8585);
		
		//서버로 전송
		ds.send(dp);
		
		ds.close();
		ds.disconnect();
	}
}