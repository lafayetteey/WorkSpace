package com.view;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;

import com.model.money;

@SuppressWarnings("serial")
class GraphicsExam {
	static RaceFrame frame = new RaceFrame();

	 public void openWindow() {
	  
	  frame.setSize(1900,1000);
	  frame.setVisible(true);
	  frame.addWindowListener(new WindowAdapter(){
		  
	   public void windowClosing (WindowEvent  e) {
	    frame.dispose();
	   }
	  });
	 }
	 
	 public void windowClose() {
		 frame.dispose();
	 }

	}

	//@SuppressWarnings 경고를 없애주는 역할
	@SuppressWarnings("serial")
	class RaceFrame extends Frame implements ActionListener {
		
		AudioInputStream stream = null;
		static Clip clip = null;
		RaceFrame frame;
		
	
	 static RaceThreadx thread1;
	 static RaceThreadx thread2;
	 static RaceThreadx thread3;
	 static RaceThreadx thread4;
	 
	 //경기시작버튼
	 Button startButton = new Button("달려달려");
//	 Button clearButton = new Button("다시다시");
	 Dimension d;
     
	 //money객체 생성
	 money mo = new money();
	 
	 //순위를 나타내주기위해 int i 생성
	 int i[] = {0,0,0,0};
	 //순위별로 들어온 포켓몬 초기화 시키기 위해 j생성
	 String j[] = {"","","",""};
	 
	 boolean re1=true,re2=true,re3=true,re4=true;
	 
	 public RaceFrame(){

	  super("레이싱 게임");
	 
	  
	  setLayout(new BorderLayout());
	  
	//버튼 만들어 이벤트 처리
	  startButton.addActionListener(this);

	  Panel p = new Panel();
	  add("North",p);
	  p.add(startButton);
	 
	  
	  //쓰레드 생성
	  thread1 = new RaceThreadx(this, 10, 150);
	  thread2 = new RaceThreadx(this, 10, 250 );
	  thread3 = new RaceThreadx(this, 10, 350);
	  thread4 = new RaceThreadx(this, 10, 450 );
	  
	  repaint();
	 }
	 
	 
	 public void actionPerformed(ActionEvent e){
	  String str = e.getActionCommand();
	  System.out.println(str);
	  if(str.equals("달려달려")){
	   
		  
	   thread1.start();
	   thread2.start();
	   thread3.start();
	   thread4.start();
	  }

	 }
	 
	 
	 public void update(Graphics g){
	  super.update(g);
	  System.out.println("update");
	 }
	 
	 public void paint(Graphics g){	
		 
		 //경주배경화면
			ImageIcon icon = new ImageIcon("images/6.png");
				g.drawImage(icon.getImage(), 0, 0, getWidth(), getHeight(), this);
		 
		 String res1=" ",res2=" ",res3= " ",res4=" " ;
	  System.out.println("paint");
	  
	  //도착지점
//	  g.drawLine(1570, 0, 1570, 1000);
	  

	  //1등~5등 을 판별해서 출력 처리
	  for(int k=0;k<i.length;k++){
	   if(thread1.x == 1570 && i[k]==0&&re1){i[k]=1;re1=false;j[k]="피카츄";break;}
	   else if(thread2.x == 1570 && i[k]==0&&re2){i[k]=2;re2=false;j[k]="캐터피";break;}
	   else if(thread3.x == 1570 && i[k]==0&&re3){i[k]=3;re3=false;j[k]="토개피";break;}
	   else if(thread4.x == 1570 && i[k]==0&&re4){i[k]=4;re4=false;j[k]="롱스톤";break;}
	  }
//	  if(i[0]>0)  g.drawString("1등 "+j[0],500,350);   
//	  if(i[1]>0) g.drawString("2등 "+j[1],500,350+20);
//	  if(i[2]>0) g.drawString("3등 "+j[2],500,350+40);
//	  if(i[3]>0) g.drawString("4등 "+j[3],500,350+60);
	  
	  String money = j[0];
	  mo.setMoney(money);
	  
	  //경기결과 txt에 입력
	  try (BufferedWriter bw = new BufferedWriter(new FileWriter("race.txt"));) {

		  if(i[0]>0) {
			 
			  res1 = "1등 "+j[0]+ " 우승\n";
			  bw.write(res1);

		  }
		  if(i[1]>0) {
			  res2 = "2등 "+j[1]+ " 준우승\n";
			  bw.write(res2);
		  }
		  if(i[2]>0) {
			res3 = "3등 "+j[2]+ "\n";
			  bw.write(res3);
		  }
		  if(i[3]>0) {
			  res4 = "4등 "+j[3]+"\n";
			  bw.write(res4);
		  }

	  } catch (FileNotFoundException e) {
		 	e.printStackTrace();
	 } catch (IOException e) {
		    e.printStackTrace();
	 }
	  
	  //4마리 포켓몬 이미지
	  Image icon1 = new ImageIcon("images/피카츄픽셀.png").getImage();
	  Image icon2 = new ImageIcon("images/캐터피픽셀.png").getImage();
	  Image icon3 = new ImageIcon("images/토개피픽셀.png").getImage();
	  Image icon4 = new ImageIcon("images/롱스톤픽셀.png").getImage();
	  
	  
	  g.drawImage(icon1, thread1.x, 100, 100, 100, this);
	  g.drawImage(icon2, thread2.x, 250, 100, 100, this);
	  g.drawImage(icon3, thread3.x, 400, 100, 100, this);
	  g.drawImage(icon4, thread4.x, 550, 100, 100, this);
	 }
	}
	

	
	
	//쓰레드
	class RaceThreadx extends Thread{
	 AudioInputStream stream = null;
		static Clip clip = null;
		RaceFrame frame;
	 
	 int x,y;
	 
	 public RaceThreadx(RaceFrame frame, int x, int y){
	  this.frame = frame;
	  this.x = x;
	  this.y = y;
	
	 }

	 public void run(){
		 
		 
		//달릴때 bgm 
		 File file = new File("sound/g.wav");
			System.out.println(file.exists());
			
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
		 
		 
			//각 말마다 랜덤값에 의해 이동하는 거리를 다르게 주기 위해 사용
	  Random r = new Random(); 
	  Dimension d = frame.getSize();

	  
	  int widthLast = (int)(d.getWidth() - (2*x));
	  for( ; x <= widthLast-10; x += 10){   
	   frame.repaint();
	   
	   try{
	    Thread.sleep(r.nextInt(100));
	   }catch(Exception e){}
	  
	  
	  frame.repaint();
	 }

	  
	  
	  //경기 종료시 프레임 띄워서 경기종료 버튼 띄우기 
	  if(		(RaceFrame.thread1.isAlive() &&
			  	!RaceFrame.thread2.isAlive() &&
			  	!RaceFrame.thread3.isAlive() &&
				!RaceFrame.thread4.isAlive()) ||
				
				(!RaceFrame.thread1.isAlive() &&
			  	RaceFrame.thread2.isAlive() &&
			  	!RaceFrame.thread3.isAlive() &&
				!RaceFrame.thread4.isAlive()) ||
				
				(!RaceFrame.thread1.isAlive() &&
			  	!RaceFrame.thread2.isAlive() &&
			  	RaceFrame.thread3.isAlive() &&
				!RaceFrame.thread4.isAlive()) ||
				
				(!RaceFrame.thread1.isAlive() &&
			  	!RaceFrame.thread2.isAlive() &&
			  	!RaceFrame.thread3.isAlive() &&
				RaceFrame.thread4.isAlive()) ||
				
				(!RaceFrame.thread1.isAlive() &&
			  	!RaceFrame.thread2.isAlive() &&
			  	!RaceFrame.thread3.isAlive() &&
				!RaceFrame.thread4.isAlive())){
		  
	  ResultPage rp = new ResultPage();
	  rp.Result();
	  }
	 }
	}

