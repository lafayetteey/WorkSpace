package com.thread.test01;



class MyThread implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("i =" + i);
		}
	}
	
}

public class Thread01 {

	public static void main(String[] args) {
		System.out.println("-------main strat --------");
	
		MyThread m1 = new MyThread();
		Thread t1 = new Thread(m1);
		t1.run();
		
		System.out.println("-------main stop --------");
	}

}
