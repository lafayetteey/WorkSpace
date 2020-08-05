package com.gui.part02_layout;

import java.awt.GridLayout;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;

public class C_GridLayout extends JFrame {

	public C_GridLayout() {
		super("GridLayout");
		
		//아래 3개의 메소드는 필수적으로 생성
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(300 , 200 , 600 , 400);
		this.setResizable(false);
		//GridLayout
		//가로 , 세로 , 가로갭 , 세로갭 순서로 입력
		this.setLayout(new GridLayout( 5 , 5  /*, 10 , 20*/));
		
		/*for(int i =0; i<30; i++) {
			String str = new Integer(i).toString();
			this.add(new JButton(str));
		}*/
		
		//set을 이용해 중복 제거하여 랜덤으로 빙고판 만들기
//		HashSet<Integer> hset = new HashSet<>();		
//		while (hset.size() < 25) {
//			hset.add((int)(Math.random() * 25) + 1);
//		}
//		Iterator<Integer> iter = hset.iterator();
//		while(iter.hasNext()) {
//			String str = iter.next().toString();
//			this.add(new JButton(str));
//		}
		
		Set set = new LinkedHashSet();
		
		while(set.size() < 25) {
			set.add(new Random().nextInt(25) + 1);
		}
		System.out.println(set);
		Object[] obj = 	set.toArray();
		for(int i=0; i<obj.length; i++) {
			String str = new Integer((int)obj[i]).toString();
			this.add(new JButton(str));		
		}
		

		
		
	}
}
