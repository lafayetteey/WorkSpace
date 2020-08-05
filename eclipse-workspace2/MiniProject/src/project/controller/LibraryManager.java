package project.controller;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import project.Model.Book;
import project.Model.BookSorting;
import project.Model.Member;

public class LibraryManager {

   private ArrayList<Book> bookList = new ArrayList<>();
   private ArrayList<Member> memberList = new ArrayList<>();
   private ArrayList<Member> delayList = new ArrayList<>();
   private Date date = null;
   private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
   private SimpleDateFormat sdfTest = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
   private String name, pnum;

   public LibraryManager() {
      memberList.add(new Member("이준혁", "8405"));
      memberList.add(new Member("이우진", "0338"));
      memberList.add(new Member("장하영", "9142"));
      memberList.add(new Member("김승진", "8885"));
      memberList.add(new Member("장동건", "1902"));
      memberList.add(new Member("최해지", "0528"));
      bookList.add(new Book("이순신", "난중일기", "13000"));
      bookList.add(new Book("헤밍웨이", "노인과 바다", "17000"));
      bookList.add(new Book("황순원", "소나기", "15000"));
      bookList.add(new Book("생텍 쥐페리", "어린왕자", "34200"));
      bookList.add(new Book("요코제키 다이", "루팡의 딸", "13500"));
      bookList.add(new Book("아서 코난 도일", "셜록홈즈", "45000"));

   }

   public int addBook(String author, String title, String price) {
      int res = 0;
      Book book = null;
      for (int i = 0; i < bookList.size(); i++) { // for문 바깥으로 빼기
         if ((bookList.get(i).getTitle().equals(title) && bookList.get(i).getAuthor().equals(author))) {
            book = bookList.get(i);
         }
      }
      if (book != null) {
         res = 1;
      } else if (book == null) {
         res = 2;
         bookList.add(new Book(author, title, price));
      }
      return res;
   }

   public int deleteBook(String title) {
      for (int i = 0; i < bookList.size(); i++) {
         if (bookList.get(i).getTitle().equals(title)) {
            bookList.remove(i);
            JOptionPane.showMessageDialog(null, "삭제가 완료되었습니다.");
            return 1;
         }
      }
      JOptionPane.showMessageDialog(null, "잘못된 책이름이거나 책이 없습니다. 다시 입력해주세요.");
      return 0;

   }

   public int reviseBook(String title, JFrame mf) {
      for (int i = 0; i < bookList.size(); i++) {
         if (bookList.get(i).getTitle().equals(title)) {
            reviseBook2(i, mf);
            return 1;
         }
      }
      JOptionPane.showMessageDialog(null, "잘못된 책이름이거나 책이 없습니다. 다시 입력해주세요.");
      return 0;
   }

