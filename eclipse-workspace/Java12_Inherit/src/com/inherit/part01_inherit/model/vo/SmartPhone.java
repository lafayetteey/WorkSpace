package com.inherit.part01_inherit.model.vo;

import java.util.Date;

public class SmartPhone extends Computer {
	private String mobileAgency;
	
	public SmartPhone() {	
	}
	
	public SmartPhone(String brand , String productNumber , String productCode , String productName , int price , Date date , String cpu , int hdd , int ram , String os ,
			String mobileAgency) {
		super(brand, productNumber , productCode , productName , price , date , cpu , hdd , ram , os);
		this.mobileAgency = mobileAgency;
	}
	
	public String getMobileAgency() {
		return mobileAgency;
	}
	public void setMoblieAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	@Override
	public String prnInfo() {
		return super.prnInfo() + ", " + this.mobileAgency;
	}
}
