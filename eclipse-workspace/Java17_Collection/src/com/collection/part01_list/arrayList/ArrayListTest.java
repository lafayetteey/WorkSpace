package com.collection.part01_list.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ArrayListTest {
	public void testArrayList() {
		//ArrayList는 객체 생성 시 자동으로 10칸짜리 배열을 생성한다.
		ArrayList alist = new ArrayList();
		
		//다형성 
		//List list = new ArrayList();
		//최상위 컬렉션
		//Collection clist = new ArrayList();
		
		//저장순서가 유지된다. index 적용
		//객체만 저장가능하다
		alist.add("apple");
		alist.add(123); //autoBoixng(data --> Object) 로 자동변환
		alist.add(45.67);
		alist.add(new Date());
		
		//toString이  Overriding 됨
		//저장 순서를 유지하며 출력
		System.out.println("alist" + alist);
		
		//lenght 대신 size
		//[] 대신 get
		for(int i=0; i<alist.size(); i++) {
			System.out.println(i + ": " + alist.get(i));
		}
		//자동으로 추가되며 중복 저장을 허용한다.
		alist.add("apple");
		System.out.println("alist" + alist);
		
		for(int i=0; i<alist.size(); i++) {
			System.out.println(i + ":" + alist.get(i));
		}
		
		//인덱스 지정 후 원하는 값을 넣을 수 잇음 (자동정렬)
		//해당 인덱스에 있던 원래 값은 자동으로 뒤로 밀려남
		alist.add(1, "banana");
		System.out.println("alist" + alist);
		
		//삭제하고 싶은 인덱스를 지정하여 삭제
		alist.remove(2);
		System.out.println("alist" + alist);
	}	
	
	public void testArrayListSort() {
		//ArrayList는 오름차순 정렬가능한 sort() 메소드
		ArrayList list = new ArrayList();
		
		list.add("apple");
		list.add("banana") ;
		list.add("orange");
		list.add("mango");
	
		System.out.println("list : " + list) ;
		
		Collections.sort(list);
		System.out.println("listSort : " + list);
		
		
	}
	public void testArrayList2() {
		ArrayList alist = new ArrayList();
		
		alist.add("String obj");
		alist.add(123);
		alist.add('a');
		alist.add(45.67);
		
		for(int i=0; i<alist.size(); i++) {
			System.out.println(alist.get(i));
		}
		//오름차순 정렬
		Collections.sort(alist);
		System.out.println(alist);
	}

}
