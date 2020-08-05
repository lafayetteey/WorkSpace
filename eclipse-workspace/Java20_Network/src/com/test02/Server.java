package com.test02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
		public static void main(String[] args) throws IOException {
			//DatagramSocket 포트번호 저장
			DatagramSocket ds = new DatagramSocket(8585);
			System.out.println("서버");
			
			//메세지를 받을 방 생성
			byte[] barr = new byte[1000];
			
			//패킷을 받음
			DatagramPacket dp = new DatagramPacket(barr , barr.length);
			
			//패킷저장
			ds.receive(dp);
			System.out.println(new String(dp.getData()));
			
			ds.close();
			ds.disconnect();
	
	}
}
