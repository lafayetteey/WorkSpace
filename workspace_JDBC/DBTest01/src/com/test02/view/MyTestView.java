package com.test02.view;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.Scanner;

import com.test02.dao.MyTestDao;
import com.test02.dto.MyTest;

//mvc 패턴 1 : model , veiw , controller
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
		int no =0;
		
		int mno = 0;
		String name = null;
		String nickName = null;
		
		Connection con = getConnection();
		MyTestDao dao = new MyTestDao();
		
		do {
			no = getMenu();
			
			switch(no) {
			case 1 : 
				System.out.println("**** 전체 출력 ****");
				System.out.println(dao.getAll(con));
				break;
			case 2 : 
				System.out.println("**** 추가 ****");
				System.out.print("번호 입력 : ");
				mno = sc.nextInt();
				System.out.print("이름 입력 : ");
				name = sc.next();
				System.out.print("닉네임 입력 : ");
				nickName = sc.next();
				MyTest dto = new MyTest(mno , name , nickName);
				int res_insert = dao.getInsert(con , dto);
				
				if(res_insert > 0) {
					System.out.println("insert 성공");
				} else {
					System.out.println("insert 실패");
				}
				break;
			case 3 : 
				System.out.println("**** 수정 ****");
				System.out.print("수정할 번호 : ");
				mno = sc.nextInt();
				System.out.print("수정할 이름 : ");
				name = sc.next();
				System.out.print("수정할 닉네임 : ");
				nickName = sc.next();
				MyTest update = new MyTest(mno, name , nickName);
				int res_update = dao.getUpdate(con , update);
				if(res_update > 0) {
					System.out.println("수정 성공");
				} else {
					System.out.println("수정 실패");
				}
				break;				
			case 4 :
				System.out.println("**** 삭제 ****");
				System.out.print("삭제할 번호 입력 : ");
				mno = sc.nextInt();
				MyTest delete = new MyTest(mno);
				int res_delete = dao.getDelete(con , delete);
				
				if(res_delete > 0) {
					System.out.println("삭제 성공");
				} else {
					System.out.println("삭제 실패");
				}
				break;
			case 5 : 
				System.out.println("*** 선택 출력 ***");
				System.out.print("번호 선택 : ");
				mno = sc.nextInt();
				MyTest select = dao.getSelectOne(mno , con);
				System.out.println(select);
				break;
			case 6 :
				System.out.println("종료");
				close(con);
			}
			
		} while(no !=6); //종료 조건 
		
		
		
	}
}	
