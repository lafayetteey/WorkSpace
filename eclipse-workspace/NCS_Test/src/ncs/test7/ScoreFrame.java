package ncs.test7;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ScoreFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField javaScore;
	JTextField sqlScore;
	JTextField avgResult;
	JTextField total;
	
	public ScoreFrame() {
		this.setTitle("점수 계산기");
		this.setBounds(600, 200, 400, 350);

		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(null);

		JLabel mainText = new JLabel("점수를 입력하세요");
		mainText.setFont(new Font("맑은 고딕", Font.BOLD, 35));
		mainText.setBounds(50, 10, 300, 50);
		mainPanel.add(mainText);

		Font f = new Font("맑은고딕", Font.BOLD, 15);

		JLabel java = new JLabel("자바 :");
		java.setBounds(20, 80, 50, 50);
		java.setFont(f);
		mainPanel.add(java);

		javaScore = new JTextField();
		javaScore.setBounds(70, 96, 100, 20);
		javaScore.setFont(f);
		mainPanel.add(javaScore);

		JLabel sql = new JLabel("SQL :");
		sql.setBounds(210, 80, 50, 50);
		sql.setFont(f);
		mainPanel.add(sql);

		sqlScore = new JTextField();
		sqlScore.setBounds(260, 96, 100, 20);
		sqlScore.setFont(f);
		mainPanel.add(sqlScore);

		JButton calcBtn = new JButton("계산하기");
		calcBtn.setBounds(145, 170, 100, 30);
		calcBtn.setFont(f);
		mainPanel.add(calcBtn);

		JLabel totalScore = new JLabel("총점 : ");
		totalScore.setBounds(20, 250, 50, 50);
		totalScore.setFont(f);
		mainPanel.add(totalScore);

		total = new JTextField(20);
		total.setBounds(70, 266, 100, 20);
		total.setFont(f);
		mainPanel.add(total);
		
		JLabel average = new JLabel("평균 :");
		average.setBounds(210,250,50,50);
		average.setFont(f);
		mainPanel.add(average);
		
		avgResult = new JTextField(20);
		avgResult.setBounds(260 , 266 , 100 , 20);
		avgResult.setFont(f);
		mainPanel.add(avgResult);
		
		
		calcBtn.addActionListener(new ScoreFrame$ActionHandler() {
		});
		
	
		this.add(mainPanel);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}
	
	private class ScoreFrame$ActionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			int jScore = Integer.parseInt(javaScore.getText());
			int sScore = Integer.parseInt(sqlScore.getText());
			
			int sum = jScore + sScore;
			
			total.setText(Integer.toString(sum));
			avgResult.setText(Integer.toString(sum/2));
		}
	}

}



