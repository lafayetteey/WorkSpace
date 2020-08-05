package com.test02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class MyServer {

	public static void main(String[] args) throws IOException {
		//Create Server (포트번호 지정)
		DatagramSocket ds = new DatagramSocket(8989);
		System.out.println("서버");
		
		//메세지를 받을 방
		byte[] buff = new byte[1024];
		
		//패킷을 받음
		DatagramPacket recP = new DatagramPacket(buff , buff.length);
		
		
		//패킷 저장
		ds.receive(recP);
		System.out.println(new String(recP.getData()));
		
		//종료
		ds.close();
		ds.disconnect();
	}

}
