package com.collection.part03_map.hashmap.controller;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
	public void testHashMap() {
		HashMap hmap = new HashMap();

		// Map hmap2 = new HashMap();

		// 키와 값을 쌍으로 저장한다.
		hmap.put("one", new Date());
		hmap.put(12, "red");
		hmap.put(33, 123);
		hmap.put(34.5, "double");
		System.out.println("hmap :" + hmap);

		// key값은 중복허용하지 않으며(set의 특징), 최근 키값으로 덮어 씌어 진다.
		hmap.put(12, " yellow banana");
		System.out.println("hmap : " + hmap);

		// value 는 중복을 허용한다(list의 특징)
		hmap.put(11, "yellow banana");
		hmap.put(9, "yellow banana");
		System.out.println("hmap :" + hmap);

		// 각 객체의 내용을 가져오기
		// 키 값을 알고 있을경우 get 메소드
		System.out.println("키가 9인 객체 : " + hmap.get(9));

		// 삭제
		hmap.remove(9);
		System.out.println("hmap : " + hmap);

	}

	// 생성된 객체 정보 리턴하는 방법 2가지
	public void testHashMap2() {
		HashMap hmap = new HashMap();
		hmap.put("one", "java");
		hmap.put("two", "oracle");
		hmap.put("three", "jdbc");
		hmap.put("four", "html5");
		hmap.put("five", "css3");

		// 1. keySet() : 모든키를 set()에 담아 리턴
//		Set keys = hmap.keySet();
//		Iterator keyIter = keys.iterator();
		// Iterator iter = 변수명.iterator()
		// while(iter.hasNext()) {
		// iter.next()
		Set keys = hmap.keySet();
		Iterator keyIter = keys.iterator();
		while (keyIter.hasNext()) {
			String key = (String) keyIter.next();
			String val = (String) hmap.get(key);
			System.out.println(key + "=" + val);
		}

		System.out.println("----------------------------");

		// 2. 저장된 value 값들만 values() 이용해 Collection 으로 만든다
		Collection values = hmap.values();
		// Collection values = hmap.values();

		// 2-1.Iterator이용
		Iterator iter = values.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		System.out.println("--------------------------------");
		// 2-2.배열로 만들어서 처리
		Object[] obj = values.toArray();
		for (int i = 0; i < obj.length; i++) {
			System.out.println(i + " : " + obj[i]);
		}
		System.out.println("--------------------------------");

		// 2-3. Map 내부클래스인 EntrySet을 이용
		Set set = hmap.entrySet();

		Iterator eiter = set.iterator();
		while (eiter.hasNext()) {
			Map.Entry entry = (Map.Entry) eiter.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

	public void hashMap2() {
		HashMap productPrice = new HashMap();
		
		productPrice.put("rice", 6);
		productPrice.put("apple", 3);
		productPrice.put("banana", 5);
		productPrice.put("orange", 6);
		
		Set keys = productPrice.keySet();
		Iterator iter2 = keys.iterator();
		while(iter2.hasNext()) {
			String val = (String) iter2.next();
			String str = (String) productPrice.get(keys);
			System.out.println(val +" : " + str);
		}
		
		Collection values = productPrice.values();
		Iterator valIter = values.iterator();
		while(valIter.hasNext()) {
			System.out.println(valIter.next());
		}
		
		Object[] obj = values.toArray();
		for(int i =0; i<obj.length; i++) {
			System.out.println(obj[i]);
		}
		Set set = productPrice.entrySet();
		Iterator iter3 = set.iterator();
		while(iter3.hasNext()) {
			Map.Entry entry = (Map.Entry) iter3.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		
	}
}
