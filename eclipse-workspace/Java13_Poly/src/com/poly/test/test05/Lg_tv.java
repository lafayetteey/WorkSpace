package com.poly.test.test05;

public class Lg_tv  implements Tv{
	
	public int volume;
	
	//getter & setter
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	//�⺻������
	public Lg_tv() {
		System.out.println("LG tv�� �������ϴ�.");
	}

	@Override
	public int volumeUp() {		
		setVolume( getVolume() +1) ;
//		this.volume++ ;
//		if(this.volume < 100 ) {
//			System.out.println("LG tv ������ 1 ����");
//			System.out.println("LG tv�� ���� ������ :" + volume);
//		} 
		return getVolume();
	}
	
	@Override
	public int volumeDonw() {
//		this.volume --;
//		if(this.volume > 0) {
//			System.out.println("LG tv ������ 1 �پ��");
//			System.out.println("LG tv�� ���纼���� " + this.volume);
//		} 
//		return this.volume;
		setVolume(getVolume() -1);
		return getVolume();
	}
	
	
	public void tvClosed() {
		System.out.println("Lg tv�� �������ϴ�.");
	}

}
