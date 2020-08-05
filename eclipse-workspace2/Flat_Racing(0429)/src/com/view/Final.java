package com.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.controller.Controller;
import com.model.money;

public class Final extends JPanel{

	JFrame mf = null;
	JFrame mf3 = null;
	Controller co = new Controller() ;
	money mo = new money(); ;
	public Final(JFrame mf3) {
		
		
		
		// 결과화면  bgm
		
		File file = new File("sound/victory.wav");
		
		try {
			AudioInputStream stream = AudioSystem.getAudioInputStream(file);
			Clip clip = AudioSystem.getClip();
			clip.open(stream);
			clip.start();
			
		} catch (UnsupportedAudioFileException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (LineUnavailableException e1) {
			e1.printStackTrace();
		}
	  
		
		mf = mf3;
		
		
		this.setSize(1900,1000);
		this.setBackground(Color.WHITE);
		setLayout(null);
		
		//끝내기 버튼
		JButton bt1 = new JButton(new ImageIcon("images/끝내기.png"));
		//전체순위
		JTextArea ta = new JTextArea();
		//우승자+금액
		JTextArea ta2 = new JTextArea();
		
		
		//우승 포켓몬 이미지
		String a= null;
		switch(mo.getMoney()) {
		case "피카츄":
			a ="images/피1" ;
			break;
		case "캐터피":
			a ="images/캐1";
			break;
		case "토개피": 
			a ="images/토1";
			break;
		case "롱스톤": 
			a ="images/롱1";
			break;	
		
		}
	
		JButton bt2 = new JButton(new ImageIcon(a+".png"));
		
		JButton bt3 = new JButton(new ImageIcon("images/결과.png"));
		
		
		//버튼 및 텍스트필드 위치크기
		bt1.setBounds(1450, 850, 250, 100);
		bt2.setBounds(300,200,500,500);
		bt3.setBounds(850, 20, 200, 100);
		
		bt3.setBorderPainted(false);
		bt3.setContentAreaFilled(false);
		bt3.setFocusPainted(false);
		bt3.setOpaque(false);
		
		bt1.setBorderPainted(false);
		bt1.setContentAreaFilled(false);
		bt1.setFocusPainted(false);
		bt1.setOpaque(false);
		
		ta.setBounds (1000,300, 300, 350);
		ta2.setBounds(1000,150, 300, 100);

		
		//버튼 및 텍스트필드 추가
		add(bt1);
		//우승자
		add(bt2);
		add(bt3);
		
		add(ta);
		add(ta2);
		
		//버튼 및 텍스트필드 글씨체
		bt1.setFont(new Font("경기천년제목",Font.BOLD,20));
		ta.setFont(new Font("경기천년제목",Font.BOLD,40));
		ta2.setFont(new Font("경기천년제목",Font.BOLD,40));
		
		//전체순위 출력
		StringBuilder sb = co.fileOpen();
		ta.setText(sb.toString());
		
		//우승자 출력
		co.rank(mo);
		String rank = co.rank(mo);
		ta2.setText(rank);

	
		bt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
	}

}
