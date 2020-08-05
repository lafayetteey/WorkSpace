package com.view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.controller.Controller;
import com.model.money;

//경기종료 후 새창 띄우기
	class ResultPage extends JFrame {
		Controller co = new Controller() ;

		money mo = new money();
		static JFrame mf;
		static JPanel mp = new JPanel();
		AudioInputStream stream = null;
		Clip clip = null;
		public void Result() {
			

			  JFrame frame1 = new JFrame();
			  
			  frame1.setBounds(0, 0, 700, 700);
			  frame1.setVisible(true);
			  JButton button = new JButton("경기가 종료되었습니다.");
			  button.setFont(new Font("경기천년제목",Font.BOLD,20));
			  button.setBounds(0, 0, 700, 700);
			  frame1.add(button);
			  frame1.addWindowListener(new WindowAdapter(){
			   public void windowClosing (WindowEvent  e) {
			    frame1.dispose();
			   }
			  });
				button.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						Thread.interrupted();
						  RaceThreadx.interrupted();
						  
						  RaceFrame.thread1.interrupt();
						  RaceFrame.thread2.interrupt();
						  RaceFrame.thread3.interrupt();
						  RaceFrame.thread4.interrupt();
						  
						  GraphicsExam.frame.dispose();
						  RaceThreadx.clip.stop();
						  
						  //확인창 종료
						  frame1.dispose();
						  //게임창
						  
						  new Menu2();
					}
				});
			}
	}
