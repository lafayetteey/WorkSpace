package com.gui.part02_layout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class A_BorderLayout extends JFrame {
	
	//생성자로 setting
	public A_BorderLayout() {
		//부모클래스(JFrame)의 생성자로 타이틀 지정
		super("BorderLayout");
		
		//필수적으로 호출해야하는 코드
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//frame 크기
		this.setBounds(300 ,200 , 600 , 400);
		
		//this.setLayout(new BorderLayout());
		//기본값을 설정하지 않아도 기본값이 BorderLayout 이다.
		System.out.println(this.getLayout());
		
		//버튼 영억 구현
//		JButton north = new JButton("북");
//		JButton south = new JButton("남");
//		JButton east = new JButton("동");
//		JButton west = new JButton("서");
//		JButton center = new JButton("중심");
//		
//		//구현한 버튼영역의 위치를 배치 
//		//레이아웃의 위치별로 컴포넌트 배치
//		this.add(north, "North");
//		this.add(south , "South");
//		this.add(east , "East");
//		this.add(west , "West");
//		this.add(center , "Center");
		
		//생성과 배치를 한번에 구현
		this.add(new JButton("북") , "North");
		this.add(new JButton("남"),  "South");
		this.add(new JButton("동") , "East");
		this.add(new JButton("서") , "West");
		this.add(new JButton("중앙"), "Center");
		
		
		
		
		
	}
	
}
