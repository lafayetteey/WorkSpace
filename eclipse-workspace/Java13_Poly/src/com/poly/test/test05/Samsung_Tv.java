package com.poly.test.test05;

public class Samsung_Tv implements Tv{
	private int volume;

	
	public Samsung_Tv() {
		System.out.println("»ï¼º tv°¡ ÄÑÁ³½À´Ï´Ù.");
	}
	
	@Override
	public int volumeUp() {
		setVolume(getVolume() +3 );
		return getVolume();
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	@Override
	public int volumeDonw() {
		setVolume(getVolume() -3);
		return getVolume();
	}
	public void tvClosed() {
		System.out.println("»ï¼º tv°¡ ²¨Á³½À´Ï´Ù."); 
	}

}
