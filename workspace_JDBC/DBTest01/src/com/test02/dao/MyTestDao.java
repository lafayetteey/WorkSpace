package com.test02.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import static common.JDBCTemplate.*;

import com.test02.dto.MyTest;

//dao : 데이터를 담을 객체
public class MyTestDao {

	public List<MyTest> getAll(Connection con) {
		
		Statement stmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM MYTEST";
		List<MyTest> my = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				//dto에담는다
				MyTest tmp = new MyTest(rs.getInt(1), rs.getString(2), rs.getString(3));
				//ArrayList 에 해당 dto를 추가 
				my.add(tmp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//con 은 close하면 안됨  
			close(rs);		
			close(stmt);
		}
		return my;
	}

	public int getUpdate(Connection con, MyTest update) {
		PreparedStatement pstm = null;
		int res = 0;
		String sql = "UPDATE MYTEST SET MNAME = ? , NICKNAME =? WHERE MNO = ?";
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, update.getMname());
			pstm.setString(2, update.getNickname());
			pstm.setInt(3, update.getMno());
			
			res = pstm.executeUpdate();
			//수정 성공 시 commit(con);
			if (res > 0) {
				commit(con);
			}
			
		} catch (SQLException e) {
			//수정 실패 시 rollback(con);
			rollback(con);
			
			e.printStackTrace();
		} finally {
			close(pstm);
		}
		return res;
	}

	public int getInsert(Connection con, MyTest dto) {
		PreparedStatement pstm = null;
		int res = 0;
		
		String sql = "INSERT INTO MYTEST VALUES(? , ? , ?)";
		
		try {
			pstm =con.prepareStatement(sql);
			pstm.setInt(1, dto.getMno());
			pstm.setString(2, dto.getMname());
			pstm.setString(3, dto.getNickname());
			res = pstm.executeUpdate();
			
			if( res > 0) {
				commit(con);
			}
		} catch (SQLException e) {
			rollback(con);
			e.printStackTrace();
		} finally {
			close(pstm);
		}
		return res;
	}

	public int getDelete(Connection con, MyTest delete) {
		PreparedStatement pstm = null;
		int res = 0;
		String sql = "DELETE FROM MYTEST WHERE MNO =?";
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, delete.getMno());
			res = pstm.executeUpdate();
			
			if(res > 0 ) {
				commit(con);
			}
		} catch (SQLException e) {
			rollback(con);
			e.printStackTrace();
		} finally {
			close(pstm);
		}
		
		return res;
	}

	public MyTest getSelectOne(int mno , Connection con) {
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM MYTEST WHERE MNO = ?";
		MyTest my = new MyTest();
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, mno);
			rs = pstm.executeQuery();
			while(rs.next()) {
				my.setMno(rs.getInt(1));
				my.setMname(rs.getString(2));
				my.setNickname(rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstm);
		}
		return my;
	}

	

}
