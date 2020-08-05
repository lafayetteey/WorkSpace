package com.project.model;

import java.util.ArrayList;
import java.util.Date;

public class Member {
	private String name, pNum;
	private long loanedTime, returnedTime; // 연체 시간(요금정산할때 필요)
	private ArrayList<Book> bookList;
	private String loanedDay, returnedDay;// (대여날짜 - 반납날짜) : 연체시간

	public Member() {
	}

	public Member(String name, String pNum, ArrayList<Book> bookList, String loanedDay) {
		super();
		this.name = name;
		this.pNum = pNum;
		this.bookList = bookList;
		this.loanedDay = loanedDay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getpNum() {
		return pNum;
	}

	public void setpNum(String pNum) {
		this.pNum = pNum;
	}

	public ArrayList<Book> getBookList() {
		return bookList;
	}

	public void setBookList(ArrayList<Book> bookList) {
		this.bookList.addAll(bookList);
	}

	public long getLoanedTime() {
		return loanedTime;
	}

	public void setLoanedTime(long loanedTime) {
		this.loanedTime = loanedTime;
	}

	public long getReturnedTime() {
		return returnedTime;
	}

	public void setReturnedTime(long returnedTime) {
		this.returnedTime = returnedTime;
	}

	public String getLoanedDay() {
		return loanedDay;
	}

	public void setLoanedDay(String loanedDay) {
		this.loanedDay = loanedDay;
	}

	public String getReturnedDay() {
		return returnedDay;
	}

	public void setReturnedDay(String returnedDay) {
		this.returnedDay = returnedDay;
	}

	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i < bookList.size(); i++) {
			str += "제목: " + bookList.get(i).getTitle() + ", 작가: " + bookList.get(i).getAuthor() + "\n";
		}
		return "이름: " + name + ", 전화번호: " + pNum + "\n빌린책: " + str;
	}
}
