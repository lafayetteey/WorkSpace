package project.view;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import project.controller.LibraryManager;

public class addBook_GUI extends JFrame {

   private static final long serialVersionUID = 1L;

   ImageIcon icon;

   public addBook_GUI(LibraryManager lm, JFrame mf) {
      this.setSize(900, 750);
      this.setTitle("도서 추가");
      this.setLocation(500, 0);
      this.setLayout(new GridLayout(2, 1));
      try {
         this.setIconImage(ImageIO.read(new File("images/book.png")));
      } catch (IOException e) {
         e.printStackTrace();
      }

      icon = new ImageIcon("images/addbook.jpg");

      JPanel panel1 = new JPanel() {
		private static final long serialVersionUID = 1L;

		public void paint(Graphics g) {
            g.drawImage(icon.getImage(), 0, 0, 900, 350, null);
            setOpaque(false);
            super.paintComponent(g);
         }
      };

      JPanel panel2 = new JPanel();
      panel2.setLayout(null);
      Font f = new Font("HY헤드라인", Font.BOLD, 35);

      JTextField Title = new JTextField(25);
      Title.setFont(f);
      Title.setBounds(300, 20, 500, 50);
      JLabel titleLabel = new JLabel("▶ 도서명 :");
      titleLabel.setFont(f);
      titleLabel.setBounds(100, 20, 300, 50);
      panel2.add(titleLabel);
      panel2.add(Title);

      JLabel authorLabel = new JLabel("▶ 저자     :");
      JTextField Author = new JTextField(25);
      Author.setFont(f);
      authorLabel.setFont(f);
      Author.setBounds(300, 115, 500, 50);
      authorLabel.setBounds(100, 115, 300, 50);
      panel2.add(authorLabel);
      panel2.add(Author);

      JLabel priceLabel = new JLabel("▶ 가격     :");
      priceLabel.setBounds(100, 210, 300, 50);
      priceLabel.setFont(f);
      panel2.add(priceLabel);

      JTextField Price = new JTextField(25);
      Price.setFont(f);
      Price.setBounds(300, 210, 500, 50);
      panel2.add(Price);

      JButton button1 = new JButton("뒤로가기");
      button1.setFont(f);
      button1.setBounds(100, 290, 200, 50);
      panel2.add(button1);

      JButton button2 = new JButton("추가");
      button2.setFont(f);
      button2.setBounds(600, 290, 200, 50);
      panel2.add(button2);


      // 뒤로가기 버튼을 눌렀을 때 반응
      button1.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            dispose();
            mf.setVisible(true);
         }
      });

      // 추가 버튼을 눌렀을 때 반응
      button2.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            String author = Author.getText();
            String title = Title.getText();
            String price = Price.getText();
            int res = lm.addBook(author, title, price);
            if (res == 1) {
               JOptionPane.showMessageDialog(null, "이미 재고에 입고되어 있는 도서입니다. 다른 도서를 입력해주세요.");
               Author.setText("");
               Title.setText("");
               Price.setText("");
            } else {
               JOptionPane.showMessageDialog(null, "성공적으로 추가되었습니다.");
               Author.setText("");
               Title.setText("");
               Price.setText("");
               Title.requestFocus();
            }

         }
      });

      Price.addKeyListener(new KeyListener() {

         @Override
         public void keyTyped(KeyEvent e) {

         }

         @Override
         public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
               String author = Author.getText();
               String title = Title.getText();
               String price = Price.getText();
               int res = lm.addBook(author, title, price);
               if (res == 1) {
                  JOptionPane.showMessageDialog(null, "이미 입고되어 있는 도서입니다. 다른 도서를 입력해주세요.");
                  Author.setText("");
                  Title.setText("");
                  Price.setText("");
               } else {
                  JOptionPane.showMessageDialog(null, "성공적으로 추가되었습니다.");
                  Author.setText("");
                  Title.setText("");
                  Price.setText("");
                  Title.requestFocus();
               }
            }
         }

         @Override
         public void keyReleased(KeyEvent e) {

         }

      });

      // 메인프레임에 패널추가 및 종료 설정
      this.add(panel1);
      this.add(panel2);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setVisible(true);
      this.setResizable(false);
   }
}