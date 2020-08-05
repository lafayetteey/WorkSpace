package com.my.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.my.dto.MyBoardDto;

public class MyBoardDao {
	Connection con = null;
	public MyBoardDao() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("01. driver 연결");
		} catch (ClassNotFoundException e) {
			System.out.println("01. driver 연결 실패");
			e.printStackTrace();
		}
	}
	public List<MyBoardDto> selectAll() {
		
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe" , "KH" , "KH");
			System.out.println("02. 계정 연결");
		} catch (SQLException e) {
			System.out.println("02. 계정 연결 실패");
			e.printStackTrace();
		}
		Statement stmt = null;
		ResultSet rs = null;
		List<MyBoardDto> res = new ArrayList<>();
		
		String sql = "SELECT * FROM MYBOARD";
		
		try {
			stmt = con.createStatement();
			System.out.println("03. query 준비");
			
			rs = stmt.executeQuery(sql);
			System.out.println("04 . query 실행 및 리턴");
			
			while(rs.next()) {
				MyBoardDto dto = new MyBoardDto(
						rs.getInt(1) , rs.getString(2) , rs.getString(3) , rs.getString(4) , rs.getDate(5)
						);
				res.add(dto);
			}
		} catch (SQLException e) {
			System.out.println("3 /4 단계 에러");
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					stmt.close();
					con.close();
				System.out.println("05. db 종료");
				} catch (SQLException e) {
					System.out.println("05. db 종료 오류");
					e.printStackTrace();
				}
			}
		}
		return res;
		
	}
	public int insert(MyBoardDto dto) {
		//1. connection 객체 연결
		//2. PreparedStatement 객체 와 리턴값인 int  그리고 sql 문을 선언한다.
		//3. PreparedStatement 객체로 sql 문 실행 후 하나씩 담아준 후 
		//4 .int 값을 통해 executeQuery 해준다
		
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe" , "KH" ,"KH");
			System.out.println("02. 계정 연결");
		} catch (SQLException e) {
			System.out.println("02. 계정 연결 실패");
			e.printStackTrace();
		}
		PreparedStatement pstm = null;
		int res = 0;
		String sql = "INSERT INTO MYBOARD VALUES(MYSEQ.NEXTVAL , ? , ? ,? , SYSDATE)";
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, dto.getMyname());
			pstm.setString(2, dto.getMytitle());
			pstm.setString(3, dto.getMycontent());
			System.out.println("03. query 준비 ");
			
			res = pstm.executeUpdate();
			System.out.println("04. query 실행 및 리턴");
			
		} catch (SQLException e) {
			System.out.println("03. query 준비 실패");
			e.printStackTrace();
		} finally {
			try {
				pstm.close();
				con.close();
				System.out.println("05. db 종료");
			} catch (SQLException e) {
				System.out.println("05. db 종료 오류");
				e.printStackTrace();
			}
		}
		
		return res;
		
	}
	public MyBoardDto selectOne(int myno) {
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe" , "KH" , "KH");
			System.out.println("02. 계정 연결");
		} catch (SQLException e) {
			System.out.println("02. 계정 연결 실패");
			e.printStackTrace();
		}
		
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM MYBOARD WHERE MYNO = ?";
		MyBoardDto res= null;
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, myno);
			System.out.println("03. query 문 준비 " + sql);
			
			rs = pstm.executeQuery();
			System.out.println("04. query  실행 및 리턴");
			while(rs.next()) {
				res = new MyBoardDto();
				res.setMyno(rs.getInt(1));
				res.setMyname(rs.getString(2));
				res.setMytitle(rs.getString(3));
				res.setMycontent(rs.getString(4));
				res.setMydate(rs.getDate(5));
			}
		} catch (SQLException e) {
			System.out.println("3 /4 단계 오류");
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstm.close();
				con.close();
				System.out.println("db 종료");
			} catch (SQLException e) {
				System.out.println("db 종료 오류");
				e.printStackTrace();
			}
		}
		return res;
	}
	public int delete(int myno) {
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe" , "KH" , "KH");
			System.out.println("02. 계정 연결");
		} catch (SQLException e) {
			System.out.println("02. 계정 연결 실패");
			e.printStackTrace();
		}
		PreparedStatement pstm = null;
		int res = 0;
		String sql = "DELETE FROM MYBOARD WHERE MYNO = ?";
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, myno);
			System.out.println("03. query문 준비 " + sql);
			
			res = pstm.executeUpdate();
			System.out.println("04. query 문 실행 및 리턴");
		} catch (SQLException e) {
			System.out.println("3 /4 단계 오류");
			e.printStackTrace();
		} finally {
			try {
				pstm.close();
				con.close();
				System.out.println("db 종료");
			} catch (SQLException e) {
				System.out.println("db 종료 오류");
				e.printStackTrace();
			}
		}
		
		return res;
		
	}
	public int update(MyBoardDto dto) {
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe" , "KH" , "KH");
			System.out.println("02 . 계정 연결");
		} catch (SQLException e) {
			System.out.println("02 . 계정 연결 실패");
			e.printStackTrace();
		}
		PreparedStatement pstm = null;
		int res=0;
		String sql = "UPDATE MYBOARD SET MYTITLE = ? , MYCONTENT = ? WHERE MYNO = ?";
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, dto.getMytitle());
			pstm.setString(2, dto.getMycontent());
			pstm.setInt(3, dto.getMyno());
			System.out.println("query 문 작성" + sql);
			
			res = pstm.executeUpdate();
			System.out.println("query 문 실행 및 리턴");
		} catch (SQLException e) {
			System.out.println("3 /4 단계 실행 오류");
			e.printStackTrace();
		} finally {
			try {
				pstm.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return res;
		
	}

}
