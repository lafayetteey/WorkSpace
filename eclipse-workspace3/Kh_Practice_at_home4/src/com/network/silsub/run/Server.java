package com.network.silsub.run;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server {

	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket(8585);
		System.out.println("서버");
		
		byte[] buff = new byte[1000];
		
		DatagramPacket dp = new DatagramPacket(buff , buff.length);
		
		ds.receive(dp);
		System.out.println(new String(dp.getData()));
		
		ds.close();
		ds.disconnect();
	}

}