   public void reviseBook2(int i, JFrame mf) {
      ImageIcon icon;
      JFrame mf1 = new JFrame();
      mf1.setTitle("수정할 도서 정보");
      mf1.setLayout(new GridLayout(2, 1));
      mf1.setLocation(500, 0);
      mf1.setSize(900, 850);
      mf1.setResizable(false);

      try {
         mf1.setIconImage(ImageIO.read(new File("images/book.png")));
      } catch (IOException e) {
         e.printStackTrace();
      }

      icon = new ImageIcon("images/deletebook.jpg");
      JPanel panel1 = new JPanel() {
         private static final long serialVersionUID = 1L;

         public void paint(Graphics g) {
            Dimension d = getSize();
            g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
            // drawimage(img, x,y, width, height, observer);
            // 투명하게
            setSize(900, 450);
            setOpaque(false);
            super.paintComponent(g);
         }
      };
      mf1.add(panel1);

      Font f = new Font("HY헤드라인", Font.PLAIN, 30);

      JPanel panel = new JPanel();
      panel.setLayout(null);
      panel.setSize(500, 450);

      JLabel Ltitle = new JLabel("책 제목을 입력해주세요");
      Ltitle.setBounds(200, 50, 500, 25);
      Ltitle.setHorizontalAlignment(JLabel.CENTER);
      Ltitle.setFont(f);
      panel.add(Ltitle);

      JLabel Lauthor = new JLabel("저자를 입력해주세요");
      Lauthor.setBounds(200, 150, 500, 25);
      Lauthor.setHorizontalAlignment(JLabel.CENTER);
      Lauthor.setFont(f);
      panel.add(Lauthor);

      JLabel Lprice = new JLabel("가격을 입력해주세요");
      Lprice.setBounds(200, 250, 500, 25);
      Lprice.setHorizontalAlignment(JLabel.CENTER);
      Lprice.setFont(f);
      panel.add(Lprice);

      JTextField tit = new JTextField(20);
      tit.setBounds(200, 100, 500, 25);
      tit.setHorizontalAlignment(JTextField.CENTER);
      panel.add(tit);

      JTextField aut = new JTextField(20);
      aut.setBounds(200, 200, 500, 25);
      aut.setHorizontalAlignment(JTextField.CENTER);
      panel.add(aut);

      JTextField pri = new JTextField(20);
      pri.setBounds(200, 300, 500, 25);
      pri.setHorizontalAlignment(JTextField.CENTER);
      panel.add(pri);

      JButton resetButton = new JButton("Reset");
      resetButton.setBounds(250, 370, 150, 40);
      resetButton.setFont(f);
      panel.add(resetButton);

      JButton searchButton = new JButton("수정");
      searchButton.setBounds(510, 370, 150, 40);
      searchButton.setFont(f);
      panel.add(searchButton);

      pri.addKeyListener(new KeyListener() {

         @Override
         public void keyTyped(KeyEvent e) {
         }

         @Override
         public void keyReleased(KeyEvent e) {
         }

         @Override
         public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
               String title = tit.getText();
               String author = aut.getText();
               String price = pri.getText();

               bookList.set(i, new Book(author, title, price));
               JOptionPane.showMessageDialog(null, "수정이 완료되었습니다.");
               mf1.setVisible(false);
               mf.setVisible(true);
            }

         }
      });

      searchButton.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            String title = tit.getText();
            String author = aut.getText();
            String price = pri.getText();

            bookList.set(i, new Book(author, title, price));
            JOptionPane.showMessageDialog(null, "수정이 완료되었습니다.");
            mf1.setVisible(false);
            mf.setVisible(true);
         }
      });

      resetButton.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            tit.setText("");
            aut.setText("");
            pri.setText("");
            tit.requestFocus();
         }
      });

      mf1.add(panel);
      mf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      mf1.setVisible(true);
   }

   public int loanBook(int num, String name, String pnum) {
      int res = 0;
      Member member = null;

      // 대여 및 반납창에서
      // num == 1 이면 대여창
      if (num == 1) {
         for (int i = 0; i < memberList.size(); i++) {
            if (!(memberList.get(i).getName().equals(name) && memberList.get(i).getPnum().equals(pnum))) {
            	//존재하지않으면
               res = 1;
            } else {
            	//memberlist에 존재하면
               res = 2;
            }
         }
         
         // num2 == 2이면 반납창.
      } else if (num == 2) {
         for (int i = 0; i < memberList.size(); i++) {
            if (memberList.get(i).getName().equals(name) && memberList.get(i).getPnum().equals(pnum)) {
               member = memberList.get(i);
            }
         }
         if (member != null) {
            if (member.getTitleList().isEmpty()) {
            	//이름은 있는데 가진 책이 없다
               res = 3;
            } else {
            	//이름도 있고 가진책도 있다
               res = 1;
            }
         } else {
        	 //이름도 없다
            res = 0;
         }
      }
      this.name = name;
      this.pnum = pnum;
      return res;

   }

   public int loanBook2(int num2, String title) {
      ArrayList<String> lendTime = new ArrayList<>();
      ArrayList<Book> bArr = new ArrayList<Book>();
      Calendar cal = Calendar.getInstance();
      Member member = null;
      Book book = null;
      String returntime = "";
      int res2 = 0;

      if (num2 == 1) {
         for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getTitle().equals(title)) {
               book = bookList.get(i);
               bookList.get(i).setCount(book.getCount() + 1);
               bArr.add(book);
            }
         }
         res2 = 1;
         if (book == null) {
            res2 = 0;
         }
         date = new Date();
         cal.setTime(date);

         // 반납 예정 날짜를 오늘로 변경
