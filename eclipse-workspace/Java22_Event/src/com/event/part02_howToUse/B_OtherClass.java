package com.event.part02_howToUse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class B_OtherClass extends JFrame{
	private JButton button;
	private JLabel label;
	
	public B_OtherClass() {
		this.setTitle("OtherClass");
		this.setSize(200, 200);
		
		JPanel panel = new JPanel();
		button = new JButton("버튼을 눌러보세요");
		label = new JLabel("아직 버튼이....");
		
		button.addActionListener(new MyEvent(button , label));
		panel.add(button);
		panel.add(label);
	
		
		
		this.add(panel);
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

class MyEvent implements ActionListener {
	private JButton button;
	private JLabel label;
	
	public MyEvent() {}
	
	public MyEvent(JButton button , JLabel label) {
		//this = myevent 클래스
		button.addActionListener(this);
		this.label = label;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		label.setText("드디어 버튼이.....");
	}
	
}
