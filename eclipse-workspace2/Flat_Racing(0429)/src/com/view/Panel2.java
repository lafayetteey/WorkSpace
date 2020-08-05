package com.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.controller.Controller;
import com.model.money;

public class Panel2 extends JPanel implements MouseListener, MouseMotionListener{
	static JFrame mf = null;
	static GraphicsExam ge = new GraphicsExam();
	static JPanel mp = new JPanel();
	money mo = new money();
	Controller co = new Controller();
	
	public Panel2(JFrame mf2) {
		
		this.mf = mf2;
		mp = this;
		this.setSize(1900, 1000);
		this.setBackground(Color.yellow);
		setLayout(null);
		//콤보박스
		String[] people = {"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"};
		
		//이미지,버튼 초기화
		JButton button1 = new JButton(new ImageIcon("images/이전.png"));
		JButton button2 = new JButton(new ImageIcon("images/입력.png"));
		JButton start = new JButton(new ImageIcon("images/게임시작.png"));
		
		//콤보박스생성
		JComboBox rbutton = new JComboBox(people);
		JComboBox rbutton1 = new JComboBox(people);
		JComboBox rbutton2 = new JComboBox(people);
		JComboBox rbutton3 = new JComboBox(people);
		
		//4마리 포켓몬 버튼으로 이미지화
		JButton button4 = new JButton(new ImageIcon("images/피카츄2.png"));
		JButton button5 = new JButton(new ImageIcon("images/캐터피2.png"));
		JButton button6 = new JButton(new ImageIcon("images/토개피2.png"));
		JButton button7 = new JButton(new ImageIcon("images/롱스톤2.png"));
		
		
		button1.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			@Override
			public void mousePressed(MouseEvent e) {
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button1.setIcon(new ImageIcon("images/이전.png"));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				button1.setIcon(new ImageIcon("images/이전2.png"));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		
		
		start.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				start.setIcon(new ImageIcon("images/게임시작.png"));
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				start.setIcon(new ImageIcon("images/게임시작2.png"));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		

		//새창
		button4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Info1();
			}
		});
		
		button5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Info2();
			}
		});
		
		button6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Info3();
			}
		});
		
		button7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Info4();
			}
		});
		

		
		JTextField tf1 = new JTextField(20);
		JTextField tf2 = new JTextField(20);
		JTextField tf3 = new JTextField(20);
		JTextField tf4 = new JTextField(20);
		
		
		
		//이미지,버튼 사이즈 초기화
		button1.setBounds(30, 10, 168, 100);
		button2.setBounds(1600, 20, 168, 67);
		
		button4.setBounds(180, 140, 300, 600);
		button5.setBounds(580, 140, 300, 600);
		button6.setBounds(980, 140, 300, 600);
		button7.setBounds(1380, 140, 300, 600);
		
		start.setBounds(700, 10, 450, 100);
		
		// 금액 표기 (글꼴, 크기)
		tf1.setFont(new Font("경기천년제목",Font.BOLD,40));
		tf2.setFont(new Font("경기천년제목",Font.BOLD,40));
		tf3.setFont(new Font("경기천년제목",Font.BOLD,40));
		tf4.setFont(new Font("경기천년제목",Font.BOLD,40));
		
		
		rbutton.setBounds(180, 760, 300, 40);
		rbutton1.setBounds(580, 760, 300, 40);
		rbutton2.setBounds(980, 760, 300, 40);
		rbutton3.setBounds(1380, 760, 300, 40);
		
		rbutton.setFont(new Font("경기천년제목",Font.BOLD,20));
		rbutton1.setFont(new Font("경기천년제목",Font.BOLD,20));
		rbutton2.setFont(new Font("경기천년제목",Font.BOLD,20));
		rbutton3.setFont(new Font("경기천년제목",Font.BOLD,20));
		
		
		
		tf1.setBounds(180, 820, 300, 80);
		tf2.setBounds(580, 820, 300, 80);
		tf3.setBounds(980, 820, 300, 80);
		tf4.setBounds(1380, 820, 300, 80);
		
		
		//버튼배경투명화
		button1.setBorderPainted(false); //외곽선
		button1.setContentAreaFilled(false); //내용영역
		button1.setFocusPainted(false);//선택되었을때 생기는 테두리
		button1.setOpaque(false);//투명하게
		
		button2.setBorderPainted(false);
		button2.setContentAreaFilled(false);
		button2.setFocusPainted(false);
		button2.setOpaque(false);
		
		start.setBorderPainted(false);
		start.setContentAreaFilled(false);
		start.setFocusPainted(false);
		start.setOpaque(false);
		
	
	
		
				
		//이미지 버튼 패널 추가
		this.add(button1);
		this.add(button2);
		
		this.add(button4);
		this.add(button5);
		this.add(button6);
		this.add(button7);
		
		this.add(start);

		this.add(rbutton);
		this.add(rbutton1);
		this.add(rbutton2);
		this.add(rbutton3);
		
		this.add(tf1);
		this.add(tf2);
		this.add(tf3);
		this.add(tf4);
		
		//액션리스너

		start.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(mo.getP1m() == null) {
					
					tf1.setText("인원을 입력하세요");
					tf2.setText("인원을 입력하세요");
					tf3.setText("인원을 입력하세요");
					tf4.setText("인원을 입력하세요");
				}else {
					ge.openWindow();
				}
				

			}
		});
		
		
		
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mo.setP1m(null);
				mo.setP2m(null);
				mo.setP3m(null);
				mo.setP4m(null);
				back();
			}
		});
	
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {


				String a = (String)rbutton.getSelectedItem();
				String b = (String)rbutton1.getSelectedItem();
				String c = (String)rbutton2.getSelectedItem();
				String d = (String)rbutton3.getSelectedItem();
				
				
				int p1 = Integer.parseInt(a);
				int p2 = Integer.parseInt(b);
				int p3 = Integer.parseInt(c); 
				int p4 = Integer.parseInt(d);
				
				mo.setP1(p1);
				mo.setP2(p2);
				mo.setP3(p3);
				mo.setP4(p4);
			
				System.out.println(p1+","+p2+","+p3+","+p4+",");
				System.out.println("Panel2 mo : "+mo);
				co.pm(mo);
				
				
				tf1.setText(mo.getP1m());
				tf2.setText(mo.getP2m());
				tf3.setText(mo.getP3m());
				tf4.setText(mo.getP4m());
			}
		});
	}
	
	//메소드

	//뒤
	public void back() {
		mf.remove(this);
		mf.add(new Panel1(mf));
		mf.repaint();
		mf.revalidate();
	}


	@Override
	public void mouseDragged(MouseEvent e) {
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
}

