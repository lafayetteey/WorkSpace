package com.tet01.view;

import java.sql.Connection;
import java.util.Scanner;

import com.tet01.dao.MyTestDao;
import com.tet01.dto.MyTest;
import static common.JDBCTemplate.*;

public class MyTestView {
	static Scanner sc = new Scanner(System.in);
	
	public static int getMenu() {
		int select = 0;
		System.out.println("1.  전체 출력");
		System.out.println("2.  추가");
		System.out.println("3.  수정");
		System.out.println("4.  삭제");
		System.out.println("5.  선택 출력");
		System.out.println("6.  종료");
		System.out.println("=============");
		System.out.print("번호 선택 : ");
		select = sc.nextInt();
		return select;
	}
	
	public static void main(String[] args) {
		int no=0;
		int mno = 0;
		String name = "";
		String nickname = "";
		
		Connection con = getConnection();
		MyTestDao dao = new MyTestDao();
		
		do {
			no = getMenu();
			switch(no) {
			case 1 :
				System.out.println("***전체 출력 ***");
				System.out.println(dao.getAll(con));
				break;
			case 2 : 
				System.out.println("*** 추가 ***");
				System.out.print("번호 입력 : ");
				mno = sc.nextInt();
				System.out.print("이름 입력 : ");
				name = sc.next();
				System.out.print("닉네임 입력 : ");
				nickname = sc.next();
				MyTest dto = new MyTest(mno, name , nickname);
				int result_insert = dao.getInsert(con , dto);
				
				if (result_insert > 0) {
					System.out.println("insert 성공");
				} else {
					System.out.println("insert 실패");
				}
				break;
			case 3 : 
				System.out.println("*** 수정 ***");
				System.out.print("수정할 번호 입력 : ");
				mno = sc.nextInt();
				System.out.print("수정할 이름 입력 : ");
				name = sc.next();
				System.out.print("수정할 닉네임 입력 : ");
				nickname = sc.next();
				MyTest update = new MyTest(mno , name , nickname);
				int res_update = dao.getUpdate(con , update);
				
				if(res_update > 0) {
					System.out.println("update 성공");
				} else {
					System.out.println("update 실패");
				}
				break;
			case 4 :
				System.out.println("*** 삭제 ***");
				System.out.print("삭제할 번호 선택 : ");
				mno = sc.nextInt();
				MyTest del = new MyTest(mno);
				int res_del = dao.getDelete(con , del);
				System.out.println(res_del);
				if(res_del > 0) {
					System.out.println("delete 성공");
				} else {
					System.out.println("delete 실패");
				}
				break;
			case 5 : 
				System.out.println("조회할 번호 선택");
				mno = sc.nextInt();
				MyTest selectOne = new MyTest(mno);
				System.out.println(dao.selectOne(con , selectOne));
				break;
			case 6 : 
				System.out.println("프로그램 종료");
				break;
			}
		} while (no != 6);
		
		
		
	}
}
