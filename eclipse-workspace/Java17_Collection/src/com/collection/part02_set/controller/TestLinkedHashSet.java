package com.collection.part02_set.controller;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestLinkedHashSet {
	public void testLinkedHashSet() {
		//LinkedHashSet 
		//hashSet에 저장순서 유지기능이 추가됨
		LinkedHashSet lSet = new LinkedHashSet();
		
		lSet.add("java");
		lSet.add(123);
		lSet.add(45.67);
		lSet.add(true);
		lSet.add(new Date());
		
		System.out.println("lSet : " + lSet);
		
		
		//오름차순 정렬
		LinkedHashSet lSet2 = new LinkedHashSet();
		
		lSet2.add("java");
		lSet2.add("oracle");
		lSet2.add("html");
		lSet2.add("css");
		
		System.out.println("lSet2 : " + lSet2);
		
		//만들어진 LinkedHashSer을가지고 TreeSet객체를 생성하면 자동으로 오름차순 정렬
		//같은 타입의 객체가 들어가야한다.
		TreeSet tset = new TreeSet(lSet2);
		System.out.println("tset : " + tset);
		
		
		
		
	}
}
