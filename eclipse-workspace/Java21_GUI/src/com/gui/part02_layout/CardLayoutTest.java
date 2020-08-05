package com.gui.part02_layout;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CardLayoutTest {
	public static void main(String[] args) {
		JFrame mf = new JFrame();
		
		mf.setBounds(300 , 200 , 800 , 500 );
		CardLayout card = new CardLayout();
		mf.setLayout(card);
		
		JPanel card1 = new JPanel();
		JPanel card2 = new JPanel();
		JPanel card3 = new JPanel();
		
		//배경색 지정
		card1.setBackground(Color.PINK);
		card2.setBackground(Color.orange);
		card3.setBackground(new Color(50, 100 , 50));
		
		//패널에 라벨 추가
		card1.add(new JLabel("Card1") , "1");
		card2.add(new JLabel("Card2") ,"2" );
		card3.add(new JLabel("Card3") , "3");
		
		
		//패널에 이벤트 추가
		card1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getButton());
				if(e.getButton() == 1) {
					card.next(card1.getParent());
				}
				if(e.getButton() == 3) {
					card.previous(card1.getParent());
				}
			}
		});
		
		card2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getButton());
				if(e.getButton() == 1) {
					card.next(card2.getParent());
				}
				if(e.getButton() ==3 ) {
					card.previous(card2.getParent());
				}
			}
		});
		card3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getButton());
				if(e.getButton() == 1) {
					card.next(card3.getParent());
				}
				if(e.getButton() == 3) {
					card.previous(card3.getParent());				}
			}
		});
		
		mf.add(card1);
		mf.add(card2);
		mf.add(card3);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
