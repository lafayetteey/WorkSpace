package com.test01;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest01 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1. 드라이버 등록
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2. DB연결 및 유저 로그인
		Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"KH" , "KH"			
					 
				);
		//3. SQL 문 실행 // 쿼리문 실행
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM EMP WHERE EMPNO = '7499' " );

		//4. SQL 문 출력 (결과 리턴)
		while (rs.next()) {
			System.out.println(rs.getInt(1)  + " " + rs.getString(2) + " " + rs.getInt("SAL") + rs.getString(3) + " " + rs.getDate("HIREDATE"));
		}
		
		//5. 종료
		rs.close();
		stmt.close();
		con.close();
	}
}
