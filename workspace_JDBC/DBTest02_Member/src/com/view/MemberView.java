package com.view;

import java.util.List;
import java.util.Scanner;

import com.biz.MemberBizImpl;
import com.dto.Member;

public class MemberView {
	static Scanner sc = new Scanner(System.in);
	int no = 0;
	Member m = new Member();
	public static int getMenu() {
		int select = 0;
		System.out.println("***********");
		System.out.println("1. selectAll" );
		System.out.println("2. selectOne" );
		System.out.println("3. insert" );
		System.out.println("4. delete" );
		System.out.println("5. update" );
		System.out.println("6. exit" );
		
		System.out.print("input select number : ");
		select = sc.nextInt();
		return select;
	}
	
	
	public static void main(String[] args) {
		int select =0;
		MemberBizImpl memberBiz = new MemberBizImpl();	
		while (select != 6) {
			select = getMenu();
			
			switch(select) {
			
			case 1 : 
				List<Member> res = memberBiz.selectAll();
				for( Member m : res) {
					System.out.println(m);
				}
				break;
			case 2 : 
				System.out.print("조회할 번호 선택 : ");
				int no = sc.nextInt();
				Member resOne = memberBiz.selectOne(no);
				System.out.println(resOne);
				break;
			case 3 : 
				System.out.print("번호 입력 : ");
				int m_no = sc.nextInt();
				System.out.print("이름 입력 : ");
				String m_name = sc.next();
				System.out.print("나이 입력 : ");
				int m_age = sc.nextInt();
				System.out.print("성별 입력 (M || F ) : ");
				String m_gender = sc.next();
				System.out.print("주소 입력 : ");
				String m_location = sc.next();
				System.out.print("직업 입력 : ");
				String m_job = sc.next();
				System.out.print("연락처 입력 : ");
				String m_tel = sc.next();
				System.out.print("이메일 입력 : ");
				String m_email = sc.next();
				Member m = new Member(m_no , m_name , m_age , m_gender ,m_location , m_job , m_tel , m_email);
				int res_insert = memberBiz.insert(m);
				if (res_insert > 0 ) {
					System.out.println("insert 성공");
				} else {
					System.out.println("insert 실패");
				}
				break;
			case 4 : 
				System.out.print("삭제할 번호 선택 : ");
				no= sc.nextInt();
				int res_del = memberBiz.delete(no);
				
				if(res_del > 0 ) {
					System.out.println("delete 성공");
				} else {
					System.out.println("delete 실패");
				}
				break;
			case 5 : 
				System.out.print("수정할 번호 입력 : ");
				int num = sc.nextInt();
				System.out.print("수정할 이름 입력 : ");
				String name = sc.next();
				System.out.print("수정할 나이 입력 : ");
				int age = sc.nextInt();
				System.out.print("수정할 성별 입력 (M || F ) : ");
				String gender = sc.next();
				System.out.print("수정할 주소 입력 : ");
				String location = sc.next();
				System.out.print("수정할 직업 입력 : ");
				String job = sc.next();
				System.out.print("수정할 연락처 입력 : ");
				String tel = sc.next();
				System.out.print("수정할 이메일 입력 : ");
				String email = sc.next();
				m = new Member(num , name, age , gender , location , job , tel , email);
				int res_update = memberBiz.update(m);
				
				if(res_update > 0) {
					System.out.println("update 성공");
				} else {
					System.out.println("update 실패");
				}
				
			case 6 :
				System.out.println("*** 프로그램 종료 ***");
				break;
			}
		}
		
		
		
		
		
		
	}
}
