package com.silsub1.tv.model.vo;

public class MTest {

	public static void main(String[] args) {
		Lgtv lg = new Lgtv();
		
		System.out.println(lg.volumUp());
		System.out.println(lg.volumUp());
		System.out.println(lg.volumUp());
		System.out.println(lg.volumeDown());
		System.out.println(lg.volumeDown());
		lg.tvClosed();
		
		SamsungTv sm = new SamsungTv();
		System.out.println(sm.volumUp());
		System.out.println(sm.volumeDown());
		sm.tvClosed();
	}

}
