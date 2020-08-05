package com.view;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//button4 새창
	class Info1 extends JFrame {
		
		
		Info1() {
			
			//bgm 재생
			File file = new File("sound/s1.wav");
			System.out.println(file.exists());
			
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
			
		setTitle("포켓몬 정보");

		JPanel NewWindowContainer = new JPanel();
		setContentPane(NewWindowContainer);

		JLabel NewLabel = new JLabel(new ImageIcon("images/피카츄정보.png"));

		NewWindowContainer.add(NewLabel);
		        
		
		setSize(600,430);
		setResizable(false);
		setVisible(true);
		    }
		
		
		}