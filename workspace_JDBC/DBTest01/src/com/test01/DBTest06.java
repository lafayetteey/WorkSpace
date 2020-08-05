package com.test01;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.net.aso.s;

public class DBTest06 /*extends JDBCTemplate*/ {

	public void selectAll() {
		
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM MYTEST";
		
		try {
			con = getConnection();
			pstm = con.prepareStatement(sql);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+ " : " + rs.getString(2) + " : " + rs.getString(3));
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstm);
			close(con);
		}
		
		
		
	}

	public void delete() {
		Connection con = null;
		PreparedStatement pstm = null;
		int res = 0;
		
		String sql = "DELETE FROM MYTEST WHERE MNO=?";
		Scanner sc = new Scanner(System.in);
		System.out.print("번호 입력 : ");
		int no = sc.nextInt();
		
		try {
			//con 에 템플렛에 있는 getConnection 객체 담기
			con = getConnection();
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, no);
			res = pstm.executeUpdate();
			if(res > 0)  {
				System.out.println("delete 성공");
			} else {
				System.out.println("delete 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(con);
			close(pstm);
		}
	}
	
	
	
	public void selectOne() {
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
		
		String sql = "SELECT * FROM MYTEST WHERE MNO =?";
		
		try {
			con = getConnection();
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, no);
			
			rs = pstm.executeQuery();
			
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getString(3) );
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstm);
			close(con);
		}
		
	}

	public void insert() {
		Connection con = null;
		PreparedStatement pstm = null;
		int res =0;
		Scanner sc = new Scanner(System.in);
		System.out.print("번호 입력 : ");
		int no = sc.nextInt();
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("별칭 입력 : ");
		String nickName = sc.next();
		
		String sql = "INSERT INTO MYTEST VALUES(? , ? , ? )";
		
		try {
			con = getConnection();
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, no);
			pstm.setString(2, name);
			pstm.setString(3, nickName);
			
			res = pstm.executeUpdate();
			
			if(res > 0) {
				System.out.println("insert 성공");
			} else {
				System.out.println("insert 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstm);
			close(con);
		}
		
	}
	
	public void insert2() {
		Connection con = null;
		PreparedStatement pstm = null;
		int res = 0;
		
		String sql = "INSERT INTO MYTABLE VALUES(? ,? ,?) ";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("번호 입력 : ");
		int no = sc.nextInt();
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.println("닉네임 입력 : ");
		String nickName = sc.next();
		
		try {
			con = getConnection();
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, no);
			pstm.setString(2, name);
			pstm.setString(3, nickName);
			
			res = pstm.executeUpdate();
			
			if (res > 0) {
				System.out.println("insert 성공");
				//확인용
				selectAll();
			} else {
				System.out.println("insert 실패");
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstm);
			close(con);
		}
	}

	public void selectone2() {
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM WHERE MNO = ?";
		Scanner sc = new Scanner(System.in);
		System.out.print("번호입력 : ");
		int no = sc.nextInt();
		
		con = getConnection();
		try {
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, no);
			rs = pstm.executeQuery();
			
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstm);
			close(con);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
