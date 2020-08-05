package com.collection.part04_Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.collection.part02_set.controller.Score;

public class TestGenerics {
	//실행 시 예외방지를 위해 타입을 강하게 체크해줌
	public void testGenerics1() {
		List list = new ArrayList();
		list.add(new String("Object saved"));
		list.add(new Score());
		list.add(new Student());
		list.add(new Car());
		list.add(new Book());
		System.out.println("저장된 객체 수 : " + list.size());
		System.out.println("list : " + list);
		
		
		for(int i=0; i<list.size(); i++) {
			Object obj = list.get(i);
			System.out.println("obj : " +obj.toString());
			
			if(obj instanceof Book) {
				((Book)obj).printBook();
			}
			if(obj instanceof Student) {
				((Student)obj).score();
			}
			if(obj instanceof Car) {
				((Car)obj).printCar();
			}
		}	
	}
	
	public void testGenerics2() {
		//제네릭스 : 컬렉션에 저장되는 객체의 자료형에 제한을 거는 기능
		//컬렉션에 한가지 종류의 객체만 저장되기 때문에
		//꺼내서 사용할때 객체 레퍼런스 형변환이 필요하지 않다.
		ArrayList<Book> list = new ArrayList<Book>();
		ArrayList list2 = new ArrayList();
		
		list.add(new Book());
		list.add(new Book());
		
		list2.add(new Book());
		list2.add(new Book());

		for(Object ob : list2) {
			((Book)ob).printBook();
		}
		
		for(Book b : list) {
			b.printBook();
		}
	}
	
	public void testGenerics3() {
		//Map에 제네릭스를 적용
		//Map 은 key , value 값 모두 제네릭스 값 설정해줘야 한다.
		HashMap<String , Book> map = new HashMap<String , Book>();
		
		map.put("one", new Book("java"));
		map.put("two", new Book("oracle"));
		
		
		System.out.println(map);
	}

	public void testGenerics4() {
		HashMap<String, Book> map = new HashMap<>();
		
		map.put("one", new Book("Java"));
		map.put("two", new Book("Oracle"));
		map.put("three", new Book("JDBC"));
		
		Set<Map.Entry<String , Book>> entry = map.entrySet();
		Iterator<Map.Entry<String, Book>> iter = entry.iterator();
		while(iter.hasNext()) {
			Map.Entry<String, Book> ent = iter.next();
			String key = ent.getKey();
			Book val = ent.getValue();
			System.out.println(key + " : " + val);
		}	
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Book b = map.get(key);
			System.out.println(key + " : " + b);
		}
		
		
	}

}

//한 클래스 파일 안에 여러개의 클래스 정의 가능하다.
//접근제한자 사용불가하다.
class Student {
	public Student() {}
	public void score() {
		System.out.println("score() call");
	}
	@Override
	public String toString() {
		return "Student";
	}
}

class Car {
	public Car () {}
	public void printCar() {
		System.out.println("printCar() call");
	}
	@Override
	public String toString() {
		return "Car";
	}
}

class Book {
	private String title;
	public Book() {}
	public Book(String title) {
		this.title = title;
	}
	public void printBook() {
		System.out.println("printBook() call");
	}
	@Override
	public String toString() {
		return "Book";
	}
}