package com.threadPrcatice;

public class ThreadA extends Thread {
	@Override
	public void run() {
		for(int i=0; i<=500; i++) {
			System.out.println("¡Ú");
			try {
				Thread.sleep(100);} catch (InterruptedException e) {}
		}
	}
}
