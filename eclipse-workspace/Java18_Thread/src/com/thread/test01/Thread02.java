package com.thread.test01;


class MyThread02 extends Thread {
	public MyThread02() {}
	public MyThread02(String name) {
		super(name);
	}
	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			System.out.println(this.getName()+ "=" + i);
		}
		System.out.println(this.getName()+ "끝!!");
	}
}

public class Thread02 {

	public static void main(String[] args) {
		MyThread02 mt = new MyThread02("멍멍");
		MyThread02 m2 = new MyThread02("야옹");
		//thread scheduling
		//1.priority (우선순위) 2 .round - robin(순환할당)
		mt.setPriority(1);
		m2.setPriority(10);
	
		
		mt.start();
		m2.start();
	}

}
