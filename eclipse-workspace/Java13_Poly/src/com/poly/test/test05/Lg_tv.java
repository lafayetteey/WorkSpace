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
	//기본생성자
	public Lg_tv() {
		System.out.println("LG tv가 켜졌습니다.");
	}

	@Override
	public int volumeUp() {		
		setVolume( getVolume() +1) ;
//		this.volume++ ;
//		if(this.volume < 100 ) {
//			System.out.println("LG tv 볼륨이 1 증가");
//			System.out.println("LG tv의 현재 볼륨은 :" + volume);
//		} 
		return getVolume();
	}
	
	@Override
	public int volumeDonw() {
//		this.volume --;
//		if(this.volume > 0) {
//			System.out.println("LG tv 볼륨이 1 줄어듬");
//			System.out.println("LG tv의 현재볼륨은 " + this.volume);
//		} 
//		return this.volume;
		setVolume(getVolume() -1);
		return getVolume();
	}
	
	
	public void tvClosed() {
		System.out.println("Lg tv가 꺼졌습니다.");
	}

}
