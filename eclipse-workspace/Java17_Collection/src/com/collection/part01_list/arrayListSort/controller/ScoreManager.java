package com.collection.part01_list.arrayListSort.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.collection.part01_list.arrayListSort.model.Score;
import com.collection.part01_list.arrayListSort.model.ScoreSorting;

public class ScoreManager  {
	public void scoreSort() {
		
		List list = new ArrayList();
		
		list.add(new Score("김승진" , 99));
		list.add(new Score("나순신" , 27 ));
		list.add(new Score("마관순" , 33));
		
		System.out.println("list : " + list);
		
		list.add(new Score("바하영" , 88));
		list.add(new Score("사동건" , 77));
		list.add(new Score("아경수", 66));
	
		
		System.out.println("list : " + list);
		
		//Comparable
		//Collections.sort(list);
		list.sort(null);
		System.out.println("listsort(Comparable) : " + list);
		
		
		//Comparator
		//Collections.sort(list , new ScoreSorting());
		list.sort(new ScoreSorting());
		System.out.println("listSort(Comparator) : " + list);
		
		
		
	}

}
