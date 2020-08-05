package com.gui.part02_layout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutTest extends JFrame{
	public static void main(String[] args) {
		JFrame mf = new JFrame();
		
		mf.setSize(600 , 400);
		
		mf.setLayout(new GridLayout(5 , 5));
		
		for(int i=1; i<26; i++) {
			String str = new Integer(i).toString();
			mf.add(new JButton(str));
		}
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
