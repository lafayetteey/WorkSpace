package com.gui.part01_container;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class JFrameTest extends JFrame{
	//컴포넌트 : 텍스트필드 와 버튼등을 구현 
	//컨테이너 : 다른 컴포넌트를 묶음
	//컨테이너를 먼저 구현 후 그 안에 각각의 컴포넌트들을 구현 후 배치 
	//이벤트 :  컴포넌트를 클릭하거나 하면 발생되는 이벤트 구현
	
	
	//프레임을 생성하는 방법 1
	//JFrame 상속(extends)
	//생성자에 프레임에 대한 설정을 해준다
	public JFrameTest() {
		//프레임의 크기를 지정
//		this.setLocation( 300 , 200);
//		this.setSize(800 , 600);
		this.setBounds( 300 , 200 , 800 , 600 );
		//화면에 띄움
		this.setVisible(true);
		
		//닫기 버튼을 눌러도 프로세스는 실행중
		//프로그램 종료 시 프로세스도 정상 종료  될 수 있게 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//프레임 상단에 타이틀 설정
		this.setTitle("도서 관리 프로그램");
		
		//외부이미지 삽입
		try {
			this.setIconImage(ImageIO.read(new File("images/icon.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//프레임 사이즈 조정 비활성화
		this.setResizable(false);
		//true : 사이즈 조정 활성화 , 기본값
		
	}
	
	
	
}
