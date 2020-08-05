package com.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.login.dto.MyMemberDto;

import common.JDBCTemplate;

public class MyMemberDao extends JDBCTemplate {
	
	public MyMemberDto login(String id , String pw) {
		Connection con = getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		MyMemberDto res  = null;
		String sql = "SELECT * FROM MYMEMBER WHERE MYID = ? AND MYPW = ? AND MYENABLED = ? ";
				
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, id);
			pstm.setString(2, pw);
			pstm.setString(3, "Y");
			System.out.println("03. query 준비 : " + sql);
			
			rs = pstm.executeQuery();
			System.out.println("04. query 실행 및 리턴");
			while(rs.next()) {
				res = new MyMemberDto();
				res.setMyno(rs.getInt(1));
				res.setMyid(rs.getString(2));
				res.setMypw(rs.getString(3));
				res.setMyname(rs.getString(4));
				res.setMyaddr(rs.getString(5));
				res.setMyphone(rs.getString(6));
				res.setMyemail(rs.getString(7));
				res.setMyenabled(rs.getString(8));
				res.setMyrole(rs.getString(9));
			}
		} catch (SQLException e) {
			System.out.println("3 / 4 단계 오류");
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstm);
			close(con);
			System.out.println("05. db 종료");
		}
		return res;		
	}
	public List<MyMemberDto> selectAll() {
		Connection con = getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM MYMEMBER ORDER BY MYNO DESC";
		List<MyMemberDto> res = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			System.out.println("03. query 준비 :" + sql);
			
			rs = stmt.executeQuery(sql);
			System.out.println("04. query 실행 및 리턴 ");
			while(rs.next() ) {
				MyMemberDto dto =
						new MyMemberDto(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5), rs.getString(6),rs.getString(7), rs.getString(8), rs.getString(9));
				res.add(dto);	
			}
		} catch (SQLException e) {
			System.out.println("3 /4 단계 오류");
			e.printStackTrace();
		} finally {
			close(rs);
			close(stmt);
			close(con);
		}
		return res;		
	}
	public List<MyMemberDto> selectEnabled() {
		Connection con = getConnection();
		Statement stmt= null;
		ResultSet rs = null;
		List<MyMemberDto> res = new ArrayList<>();
		String sql = "SELECT * FROM MYMEMBER WHERE MYENABLED = 'Y' ";
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println("04. query 실행 및 리턴 ");
			while(rs.next() ) {
				MyMemberDto dto =
						new MyMemberDto(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5), rs.getString(6),rs.getString(7), rs.getString(8), rs.getString(9));
				res.add(dto);	
			}
		} catch (SQLException e) {
			System.out.println("3 /4 단계 오류");			
			e.printStackTrace();
		}
		
		return res;
	}
	public MyMemberDto selectOne(int myno) {
		Connection con = getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		MyMemberDto res = null;
		String sql = "SELECT * FROM MYMEMBER WHERE MYNO = ? ";
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, myno);
			System.out.println("03. query 준비 :" + sql);
			
			rs = pstm.executeQuery();
			System.out.println("04. query 실행 및 리턴");
			while(rs.next() ) {
				res.setMyno(rs.getInt(1));
				res.setMyid(rs.getString(2));
				res.setMypw(rs.getString(3));
				res.setMyname(rs.getString(4));
				res.setMyaddr(rs.getString(5));
				res.setMyphone(rs.getString(6));
				res.setMyemail(rs.getString(7));
				res.setMyenabled(rs.getString(8));
				res.setMyrole(rs.getString(9));
			}
			
		} catch (SQLException e) {
			System.out.println("3 / 4 단계 오류");
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstm);
			close(con);
			System.out.println("db 종료");
		}
		return res;		
	}
}
