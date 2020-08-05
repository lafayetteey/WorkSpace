package com.test01;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBTest03 {
	// INSERT
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 준비
		Connection con = null;
		Statement stmt = null;
		// ResultSet 사용하지 않음
		int res = 0;

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "KH";
		String pw = "KH";
		// MYTEST 테이블 데이터 입력받을 준비
		int no = 0;
		String name = null;
		String nickname = null;
		Scanner sc = new Scanner(System.in);

		System.out.print("번호입력 : ");
		no = sc.nextInt();
		System.out.print("이름 입력 :");
		name = sc.next();
		System.out.print("별칭 입력 : ");
		nickname = sc.next();

		String sql = " INSERT INTO MYTEST VALUES(" + no + " , ' " + name + " ' , " + " ' " + nickname + " '  ) ";
		System.out.println(sql);

		// 드라이버 등록
		Class.forName(driver);
		// 연결
		con = DriverManager.getConnection(url , id ,pw);
		// 실행 및 결과처리
		stmt = con.createStatement();
		// INSERT // DELETE // UPDATE 할 경우 executeUpdate
		res = stmt.executeUpdate(sql);

		if (res > 0) {
			System.out.println("insert 성공");
		} else {
			System.out.println("insert 실패");
		}
		// 종료

		stmt.close();
		con.close();
		sc.close();
	}

}
