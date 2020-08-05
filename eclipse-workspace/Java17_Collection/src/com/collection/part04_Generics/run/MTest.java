package com.collection.part04_Generics.run;

import java.util.ArrayList;
import java.util.HashSet;

import com.collection.part04_Generics.TestGenerics;

public class MTest {

	public static void main(String[] args) {
		TestGenerics tg = new TestGenerics();
		
		//tg.testGenerics2();
		//tg.testGenerics3();
		//tg.testGenerics4();
		//HashSet 중복값 허용하지 않음
		HashSet <Integer> hset = new HashSet<>();
		while(hset.size() < 6) {
			hset.add((int) (Math.random() * 45) + 1);
		}
		System.out.println(hset);
		
	}
}
