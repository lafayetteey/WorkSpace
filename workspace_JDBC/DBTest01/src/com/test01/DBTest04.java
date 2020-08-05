package com.test01;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBTest04 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//delete
		Connection con = null;
		Statement stmt = null;
		//ResultSet의 결과값은 int 
		int res = 0;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "KH";
		String pw = "KH";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int no = sc.nextInt();
		String sql = "DELETE FROM MYTEST WHERE MNO = "+no;
		System.out.println("sql");
		
		//driver 연결
		Class.forName(driver);
		
		//db 연결 (url , id , pw)
		con = DriverManager.getConnection(url , id ,pw);
		
		//sql 실행
		stmt = con.createStatement();
		res = stmt.executeUpdate(sql);
		
		if( res > 0) { 
			System.out.println("delete 성공");
		} else {
			System.out.println("delete 실패");
		}
		
		//종료
		stmt.close();
		con.close();
		sc.close();
		
		
	}

}
