package com.inherit.silsub0;

public class Car {
	private String color;
	private int speed;

	public Car() {
	}

	public Car(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	public Car(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String prnInfo() {
		return color + ", " + speed;
	}

	public void accelPedal() {
		System.out.println("�ӵ��� �ö󰩴ϴ�.");
		setSpeed(getSpeed() + 10);
	}

	public void breakPedal() {
		setSpeed(getSpeed() - 10);

		if (getSpeed() > 0) {
			System.out.println("�ӵ��� �پ��ϴ�.");
		} else {
			System.out.println("���� �Ͽ����ϴ�..");
			setSpeed(0);
		}
	}
	@Override
	public String toString() {
		return "���� �ӵ��� " + speed + " �Դϴ�.";
		
	}
}
