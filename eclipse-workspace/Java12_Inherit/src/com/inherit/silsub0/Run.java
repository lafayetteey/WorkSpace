package com.inherit.silsub0;

public class Run {

	public static void main(String[] args) {
		
		SportsCar c1 = new SportsCar("���");
		c1.accelPedal();
		System.out.println(c1);
		c1.accelPedal();
		c1.accelPedal();
		System.out.println(c1.toString());
//		Car c = new SportsCar(); //������
		Car c2 = new SUV("����");	//������
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
		
		
		//toString() �ش��ϴ� ��ü�� �ʵ尪�� Ȯ������		
		//�ݵ�� �������̵� �ؼ� ����ؾ���
	}

}
