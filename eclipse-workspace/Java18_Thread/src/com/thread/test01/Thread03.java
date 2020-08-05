package com.thread.test01;

import java.awt.Toolkit;

public class Thread03 {

	public static void main(String[] args) {
		
		beep();
		
		
	}
//		MyThread02 m1 = new MyThread02("야옹");
//		MyThread02 m2 = new MyThread02("멍멍");
//		
//		long start_time = System.currentTimeMillis();
//		m1.start();
//		
//		try {
//			m1.join(); //지정 thread 만 실행한 후 다음 thread 실행 되게 하는 메소드
//			//m1 thread가 종료될때까지 다른 thread를 멈춘다.
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		
//		
//		m2.start();
//		long end_time = System.currentTimeMillis();
//		System.out.println("실행시간 : " + (end_time - start_time));
//	}
	public static void beep() {
	Thread thread = new Thread();
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {
				thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
	

}
