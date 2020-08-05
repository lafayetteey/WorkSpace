package com.multi.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.multi.dto.MDBoardDto;

import common.JDBCTemplate;

public class MDBoardDao extends JDBCTemplate{
	
	public List<MDBoardDto> selectAll() {
		Connection con = getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		List<MDBoardDto> res = new ArrayList<>();
		String sql = "SELECT * FROM MDBOARD";
		
		try {
			stmt = con.createStatement();
			System.out.println("03. query 준비");
			
			rs = stmt.executeQuery(sql);
			System.out.println("04. query 실행 및 리턴 :" + sql);
			
			while(rs.next() ) {
				MDBoardDto dto = new MDBoardDto(rs.getInt(1), rs.getString(2) , rs.getString(3), rs.getString(4), rs.getDate(5));
				res.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rs);
			close(stmt);
			close(con);
		}
		
		
		return res;
		
	}
}
