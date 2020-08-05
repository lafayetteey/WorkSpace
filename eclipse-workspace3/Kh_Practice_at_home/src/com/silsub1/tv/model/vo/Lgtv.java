package com.silsub1.tv.model.vo;

public class Lgtv implements TV {
	
	private int volume;
	
	public Lgtv () {
		System.out.println("lg tv가 켜졌습니다.");
	}
	
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	

	public void tvClosed() {
		System.out.println("lg tv가 꺼졌습니다.");
	}

	@Override
	public int volumUp() {
		setVolume( getVolume() +3 ) ;
		return getVolume();
	}

	@Override
	public int volumeDown() {
		setVolume(getVolume() -3) ;
		return getVolume();
	}
}
