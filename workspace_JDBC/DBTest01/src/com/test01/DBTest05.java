package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBTest05 {
	Connection con = null;
	PreparedStatement pstm = null;
	//insert
	public void insert() throws ClassNotFoundException, SQLException {
		
		//1.준비
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "KH";
		String pw = "KH";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("번호 입력 :");
		int no = sc.nextInt();
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("별명 입력");
		String nickName = sc.next();
		
		String sql = "INSERT INTO MYTEST VALUES(? , ? , ?)";
		
		//2. 드라이버 등록
		Class.forName(driver);
		
		//3. db 연결
		con = DriverManager.getConnection(url , id , pw);
		
		//4. statement 준비
		pstm = con.prepareStatement(sql);
		pstm.setInt(1, no);
		pstm.setString(2, name);
		pstm.setString(3, nickName);
		
		//5. query 실행
		int res = pstm.executeUpdate();
		
		//6. 결과처리
		if(res > 0 ) {
			System.out.println("insert 성공");
		} else {
			System.out.println("insert 실패");
		}
		
		//7. 종료
		pstm.close();
		con.close();
		sc.close();
	}

	public void delete() throws ClassNotFoundException, SQLException {
		Statement stm = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "KH";
		String pw = "KH";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("번호 입력 : ");
		int no = sc.nextInt();
		
		//DELETE FROM MYTEST WHERE MNO=?
		String sql = "DELETE FROM MYTEST WHERE MNO = "+no;
		
		Class.forName(driver);
		con = DriverManager.getConnection(url, id , pw);
		
		stm = con.createStatement();
		
		int res = stm.executeUpdate(sql);
		
		if(res>0) {
			System.out.println("delete 성공");
		} else {
			System.out.println("delete 실패");
		}
		stm.close();
		con.close();
		sc.close();
	}
	
	public void selectAll() throws ClassNotFoundException, SQLException {
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "KH";
		String pw = "KH";
		
		String sql = "SELECT * FROM MYTEST";
		
		Class.forName(driver);
		con = DriverManager.getConnection(url , id , pw);
		
		
		stm = con.createStatement();
		rs= stm.executeQuery(sql);
		
		while(rs.next()) { 
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) );
		}
		
		rs.close();
		stm.close();
		con.close();
	}

	public void selectOne() throws ClassNotFoundException, SQLException {
		//검색하고 싶은 데이터 입력받아 조건이 일치하는 데이터 출력
		Connection con = null;
		PreparedStatement stmt= null;
		ResultSet rs = null;
				
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "KH";
		String pw = "KH";
		String sql= "SELECT * FROM MYTEST WHERE MNO=?";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 번호 : ");
		int no = sc.nextInt();
		
		Class.forName(driver);
		con = DriverManager.getConnection(url , id , pw);
		
		stmt = con.prepareStatement(sql);
		//SELECT * FROM MYTEST WHERE MNO=?
		//SELECT * FROM MYTEST WHERE MNO=no;
		stmt.setInt(1, no);
		rs = stmt.executeQuery();
		
		if (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
		} else {
			System.out.println("해당 데이터가 없습니다.");
		}
		
		rs.close();
		stmt.close();
		sc.close();
	}
}
