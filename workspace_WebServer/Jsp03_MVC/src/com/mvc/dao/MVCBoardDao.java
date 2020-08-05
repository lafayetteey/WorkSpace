 package com.mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mvc.dto.MVCBoardDto;

import common.JDBCTemplate;

public class MVCBoardDao extends JDBCTemplate {
	
 	public List<MVCBoardDto> selectAll( ){
 		Connection con = getConnection();
 		Statement stmt = null;
 		ResultSet rs = null;
 		List<MVCBoardDto> res = new ArrayList<>();
 		String sql = "SELECT * FROM MVCBOARD ORDER BY SEQ DESC ";
 		
 		try {
			stmt = con.createStatement();
			System.out.println("03. query 준비 : " + sql);
			rs = stmt.executeQuery(sql);
			System.out.println("04.query 실행 및 리턴");
			while(rs.next()) {
				MVCBoardDto dto = new MVCBoardDto(rs.getInt(1) , rs.getString(2) , rs.getString(3) , rs.getString(4) , rs.getDate(5));
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
 	public MVCBoardDto selectOne(int seq) {
 		Connection con = getConnection();
 		PreparedStatement pstm = null;
 		ResultSet rs = null;
 		MVCBoardDto res = null;
 		String sql = "SELECT * FROM MVCBOARD WHERE SEQ = ? "; 
 		
 		try {
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, seq);
			System.out.println("03. query 준비 :" + sql);
			rs = pstm.executeQuery();
			System.out.println("04. query 실행 및 준비 ");
			while( rs.next( ) )  {
				res = new MVCBoardDto();
				res.setSeq(rs.getInt(1));
				res.setWriter(rs.getString(2));
				res.setTitle(rs.getString(3));
				res.setContent(rs.getString(4));
				res.setRegdate(rs.getDate(5));
			}
		} catch (SQLException e) {
			System.out.println("3/4 단계 오류");
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstm);
			close(con);
			System.out.println("db 종료");
		}
		return res;
 	}
 	public int insert(MVCBoardDto dto) {
 		Connection con = getConnection();
 		PreparedStatement pstm = null;
 		int res = 0;
 		String sql = "INSERT INTO MVCBOARD VALUES(MVCBOARDSEQ.NEXTVAL , ? , ? , ? , SYSDATE)";
 		
 		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, dto.getWriter());
			pstm.setString(2, dto.getTitle());
			pstm.setString(3, dto.getContent());
			System.out.println("query 문 작성 : " + sql);
			
			res = pstm.executeUpdate();
			System.out.println("query 문 실행 및 리턴");
			if(res > 0) {
				commit(con);
			}
		} catch (SQLException e) {
			System.out.println("3/ 4 단계 오류");
			e.printStackTrace();
		} finally {
			close(pstm);
			close(con);
			System.out.println("db 종료");
		}
		return res;
 	}
 	public int update(MVCBoardDto dto) {
 		Connection con = getConnection();
 		PreparedStatement pstm = null;
 		int res = 0;
 		String sql = "UPDATE MVCBOARD SET TITLE = ? , CONTENT = ? WHERE SEQ = ? ";
 		
 		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, dto.getTitle());
			pstm.setString(2, dto.getContent());
			pstm.setInt(3, dto.getSeq());
			System.out.println("03.query 준비 : " + sql);
			
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
 	public int delete(int seq) {
 		Connection con = getConnection();
 		PreparedStatement pstm = null;
 		int res = 0;
 		String sql = "DELETE FROM MVCBOARD WHERE SEQ = ? ";
 		
 		try {
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, seq);
			System.out.println("03. qeury 준비 : " + sql);
			
			res = pstm.executeUpdate();
			System.out.println("04. query 실행 및 리턴");
			if(res> 0) {
				commit(con);
			}
		} catch (SQLException e) {
			System.out.println("db 종료 ");
			e.printStackTrace();
		} finally {
			close(pstm);
			close(con);
		}
		return res;
 	}
}
