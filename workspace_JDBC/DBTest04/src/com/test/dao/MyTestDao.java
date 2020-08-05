package com.test.dao;

import static common.JDBCTemplet.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.test.dto.MyTest;

public class MyTestDao {

	public int getDelete(Connection con, MyTest delete) {
		PreparedStatement pstm = null;
		String sql = "DELETE FROM MYTEST WHERE MNO = ?";
		int res = 0;
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, delete.getMno());
			res = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstm);
		}
		
		return res;
	}

	public int getUpdate(Connection con, MyTest update) {
		PreparedStatement pstm = null;
		int res = 0;
		String sql = "UPDATE MYTEST SET MNAME =? , NICKNAME = ? WHERE MNO = ? ";
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, update.getMname());
			pstm.setString(2, update.getNickname());
			pstm.setInt(3, update.getMno());
			
			res = pstm.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstm);
		}
		
		return res;
	}

	public int getInsert(Connection con, MyTest insert) {
		PreparedStatement pstm = null;
		int res = 0;
		String sql = "INSERT INTO MYTEST VALUES(? , ? , ?)";
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, insert.getMno());
			pstm.setString(2, insert.getMname());
			pstm.setString(3, insert.getNickname());
			
			res = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstm);
		}
		
		
		return res;
	}

	public List<MyTest> getAll(Connection con) {
		
		Statement stmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM MYTEST";
		List<MyTest> list = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				MyTest tmp = new MyTest(rs.getInt(1) , rs.getString(2) , rs.getString(3));
				list.add(tmp);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(stmt);
		}
		
		return list;
	}
	
}
