package com.test01;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest01_1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1. 드라이버 등록
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2. DB연결
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe",
				"KH" , "KH"
				);
		//3. 쿼리문 작성 //sql 실행
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM EMP");
		
		while(rs.next()) {
			System.out.println(rs.getString(3) );
		}
		
		//4.  종료
		rs.close();
		stmt.close();
		con.close();
	}
}
