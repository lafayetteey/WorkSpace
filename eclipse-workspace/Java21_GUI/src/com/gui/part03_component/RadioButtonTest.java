package com.gui.part03_component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButtonTest extends JFrame{
	
	public static void main(String[] args) {
		
		JFrame mf = new JFrame("RadioButtonTest");
		mf.setBounds(300 , 200 , 600 , 400);
		
		JPanel topPanel = new JPanel();
		JLabel label = new JLabel("음료 크기를 선택해주세요");
		topPanel.add(label);
		mf.add(topPanel, "West");
		
		JPanel sizePanel = new JPanel();
		JRadioButton small = new JRadioButton("Small size");
		JRadioButton medium = new JRadioButton("Mediun size");
		JRadioButton large = new JRadioButton("Large size");
		
		ButtonGroup size = new ButtonGroup();
		size.add(small);
		size.add(medium);
		size.add(large);
		
		JPanel resPanel = new JPanel();
		JLabel text = new JLabel("사이즈를 선택해주세요");
		resPanel.add(text);
		mf.add(resPanel, "South");
		
		small.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("small size를 선택하셨습니다.");
			}
		});
		
		medium.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("medium size를 선택하셨습니다.");
			}
		});
		
		large.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("large size를 선택하셨습니다.");
			}
		});
		
		sizePanel.add(small);
		sizePanel.add(medium);
		sizePanel.add(large);
		mf.add(sizePanel , "Center");
		
		
		
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