//        cal.add(Calendar.DATE, 3);

         returntime = sdfTest.format(cal.getTime());
         lendTime.add(returntime);

         for (int i = 0; i < memberList.size(); i++) {
            if ((memberList.get(i).getName().equals(this.name) && memberList.get(i).getPnum().equals(this.pnum))) {
               member = memberList.get(i);
            }
         }
         if (member != null) {
            for (int i = 0; i < memberList.size(); i++) {
               if ((memberList.get(i).getName().equals(this.name)
                     && memberList.get(i).getPnum().equals(this.pnum))) {
                  memberList.get(i).setTitleList(bArr);
                  memberList.get(i).setLendTime(lendTime);
               }
            }
         } else {
            memberList.add(new Member(this.name, lendTime, this.pnum, bArr));
         }

      } else if (num2 == 2) {
         for (int i = 0; i < memberList.size(); i++) {
            for (int j = 0; j < memberList.get(i).getTitleList().size(); j++) {
               if (memberList.get(i).getTitleList().get(j).getTitle().equals(title)) {
                  if (memberList.get(i).getName().equals(this.name)
                        && memberList.get(i).getPnum().equals(this.pnum)) {
                     book = memberList.get(i).getTitleList().get(j);
                  }
               }
            }
         }
         if (book != null) {
            for (int i = 0; i < memberList.size(); i++) {
               for (int j = 0; j < memberList.get(i).getTitleList().size(); j++) {
                  if (memberList.get(i).getName().equals(this.name)
                        && memberList.get(i).getPnum().equals(this.pnum)) {
                     if (memberList.get(i).getTitleList().get(j).getTitle().equals(title)) {
                        if (memberList.get(i).getTitleList().equals(null) == false) {
                        	JOptionPane.showMessageDialog(null, "연체료는 "+memberList.get(i).getFee()+"원 입니다.");
                           memberList.get(i).getTitleList().remove(j);
                           memberList.get(i).getLendTime().remove(j);
                           memberList.get(i).setFee(-memberList.get(i).getFee());
                        }
                     }
                  }
               }
            }
            res2 = 3;
         } else
            res2 = 4;
      }
      return res2;
   }

   public String weekBook() {
      ArrayList<Book> list = bookList;

      list.sort(new BookSorting());

      String str = "<html>동률 시 가나다 순<br>";

      for (int i = 0; i < list.size(); i++) {
         if (i < 3) {
            if (list.get(i).getCount() > 0) {
               str += (i + 1) + "위 : " + list.get(i).getTitle() + " " + list.get(i).getCount() + "회<br>";
            }
         }

      }
      str += "</html>";
      if (str.equals("<html>동률 시 가나다 순<br></html>")) {
         return "빌린책이 없습니다.";
      }
      return str;
   }

   public String overdueBook() {
	      // 시연시 초단위로 할때 사용할 포맷 sdfTest
	      // 날짜별로 할시에 sdf

	      // 연체도서 목록
	      Member member = null;
	      String str = "";
	      String temp = "";
	      Date lendTime = null;
	      Date currentTime = null;
	      int fee = 0;
	      Calendar cal = Calendar.getInstance();
	      temp = sdfTest.format(cal.getTime());
	      try {
	         
	         // 연체료 세팅 for문
	         for (int i = 0; i < memberList.size(); i++) {
	            if (!memberList.get(i).getTitleList().isEmpty() && !memberList.get(i).getLendTime().isEmpty()) {
	               for (int j = 0; j < memberList.get(i).getTitleList().size(); j++) {
	                  lendTime = sdfTest.parse(memberList.get(i).getLendTime().get(j));
	                  currentTime = sdfTest.parse(temp);
	                  // 대여시간 - 현재시간
	                  long DateSub = lendTime.getTime() - currentTime.getTime();
	                  // 5초 지날때마다 *100 연체료 발생
	                  long DateSubDays = DateSub / (1000 * 5); // 실제 사용시 1일마다는 (1000 * 60 * 60 * 24)
	                  if (lendTime.getTime() < currentTime.getTime()) {
	                     // 반납 예정일이 현재 날짜보다 작으면 연체임(<)
	                     fee = (int) Math.abs(DateSubDays) * 100;
	                     memberList.get(i).setFee(fee);
	                     lendTime = sdf.parse(memberList.get(i).getLendTime().get(j));
	                     // 출력용 str에 내용 저장
	                     str += "           " + memberList.get(i).getName() + "      " + memberList.get(i).getPnum()
	                           + "\t" + memberList.get(i).getTitleList().get(j).getTitle() + "\t"
	                           + sdf.format(lendTime) + "\t" + fee + "\n";
	                  }
	               }
	            }
	         }

	         // 연체 목록중 대여한 책이 없다면 연체목록에서 제거
	         if (!delayList.isEmpty()) {
	            for (int i = 0; i < delayList.size(); i++) {
	               if (delayList.get(i).getTitleList().isEmpty()) {
	                  delayList.remove(i);
	               }
	            }
	         }

	         // 연체 목록중 동일한 멤버가 연체리스트에 있다면 멤버객체에 담음
	         for (int i = 0; i < delayList.size(); i++) {
	            for (int j = 0; j < memberList.size(); j++) {
	               if (delayList.get(i).equals(memberList.get(j))) {
	                  member = memberList.get(j);
	               }
	            }
	         }
	         // 동일한 멤버가 있다면 아무것도 안하고
	         if (member != null) {

	         }
	         // 연체리스트에 해당 멤버가 없고 빌린 책이 있다면 연체리스트에 추가
	         else {
	            for (int i = 0; i < memberList.size(); i++) {
	               for (int j = 0; j < memberList.get(i).getTitleList().size(); j++) {
	                  if (!memberList.get(i).getTitleList().isEmpty() && memberList.get(i).getFee() != 0) {
	                     delayList.add(memberList.get(i));
	                     
	                  }
	               }
	            }
	         }
	      } catch (ParseException e) {
	         e.printStackTrace();
	      }
	      return str;
	   }

   public String[][] bookList() {

      String[][] contents = new String[bookList.size()][3];

      for (int i = 0; i < contents.length; i++) {
         contents[i][0] = bookList.get(i).getTitle();
         contents[i][1] = bookList.get(i).getAuthor();
         contents[i][2] = bookList.get(i).getPrice();
      }
      return contents;
   }

   public String[][] memberList() {
      // 고객정보 출력
      String[][] contents = new String[memberList.size()][4];

      for (int i = 0; i < memberList.size(); i++) {

         contents[i][0] = memberList.get(i).getName();
         contents[i][1] = memberList.get(i).getPnum();

         if (!memberList.get(i).getTitleList().isEmpty()) {
            contents[i][2] = "O";
         } else {
            contents[i][2] = "X";
         }
         contents[i][3] = "";
         for (int j = 0; j < memberList.get(i).getTitleList().size(); j++) {
            contents[i][3] += memberList.get(i).getTitleList().get(j).getTitle() + " ";
         }
      }

      return contents;
   }

   public String[][] search(int num, String name) {

      String[][] contents = null;

      if (num == 1) {
         // 책제목으로 검색
    	  int bnum = 0;
         contents = new String[bookList.size()][3];
         for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getTitle().contains(name)) {
               contents[bnum][0] = bookList.get(i).getTitle();
               contents[bnum][1] = bookList.get(i).getAuthor();
               contents[bnum][2] = bookList.get(i).getPrice();
               bnum++;
           }
         }

      } else if (num == 2) {
         contents = new String[memberList.size()][4];
         // 고객 검색 후 고객정보,대여중인 책
         String fee = "X";
         for (int i = 0; i < memberList.size(); i++) {
            if (memberList.get(i).getName().equals(name)) {
               if (memberList.get(i).getFee() != 0) {
                  if (!memberList.get(i).getTitleList().isEmpty()) {
                     fee = "O";
                  }
               }
               contents[0][0] = memberList.get(i).getName();
               contents[0][1] = memberList.get(i).getPnum();
               if (!memberList.get(i).getTitleList().isEmpty()) {
                  contents[0][2] = fee;
               } else {
                  contents[0][2] = "X";
               }
               contents[0][3] = "";
               for (int j = 0; j < memberList.get(i).getTitleList().size(); j++) {
                  contents[0][3] = memberList.get(i).getTitleList().get(j).getTitle();
               }
            }
         }
      }
      return contents;
   }

   public ArrayList<Member> getDelayList() {
      return delayList;
   }

   public void setDelayList(ArrayList<Member> delayList) {
      this.delayList = delayList;
   }

}