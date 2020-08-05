package com.view;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Menu2 extends JFrame {
	AudioInputStream stream = null;
	static Clip clip = null;
	public Menu2() {
		
		
		//결과AudioInputStream stream = null;
		
		File file = new File("sound/victory.wav");
		
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
		
		
		
		
		JPanel panel= new Final(this);
		
		this.setSize(1900, 1000);
		this.setLayout(null);

		this.add(panel);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	

}
