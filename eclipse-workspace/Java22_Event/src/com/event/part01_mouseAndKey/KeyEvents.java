package com.event.part01_mouseAndKey;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class KeyEvents extends JFrame implements KeyListener {
	public KeyEvents() {
		super("KeyEvents");
		this.setTitle("Key Event");
		
		this.setSize(300 , 200);
		JTextField tf = new JTextField(30);
		tf.addKeyListener(this);
		this.add(tf);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	
	}
	
	
	

	public static void main(String[] args) {
		new KeyEvents();
	}

	public void display(String s , KeyEvent e) {
		//ctrl + shift = alt
		String str = e.isAltDown() + " " + e.isControlDown() + " " + e.isShiftDown();

		System.out.println(s+ " " + e.getKeyChar() +" " + str);
	}


	@Override
	public void keyTyped(KeyEvent e) {
		this.display("KeyTyped" , e);
	}




	@Override
	public void keyPressed(KeyEvent e) {
		this.display("keyPressed", e);
	}




	@Override
	public void keyReleased(KeyEvent e) {
		this.display("keyReleased", e);
	}

}
