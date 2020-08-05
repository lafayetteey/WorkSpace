package com.gui.part02_layout;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class D_CardLayout extends JFrame {
	//컨테이너
	public D_CardLayout() {
		super("CardLayout");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(300, 200, 600, 400);

		// CardLayout
		CardLayout card = new CardLayout();
		// this 는 프레임을 애기함 (container)
		this.setLayout(card);

		// 패널 만들기
		//  패널은 컨테이너 처럼 다른 컴포넌트를 추가해줄수 있다.

		JPanel card1 = new JPanel();
		JPanel card2 = new JPanel();
		JPanel card3 = new JPanel();

		// 패널에 라벨 추가
		card1.add(new JLabel("Card1"), "1");
		card2.add(new JLabel("Card2"), "2");
		card3.add(new JLabel("Card3"), "3");

		// 배경색 넣기
		card1.setBackground(Color.PINK);
		card2.setBackground(Color.yellow);
		card3.setBackground(Color.orange);

		// 메인프레임에 추가
		this.add(card1);
		this.add(card2);
		this.add(card3);

		// 클릭 시 이벤트 발생
		// 패널에 이벤트 추가
		card1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getButton());
				if (e.getButton() == 1) {
					card.next(card1.getParent());
				}
			}
		});
		card2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getButton());
				if(e.getButton() == 1 ) {
					card.next(card2.getParent());
				}
			}
		});
		
	}
}
