package com.network.silsub.run;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket();
		
		
		byte[] buff = "전송합니다.".getBytes();
		
		DatagramPacket dp = new DatagramPacket(buff , buff.length , InetAddress.getByName("localhost") ,8585);
	
		ds.send(dp);
		
		ds.close();
		ds.disconnect();
	}
}
