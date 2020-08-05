package com.hw3.controller.tv;

public class SamsungTv implements Tv{
	private int volume;
	

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public int volumeUp() {
		setVolume(getVolume() + 3);
		return getVolume();
	}

	@Override
	public int volumeDown() {
		setVolume(getVolume() -3);
		return getVolume();
	}

}
