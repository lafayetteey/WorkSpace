package com.event.part02_howToUse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class D_Method extends JFrame implements ActionListener{
	private JButton button;
	private JLabel label;
	public D_Method() {
		this.setSize(200 ,200);
		this.setTitle("D_Method");
		JPanel panel = new JPanel();
		button = new JButton("버튼을 누르세요");
		label = new JLabel("아직 버튼이...");
		
		//actionperformed 메소드를 가진 클래스가 처리 (this)
		button.addActionListener(this);
		
		panel.add(button);
		panel.add(label);
		this.add(panel);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		label.setText("드디어 버튼이....");
	}

	public static void main(String[] args) {
		new D_Method();
	}

	

}
