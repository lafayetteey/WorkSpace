package com.dao;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dto.Member;
//db에 접근 및 결과 값 리턴
public class MemberDaoImpl implements MemberDao {
	
//DAO : Data Access Object : Database의 data에 접근을 위한 객체
	
	@Override
	public List<Member> selectAll(Connection con) {
		Statement stmt = null;
		ResultSet rs = null;
		List<Member> res = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(selectAll);
			
			while (rs .next()) {
				Member tmp = new Member();
				tmp.setM_no(rs.getInt(1));
				tmp.setM_name(rs.getString(2));
				tmp.setM_age(rs.getInt(3));
				tmp.setM_gender(rs.getString("M_GENDER"));
				tmp.setM_location(rs.getString(5));
				tmp.setM_job(rs.getString(6));
				tmp.setM_tel(rs.getString(7));
				tmp.setM_email(rs.getString(8));
				//List에 추가
				res.add(tmp);
			}			
		} catch (SQLException e) {			
			e.printStackTrace();
		} finally {
			close(rs);
			close(stmt);
		}
		return res;
	}

	@Override
	public Member selectOne(Connection con, int no) {
		PreparedStatement pstm = null;
		ResultSet rs = null;
		Member m = new Member();
		
		try {
			pstm = con.prepareStatement(selectOne);
			pstm.setInt(1, no);
			rs = pstm.executeQuery();
			while(rs.next()) {
				m.setM_no(rs.getInt(1));
				m.setM_name(rs.getString(2));
				m.setM_age(rs.getInt(3));
				m.setM_gender(rs.getString(4));
				m.setM_location(rs.getString(5));
				m.setM_job(rs.getString(6));
				m.setM_tel(rs.getString(7));
				m.setM_email(rs.getString(8));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstm);
		}
		return m;
	}

	@Override
	public int insert(Connection con, Member m) {
		PreparedStatement pstm = null;
		int res = 0;
		
		try {
			pstm = con.prepareStatement(insert);
			pstm.setInt(1, m.getM_no());
			pstm.setString(2, m.getM_name());
			pstm.setInt(3, m.getM_age());
			pstm.setString(4, m.getM_gender());
			pstm.setString(5, m.getM_location());
			pstm.setString(6, m.getM_job());
			pstm.setString(7, m.getM_tel());
			pstm.setString(8, m.getM_email());
			
			res = pstm.executeUpdate();
			
			if(res > 0) {
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

	@Override
	public int delete(Connection con, int no) {
		PreparedStatement pstm = null;
		int res = 0;
		
		try {
			pstm = con.prepareStatement(delete);
			pstm.setInt(1, no);
			res = pstm.executeUpdate();
			if(res > 0) {
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

	@Override
	public int update(Connection con, Member m) {
		PreparedStatement pstm = null;
		int res = 0;
		
		try {
			pstm = con.prepareStatement(update);
			pstm.setString(1, m.getM_name());
			pstm.setInt(2, m.getM_age());
			pstm.setString(3, m.getM_gender());
			pstm.setString(4, m.getM_location());
			pstm.setString(5, m.getM_job());
			pstm.setString(6, m.getM_tel());
			pstm.setString(7, m.getM_email());
			pstm.setInt(8, m.getM_no());
			
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

}
