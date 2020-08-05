package com.test.view;

import static common.JDBCTemplet.getConnection;

import java.sql.Connection;
import java.util.Scanner;

import com.test.dao.MyTestDao;
import com.test.dto.MyTest;

public class MyTestView {
	static Scanner sc = new Scanner(System.in);

	public static int getMenu() {
		int select = 0;

		System.out.println("1. 전체 출력");
		System.out.println("2.  추가");
		System.out.println("3.  수정");
		System.out.println("4.  삭제");
		System.out.println("5.  종료");
		System.out.println("=============");
		System.out.print("번호 선택 : ");
		select = sc.nextInt();

		return select;
	}

	public static void main(String[] args) {
		int no = 0;

		int mno = 0;
		String name = null;
		String nickname = null;

		Connection con = getConnection();
		MyTestDao dao = new MyTestDao();

		do {

			no = getMenu();

			switch (no) {
			case 1:
				System.out.println("***전체 출력***");
				System.out.println(dao.getAll(con));
				break;
			case 2:
				System.out.println("*** 추가 *** ");
				System.out.print("번호 입력 : ");
				mno = sc.nextInt();
				System.out.print("이름 입력 : ");
				name = sc.next();
				System.out.print("닉네임 입력 : ");
				nickname = sc.next();
				MyTest insert = new MyTest(mno , name , nickname);
				int res_insert = dao.getInsert(con , insert);
				if( res_insert > 0 ) {
					System.out.println("insert 성공");
				} else {
					System.out.println("insert 실패");
				}
				break;
			case 3:
				System.out.println("*** 수정 *** ");
				System.out.print("수정할 번호 : ");
				mno = sc.nextInt();
				System.out.print("수정할 이름 : ");
				name = sc.next();
				System.out.print("수정할 닉네임 : ");
				nickname = sc.next();
				MyTest update = new MyTest(mno , name , nickname );
				int res_update = dao.getUpdate(con , update);
				if( res_update > 0 ) {
					System.out.println("update 성공");
				} else {
					System.out.println("update 실패");
				}
				break;
			case 4:
				System.out.println("*** 삭제 ***");
				System.out.print("삭제 할 번호 선택");
				mno = sc.nextInt();
				MyTest delete = new MyTest(mno);
				int res_delete = dao.getDelete(con, delete);
				
				if(res_delete> 0) {
					System.out.println("delete 성공");
				} else {
					System.out.println("delete 실패");
				}
				break;
			case 5:
				System.out.println("종료");
				break;
			}

		} while (no != 5);
	}
}
