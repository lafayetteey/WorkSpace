package com.silsub1.tv.model.vo;

public class SamsungTv implements TV {
	private int volume;
	
	public SamsungTv() {
		System.out.println("samsung tv�� �������ϴ�.");
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	@Override
	public int volumUp() {
		setVolume( getVolume() + 1 );
		return volume;
	}

	@Override
	public int volumeDown() {
		setVolume( getVolume() -1);
		return volume;
	}
	
	public void tvClosed() {
		System.out.println("samsung tv�� �������ϴ�.");
	}

}
