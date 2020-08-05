package com.tet01.dao;


import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tet01.dto.MyTest;

public class MyTestDao {

	public MyTest selectOne(Connection con , MyTest selectOne) {
		PreparedStatement pstm = null;
		ResultSet rs = null;
		MyTest select = new MyTest();
		String sql = "SELECT * FROM MYTEST WHERE MNO = ?";
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, selectOne.getMno());
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return select;
	}

	public int getDelete(Connection con, MyTest del) {
		PreparedStatement pstm = null;
		int res = 0;
		String sql = "DELETE FROM MYTEST WHERE MNO = ?";
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, del.getMno());
			res = pstm.executeUpdate();
			
			if(res > 0) {
				commit(con);
			}
		} catch (SQLException e) {
			rollback(con);
			e.printStackTrace();
		}
		
		return res;
	}

	public int getUpdate(Connection con, MyTest update) {
		PreparedStatement pstm = null;
		int res = 0;
		String sql = "UPDATE MYTEST SET MNAME = ? , NICKNAME = ? WHERE MNO = ?";
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, update.getMname());
			pstm.setString(2, update.getNickname());
			pstm.setInt(3, update.getMno());
			res = pstm.executeUpdate();
			
			if (res > 0 ) {
				commit(con);
			}
		} catch (SQLException e) {
			rollback(con);
			e.printStackTrace();
		}
		
		return res;
	}

	public int getInsert(Connection con, MyTest dto) {
		PreparedStatement pstm = null;
		int res = 0;
		String sql = "INSERT INTO MYTEST VALUES(? , ? ,? )";
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, dto.getMno());
			pstm.setString(2, dto.getMname());
			pstm.setString(3, dto.getNickname());
			res = pstm.executeUpdate();
			
			if(res > 0 ) {
				commit(con);
			}
		} catch (SQLException e) {
			rollback(con);
			e.printStackTrace();
		}
		return res;
	}

	public List<MyTest> getAll(Connection con) {
		Statement stmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM MYTEST";
		List<MyTest> my = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				MyTest tmp = new MyTest(rs.getInt(1) , rs.getString(2) , rs.getString(3));
				my.add(tmp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(stmt);
		}
		
		return my;
		
	}

}
