package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBTest05 {
	public void insert() throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstm = null;
		int res = 0;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "KH";
		String pw = "KH";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("번호 입력 : ");
		int no = sc.nextInt();
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("별칭 입력 : ");
		String nickName = sc.next();
		
		String sql = "INSERT INTO MYTEST VALUES(? , ? , ? )";
		
		Class.forName(driver);
		con = DriverManager.getConnection(url , id , pw);
		
		pstm = con.prepareStatement(sql);
		pstm.setInt(1, no);
		pstm.setString(2, name);
		pstm.setString(3, nickName);
		
		res = pstm.executeUpdate();
		
		if (res > 0 ) {
			System.out.println("insert 성공");
		} else {
			System.out.println("insert 실패");
		}
		
		pstm.close();
		con.close();
		sc.close();
		
	}

	public void delete() throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstm = null;
		int res = 0;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "KH";
		String pw  = "KH";
		Scanner sc = new Scanner(System.in);
		System.out.print("번호 입력 : ");
		int no = sc.nextInt();
		
		String sql = "DELETE FROM MYTEST WHERE MNO = ?";
		
		Class.forName(driver);
		con = DriverManager.getConnection(url,id,pw);
		
		pstm = con.prepareStatement(sql);
		pstm.setInt(1, no);
		res = pstm.executeUpdate();
		
		if(res > 0) {
			System.out.println("delete 성공");
		} else {
			System.out.println("delete 실패");
		}
		
		pstm.close();
		con.close();
		sc.close();
	}
	public void selectAll () throws ClassNotFoundException, SQLException {
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "KH";
		String pw = "KH";
		String sql = "SELECT * FROM MYTEST";
		
		Class.forName(driver);
		con = DriverManager.getConnection(url, id , pw);
		stm = con.createStatement();
		rs = stm.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getString(3));
		}
		rs.close();
		stm.close();
		con.close();
	}
	public void selectOne() throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "KH";
		String pw = "KH";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("번호 입력 : ");
		int no = sc.nextInt();
		
		String sql = "SELECT * FROM MYTEST WHERE MNO = ?";
		
		Class.forName(driver);
		con = DriverManager.getConnection(url , id , pw);
		
		pstm = con.prepareStatement(sql);
		pstm.setInt(1, no );
		rs = pstm.executeQuery();
		
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getString(3));
		}
		
		rs.close();
		pstm.close();
		con.close();
	
	
	}
}
