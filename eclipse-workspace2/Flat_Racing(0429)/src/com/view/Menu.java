package com.view;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Menu extends JFrame {
	public Menu() {
		
		JPanel panel= new Panel1(this);
		
		this.setSize(1900, 1000);
		this.setLayout(null);

		this.add(panel);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public void closeWindow() {
		this.dispose();
	}
	

}
