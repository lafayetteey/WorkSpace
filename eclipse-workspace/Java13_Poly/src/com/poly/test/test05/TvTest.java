package com.poly.test.test05;

public class TvTest {
	public static void main(String args[]) {
		Lg_tv lg = new Lg_tv();
		
		System.out.println(lg.volumeUp());
		System.out.println(lg.volumeUp());
		System.out.println(lg.volumeDonw());
		lg.tvClosed();
		System.out.println("------------------------------");
		
		Samsung_Tv sm = new Samsung_Tv();
		sm.volumeUp();
		sm.volumeUp();
		sm.volumeDonw();
		sm.tvClosed();
	}
}
