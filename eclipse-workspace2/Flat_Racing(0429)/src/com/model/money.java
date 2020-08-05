package com.model;

public class money {
	
	//배팅한 인원수 
	private int p1;
	private int p2;
	private int p3;
	private int p4;
	
	//인원수 총합 
	private int All;
	
	//배팅된 전체금액
	private int Allm;
	
	//우승시 개인당 가질돈 allm/px
	
	static private String p1m;
	static private String p2m;
	static private String p3m;
	static private String p4m;
	
	//1등

	static private String money;



	
	public money() {}

	public money(int p1, int p2, int p3, int p4, String p1m, String p2m , String p3m,String p4m) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
		this.p1m = p1m;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}
	
	

	public int getP1() {
		return p1;
	}


	public void setP1(int p1) {
		this.p1 = p1;
	}


	public int getP2() {
		return p2;
	}


	public void setP2(int p2) {
		this.p2 = p2;
	}


	public int getP3() {
		return p3;
	}


	public void setP3(int p3) {
		this.p3 = p3;
	}


	public int getP4() {
		return p4;
	}


	public void setP4(int p4) {
		this.p4 = p4;
	}


	public int getAll() {
		return All;
	}


	public void setAll(int all) {
		this.All = all;
	}
	
	
	
	
	
	public int getAllm() {
		return Allm;
	}

	public void setAllm(int allm) {
		this.Allm = allm;
	}




	public String getP1m() {
		return p1m;
	}

	public void setP1m(String p1m) {
		this.p1m = p1m;
	}

	public String getP2m() {
		return p2m;
	}

	public void setP2m(String p2m) {
		this.p2m = p2m;
	}

	public String getP3m() {
		return p3m;
	}

	public void setP3m(String p3m) {
		this.p3m = p3m;
	}

	public String getP4m() {
		return p4m;
	}

	public void setP4m(String p4m) {
		this.p4m = p4m;
	}

	@Override
	public String toString() {
		return "money [p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + ", p4=" + p4 + ", All=" + All + ", Allm=" + Allm
				+ ", p1m=" + p1m + ", p2m=" + p2m + ", p3m=" + p3m + ", p4m=" + p4m + "]";
	}


	
	
	
	
	
	
			
			
}
