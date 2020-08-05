package com.inherit.silsub0;

public class Run {

	public static void main(String[] args) {
		
		SportsCar c1 = new SportsCar("노란");
		c1.accelPedal();
		System.out.println(c1);
		c1.accelPedal();
		c1.accelPedal();
		System.out.println(c1.toString());
//		Car c = new SportsCar(); //다형성
		Car c2 = new SUV("검정");	//다형성
		c2.accelPedal();
		System.out.println(c2);
		c2.accelPedal();
		c2.accelPedal();
		c2.accelPedal();
		System.out.println(c2);
		c2.breakPedal();
		c2.breakPedal();
		c2.breakPedal();
		c2.breakPedal();
		System.out.println(c2);
		
		
		//toString() 해당하는 객체의 필드값을 확인해줌		
		//반드시 오버라이딩 해서 사용해야함
	}

}
