package com.project.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import com.project.model.Book;
import com.project.model.Member;

public class LibraryManager {
	Scanner sc = new Scanner(System.in);
	private ArrayList<Book> bookList = new ArrayList<>();
	private ArrayList<Book> delayList = new ArrayList<>();
	private ArrayList<Member> loanList = new ArrayList<>();

	// 생성자
	public LibraryManager() {
		bookList.add(new Book("거북선", "이순신", 7000));
		bookList.add(new Book("노인과 바다", "존 시터지스", 7200));
	}

	// 책 입고
	public void addBook(String title, String author, int price) {
		bookList.add(new Book(title, author, price));
		System.out.println(bookList.get(bookList.size() - 1) + "\n책을 입고하였습니다.");
	}

	public void changeBook(int num) {

	}

	// 책 대여 및 반납
	public void loanBook() {
		Calendar cal = null;
		Book book = null; // 고른책을 임시로 담을 객체그릇(재고가 없을시 처리 위함)
		// 고른 책을 담을 임시 ArrayList
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		ArrayList<Book> barr = new ArrayList<>();
		String title, name, pNum;
		char answer = ' ';
		System.out.print("1.대여\t2.반납\t3.책 제목 검색: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		switch (num) {
		case 1:
			System.out.print("이름 입력: ");
			name = sc.nextLine();
			System.out.print("전화번호 입력: ");
			pNum = sc.nextLine();
			// 책을 여러권 대여 가능
			do {
				if (bookList.size() == 0) {
					System.out.println("현재 도서관에 책이 없습니다.");
					break;
				}
				System.out.println("빌리실 책 제목:");
				title = sc.nextLine();
				// 책 리스트의 길이만큼 반복하면서
				for (int i = 0; i < bookList.size(); i++) {
					// 입력한 제목과 같은 제목의 책을 리스트에서 찾음
					if (bookList.get(i).getTitle().equals(title)) {
						// 찾은 책을 재고목록에서 제거함과 동시에 임시 리스트에 저장해둠
//						book = bookList.get(i);
						book = bookList.remove(i);
						// 찾은 책의 대여 수를 +1
						book.setCount(book.getCount() + 1);
						barr.add(book);
					}
				}
				// 찾은 책이 없다면
				if (book == null) {
					System.out.println("현재 재고가 없습니다.");
					// 간단한 출력문 출력
				}
				System.out.println("추가 대여 하시겠습니까?(y/n): ");
				answer = sc.next().charAt(0);
				sc.nextLine();
			} while (answer == ('y' | 'Y'));
			// 만약 대여목록에 고객정보가 이미 있다면
			if (loanList.size() != 0) {
				// 대여목록의 길이만큼 반복하면서
				for (int i = 0; i < loanList.size(); i++) {
					// 입력받은 고객의 이름과 전화번호와 동일한 고객정보가 있으면
					if ((loanList.get(i).getName().equals(name)) && //
							(loanList.get(i).getpNum().equals(pNum))) {
						// 기존의 대여목록에서 새로 대여한 책 목록을 추가 (Member의 setBookList() 참조)
						loanList.get(i).setBookList(barr);
						// 대여시각을 저장
						cal = Calendar.getInstance();
						loanList.get(i).setLoanedTime(cal.getTimeInMillis());
					}
				}
			} else { // 대여목록이 비었을 시에 새로운 고객 정보를 저장
				// 대여목록에 고객정보과 빌려간 책리스트. 대여시간을 전달하여 생성후 대여목록에 저장
				cal = Calendar.getInstance();
				loanList.add(new Member(name, pNum, barr, sdf.format(cal.getTime())));
				// 아래 for문은 빌려간 책을 확인하기위한 출력문 입니다.
				for (int i = 0; i < barr.size(); i++) {
					System.out.println("제목: " + barr.get(i).getTitle()//
							+ ", 작가: " + barr.get(i).getAuthor());
				}
				cal = Calendar.getInstance();
				System.out.println("대여시각: " + sdf.format(cal.getTime()));
			}
			break;
		case 2:
			System.out.println("반납하실 책 제목을 입력: ");
			title = sc.nextLine();

			break;
		default:
			break;

		}

	}

	// 책 목록 조회, 연체료
	public void search() {
		System.out.println("조회하실 목록을 선택하세요: ");
		System.out.println("1.책 재고 목록");
		System.out.println("2.대여 목록");
		int num = sc.nextInt();
		sc.nextLine();

		switch (num) {
		case 1:
			for (int i = 0; i < bookList.size(); i++) {
				System.out.println("제목: " + bookList.get(i).getTitle()//
						+ ", 작가: " + bookList.get(i).getAuthor()//
						+ ", 가격: " + bookList.get(i).getPrice());
			}
			break;
		case 2:
			if (loanList.size() != 0) {
				for (int i = 0; i < loanList.size(); i++) {
					System.out.print(loanList.get(i));
					System.out.println("책 대여 횟수: " + loanList.get(i).getBookList().get(i).getCount());
					System.out.println("대여 시각: " + loanList.get(i).getLoanedDay());
				}
			} else
				System.out.println("현재 대여해간 고객이 없습니다.");

			break;
		default:
			System.out.println("다시 입력해주세요!");
			break;
		}

	}

	// 베스트 셀러
	public void weekBook() {

	}

	// 연체 관리(연체료 발생 처리)
	public void overdueBook() {

	}

	public void bookList() {
		for (int i = 0; i < bookList.size(); i++) {
			System.out.println(bookList.get(i));
		}
	}

	public void memberList() {

	}

}
