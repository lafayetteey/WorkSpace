package com.collection.part02_set.run;

import com.collection.part02_set.controller.TestHashSet;
import com.collection.part02_set.controller.TestLinkedHashSet;

public class MTest {

	public static void main(String[] args) {
		TestHashSet ths = new TestHashSet();
		TestLinkedHashSet tls = new TestLinkedHashSet();
		
		tls.testLinkedHashSet();
		ths.testHashSet();
	}

}
