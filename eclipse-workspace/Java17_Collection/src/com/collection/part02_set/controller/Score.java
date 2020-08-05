package com.collection.part02_set.controller;

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
		//name 으로 정렬
		String otherName =((Score)o).getName();
		//내림차순 정렬 시 앞 변수에 마이너스 부호 추가
		//return -name.compareTo(otherName);
		return name.compareTo(otherName);
	
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Score other = (Score) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (score != other.score)
			return false;
		return true;
	}
	
}
