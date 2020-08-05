package com.gui.part03_component;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckBoxTest {
	public static void main(String[] args) {
		JFrame mf = new JFrame("CheckBoxTest");
		
		String[] fruits = { "apple" , "orange" , "grape" , "banana" , "strawberry" };
		
		JCheckBox[] buttons = new JCheckBox[5];
		for(int i=0; i<buttons.length; i++) {
			buttons[i] = new JCheckBox(fruits[i]);
		}
		//패널에 추가
		JPanel checkPanel = new JPanel();
		for(int i=0; i<buttons.length; i++) {
			checkPanel.add(buttons[i]);
		}
		JPanel resPanel = new JPanel();
		JLabel text = new JLabel("과일을 선택해주세요");
		resPanel.add(text);
		
		for(int i=0; i<buttons.length; i++) {
			buttons[i].addItemListener(new ItemListener() {
				@Override
				public void itemStateChanged(ItemEvent e) {
					String result = " ";
					int count = 0;
					for(int i=0; i<buttons.length; i++) {
						if(buttons[i].isSelected()) {
							result += buttons[i].getText();
							count ++;
						}
						text.setText(result);
					}
					if(count == 0) {
						text.setText("선택한 과일이 없습니다.");
					}
				}
			});
		}
		mf.add(resPanel , "Center");
		
		mf.add(checkPanel , "North");
		mf.pack();
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
