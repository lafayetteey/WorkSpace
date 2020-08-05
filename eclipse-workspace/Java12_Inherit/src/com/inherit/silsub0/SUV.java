package com.inherit.silsub0;

public class SUV extends Car {
	public SUV () {
		System.out.println("SUV ����");
	}
	public SUV(String color) {
		super(color);
		System.out.println(color + "�� SUV ����");
	}
	@Override
	public void accelPedal() {
		System.out.println("�ӵ��� �� �ö󰩴ϴ�.");
		super.setSpeed(getSpeed() + 15);
	}
	
	@Override
	public void breakPedal() {
		super.setSpeed(getSpeed() - 15); 
		if(super.getSpeed() > 0) {
			System.out.println("�ӵ��� ������ �پ��ϴ�.");
		} else {
			super.setSpeed(0);
			System.out.println("������ϴ�.");
		}
	}
	
	@Override
	public String toString() {
		return "SUV�� ����ӵ��� " + getSpeed() + " �Դϴ�.";
		
	}
}
