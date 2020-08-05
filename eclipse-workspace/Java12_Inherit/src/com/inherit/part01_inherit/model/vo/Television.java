package com.inherit.part01_inherit.model.vo;

import java.util.Date;

public class Television extends Product {
	//product Ŭ���� ��� �޾� ����
	
	private int inchType;
	
	public Television() {
		//super(); �θ� Ŭ������ ������		
	}
	public Television(String brand , String productNumber, String productCode, String productName , int price , Date date ,int inchType) {
		super(brand , productNumber ,productCode , productName , price, date);
		this.inchType = inchType;
		System.out.println("product�� ��ӹ��� tv Ŭ������ ������ ȣ��");
	}
	
	//getter & setter
	public int getInchType() {
		return inchType;
	}
	public void setInchType(int inchType) {
		this.inchType = inchType;
	}
	@Override
	public String prnInfo() {
		return super.prnInfo() + ", " + this.inchType;
	}
}
