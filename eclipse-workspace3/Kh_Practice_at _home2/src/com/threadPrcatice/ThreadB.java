package com.threadPrcatice;

public class ThreadB implements Runnable {
	@Override
	public void run() {
		for(int i=0; i<=500; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);} catch (InterruptedException e) {}
		}
		
	}

}
