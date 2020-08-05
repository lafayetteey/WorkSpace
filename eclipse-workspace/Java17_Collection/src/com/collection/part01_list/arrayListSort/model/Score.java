package com.collection.part01_list.arrayListSort.model;

public class Score implements Comparable {
	private String name;
	private int score;
	
	public Score() {
		
	}
	public Score(String name , int score) {
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Score [name=" + name + ", score=" + score + "]";
	}
	@Override
	public int compareTo(Object o) {
		String otherName = ((Score)o).getName();
		
		return name.compareTo(otherName);
	}
}
