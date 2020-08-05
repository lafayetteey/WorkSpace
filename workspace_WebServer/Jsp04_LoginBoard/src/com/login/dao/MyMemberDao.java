package com.login.dao;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.login.dto.MyMemberDto;

public class MyMemberDao {
	
	//로그인
	public MyMemberDto login(String id , String pw) {
		Connection con = getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		MyMemberDto res = null;
		String sql = "SELECT * FROM MYMEMBER WHERE MYID = ? AND MYPW = ? AND MYENABLED = ?";
		
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
		}
		return res;
	}
	//관리자기능
	//회원 전체
	public List<MyMemberDto> selectAll() {
		Connection con = getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		List<MyMemberDto> res = new ArrayList<>();
		String sql = "SELECT * FROM MYMEMBER ORDER BY MYNO DESC";
		
		try {
			stmt = con.createStatement();
			System.out.println("03. query 준비 :" + sql);
			
			rs = stmt.executeQuery(sql);
			System.out.println("04.query 실행 및 리턴");
			while(rs.next() ) {
				MyMemberDto dto = new MyMemberDto
						(rs.getInt(1) , rs.getString(2) ,rs.getString(3) , rs.getString(4) , rs.getString(5) , rs.getString(6), rs.getString(7) ,rs.getString(8) , rs.getString(9) );
				res.add(dto);
			}
		} catch (SQLException e) {
			System.out.println("3/4 단계 오류");
			e.printStackTrace();
		}finally {
			close(rs);
			close(stmt);
			close(con);
		}
		return res;
	}
	
	//enabled 가 Y 인 회원만 선택
	public List<MyMemberDto> selectEnabled() {
		Connection con = getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		List<MyMemberDto> res = new ArrayList<>();
		String sql = "SELECT * FROM MYMEMBER WHERE MYENABLED = 'Y' ORDER BY MYNO DESC ";
		
		try {
			stmt = con.createStatement();
			System.out.println("03. query 준비 :" + sql);
			
			rs = stmt.executeQuery(sql);
			System.out.println("04.query 실행 및 리턴");
			while(rs.next() ) {
				MyMemberDto dto = new MyMemberDto
						(rs.getInt(1) , rs.getString(2) ,rs.getString(3) , rs.getString(4) , rs.getString(5) , rs.getString(6), rs.getString(7) ,rs.getString(8) , rs.getString(9) );
				res.add(dto);
			}
		} catch (SQLException e) {
			System.out.println("3/4 단계 오류");
			e.printStackTrace();
		}finally {
			close(rs);
			close(stmt);
			close(con);
		}
		return res;
		
	}
	//등급을 변경할 회원 선택
	public MyMemberDto selectOne(int myno) {
		Connection con = getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		MyMemberDto res = null;
		String sql = "SELECT * FROM MYMEMBER WHERE MYNO = ? ";
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, myno);
			System.out.println("query 준비 :" + sql);
			
			rs = pstm.executeQuery();
			System.out.println("query 실행 및 리턴");
			while(rs.next() ) {
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
			System.out.println("3 /4 단계 오류");
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstm);
			close(con);
			System.out.println("05. db 종료");
		}
		return res;
	}
	
	//회원 등급 변경
	public int updateRole(int myno , String myrole) {
		Connection con = getConnection();
		PreparedStatement pstm = null;
		int res = 0;
		String sql = "UPDATE MYMEMBER SET MYROLE = ? WHERE MYNO = ?";
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, myrole);
			pstm.setInt(2, myno);
			System.out.println("03 query 준비 : " + sql);
			
			res = pstm.executeUpdate();
			System.out.println("04. query 실행 및 리턴");
			if(res > 0) {
				commit(con);
			}
		} catch (SQLException e) {
			System.out.println("3/ 4 단계 오류");
			e.printStackTrace();
		} finally {
			close(pstm);
			close(con);
		}
		return res;
	}
	
	//id중복체크
	public String idChk(String myid) {
		Connection con = getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String res = null;
		String sql = "SELECT * FROM MYMEMBER WHERE MYID = ? ";
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, myid);
			System.out.println("03. query 준비 :" +sql);
			
			rs = pstm.executeQuery();
			while(rs.next() ) {
				res = rs.getString(2);
			}
		} catch (SQLException e) {
			System.out.println("3/4 단계 오류");
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstm);
			close(con);
		}
		return res;
		
	}
	public int insertUser(MyMemberDto dto) {
		Connection con = getConnection();
		PreparedStatement pstm = null;
		int res = 0;
		String sql = "INSERT INTO MYMEMBER VALUES(MYNOSEQ.NEXTVAL, ? , ? ,? ,? ,? ,? , 'Y' , 'USER' )";
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, dto.getMyid());
			pstm.setString(2, dto.getMypw());
			pstm.setString(3, dto.getMyname());
			pstm.setString(4, dto.getMyaddr());
			pstm.setString(5, dto.getMyphone());
			pstm.setString(6, dto.getMyemail());
			System.out.println("03. query 준비 :" + sql);
			
			res = pstm.executeUpdate();
			System.out.println("04. query 실행 및 리턴");
			
			if(res>0) {
				commit(con);
			}
		} catch (SQLException e) {
			System.out.println("3 / 4 단계 오류 ");
			e.printStackTrace();
		} finally {
			close(pstm);
			close(con);
		}
		return res;
	}
	
}
