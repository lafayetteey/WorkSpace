package com.collection.part02_set.controller;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TestHashSet {
	public void testHashSet() {
		//hashSet
		HashSet hset = new HashSet();
		
//		다형성
//		Set hset2 = new HashSet();
//		Collection hset3 = new HashSet();
		
		hset.add(new String("Java"));
		hset.add(new Integer(33));
		hset.add(new Double(45.67));
		hset.add(new Date());
		hset.add("string");
		
		//저장 순서 유지 안됨
		System.out.println("hset : " + hset);
		
		//중복데이터값 허용하지 않음
		hset.add(new String("Java"));
		hset.add(new Integer(123));
		hset.add(new Double(45.67));
		System.out.println("hset : " + hset);
		System.out.println("저장된 객체수 : " + hset.size());
		System.out.println("포함확인 :" + hset.contains(new Integer(123)));
		
		System.out.println("-----------------------------------------");
		
		HashSet hset2 = new HashSet();
		
		hset2.add(new Score("김승진", 99));
		hset2.add(new Score("홍길동", 83));
		hset2.add(new Score("임꺽정", 69));
		
		hset2.add(new Score("김승진" , 99));
		
		System.out.println("hset2 : " + hset2);
		
		
		System.out.println("-------------------------------------------");
		
		//저장된 객체를 하나씩 꺼내기
		//set에는 하나씩 꺼내는 기능이 없다
		//1 . toArray() 배열을 바꾸고 반복문 사용
		Object[] obj = hset.toArray();
		
		for(int i=0; i<obj.length; i++) {
			System.out.println(i+" : " + obj[i]);
		}
		
		//2. Iterator() 로 목록을 만들어 처리
		Iterator iter = hset.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + ", ");
		}
		//1회용으로 한번밖에 사용이되지 않는다.
		while(iter.hasNext()) {
			System.out.println("2 : " + iter.next());
		}
		
		TreeSet tset = new TreeSet(hset2);
		System.out.println("tset on HashSet" + tset);

		Iterator iter2 = hset.iterator();
		while(iter2.hasNext()) {
			System.out.println(iter2.next());
		}
		Object[] obj2 = hset.toArray();
		for(int i=0; i<obj2.length; i++) {
			System.out.println(obj2[i]);
		}
	}
}
