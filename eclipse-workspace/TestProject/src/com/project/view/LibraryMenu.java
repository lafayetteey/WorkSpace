package com.project.view;

import java.util.Scanner;

import com.project.controller.LibraryManager;

public class LibraryMenu {

	Scanner sc = new Scanner(System.in);
	LibraryManager func = new LibraryManager();

	public LibraryMenu() {
		System.out.println("*환영합니다*");
	}

	public void mainMenu() {
		char answer = ' ';
		int num = 0;
		do {
			System.out.println("------------------------");
			System.out.println("      ***메뉴 화면***");
			System.out.println("1. 도서 추가");
			System.out.println("2. 도서 삭제 및 수정");
			System.out.println("3. 도서 대여 및 반납");
			System.out.println("4. 조회-책,연체금액");
			System.out.println("5. 금주의 책");
			System.out.println("6. 반납 및 연체관리");
			System.out.println("0 : 끝내기");
			System.out.println("------------------------");
			System.out.print("번호를 선택하세요: ");
			num = sc.nextInt();
			sc.nextLine();
			switch (num) {
			case 1:
				System.out.print("입고할 책\n제목 입력: ");
				String author = sc.nextLine();
				System.out.print("작가: ");
				String title = sc.nextLine();
				System.out.print("가격: ");
				int price = sc.nextInt();
				sc.nextLine();
				addBook(author, title, price);
				break;
			case 2:
				changeBook();
				break;
			case 3:
				loanBook();
				break;
			case 4:
				search();
				break;
			case 5:
				weekBook();
				break;
			case 6:
				overdueBook();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다. 감사합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		} while (true);
	}

	public void addBook(String title, String author, int price) {
		// 입력받은 3개의 변수에 대한 추가
		func.addBook(title, author, price);
	}

	public void changeBook() {
		// 일단 현재 저장되어 있는 bookList메소드 호출(function에 있음)
		// 그다음 1번 일지 2번 일지 입력받은 후 1,2번이 아니면 다시 선택하라고 출력
		// 그것을 Function의 changebook(int num)으로 넘겨줌.
	}

	public void loanBook() {
		// 대여인건지 반납인건지 번호 입력받은 후, 1,2번 아니면 다시 선택하라고 출력
		// function의 loanBook(int num)호출.
		func.loanBook();
	}

	public void search() {
		// 1. 책 , 2. 연체금액 에서 번호를 입력받은 후, 1,2번 아니면 다시 선택하라고 출력
		// function의 search(int num)으로 호출
		func.search();
	}

	public void weekBook() {
		// 바로 function의 weekbook호출
	}

	public void overdueBook() {
		// 바로 function의 overdueBook호출
		func.overdueBook();
	}

}
