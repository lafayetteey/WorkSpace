package com.view;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
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


public class Panel1 extends JPanel implements MouseListener, MouseMotionListener {
	
	//맨처음 배경이미지 
	ImageIcon icon = new ImageIcon("images/1.jpg");
	static JFrame mf;
	
	AudioInputStream stream = null;
	Clip clip = null;
	public void paint(Graphics g) {
		g.drawImage(icon.getImage(), 0, 0, getWidth(), getHeight(), this);
	}
	
	 
	public Panel1(JFrame mf) {
		this.mf = mf;
		this.setLayout(null);
		this.setSize(1900, 1000);
		JButton button = new JButton(new ImageIcon("images/시작.png"));
		add(button);
		button.setBounds(0, 0, 1900	,1000);		
		//버튼 투명화
		button.setBorderPainted(false);
		button.setContentAreaFilled(false);
		button.setFocusPainted(false);
		button.setOpaque(false);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				forward();
				clip.stop();
			}
		});
		
		//bgm 재생
		File file = new File("sound/test2.wav");
		
		try {
			stream = AudioSystem.getAudioInputStream(file);
			clip = AudioSystem.getClip();
			clip.open(stream);
			clip.start();
			
		} catch (UnsupportedAudioFileException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (LineUnavailableException e1) {
			e1.printStackTrace();
		}
		
	}
	
	//앞으로가기
	public void forward() {
		mf.remove(this);
		mf.add(new Panel2(mf));
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
