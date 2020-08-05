package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTemplet {
	
	//1.연결메소드
	public static Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriever");
		} catch (ClassNotFoundException e) {
			System.out.println("ERROR 드라이버 등록 실패");
			e.printStackTrace();
		}
		//url id pw
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "KH";
		String pw = "KH";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url , id , pw);
			con.setAutoCommit(false);
		} catch (SQLException e) {
			System.out.println("Oracle 연결 실패");
			e.printStackTrace();
		} 
		return con;
	}
	
	//2. 연결 해제 메소드 
	public static void close(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			System.out.println("Connection close 에러");
			e.printStackTrace();
		}
	}
	public static void close(Statement stmt) {
		try {
			stmt.close();
		} catch (SQLException e) {
			System.out.println("Statement close 에러");
			e.printStackTrace();
		}
	}
	public static void close(ResultSet rs) {
		try {
			rs.close();
		} catch (SQLException e) {
			System.out.println("ResultSet close 에러");
			e.printStackTrace();
		}
	}
	public static void commit(Connection con) {
		try {
			con.commit();
		} catch (SQLException e) {
			System.out.println("Connection commit 에러");
			e.printStackTrace();
		}
	}
	public static void rollback(Connection con) {
		try {
			con.rollback();
		} catch (SQLException e) {
			System.out.println("Connection rollback 에러");
			e.printStackTrace();
		}
	}
	
}
