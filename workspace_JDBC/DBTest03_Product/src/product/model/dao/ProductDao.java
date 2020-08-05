package product.model.dao;

import static common.JDBCTemplate.*;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import product.model.vo.Product;

public class ProductDao {
	private Properties prop;

	public ProductDao() {
		prop = new Properties();
		try {
			prop.load(new FileReader("query.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	};

	public ArrayList<Product> selectAll(Connection con) {
		PreparedStatement pstm = null;
		ResultSet rs = null;
		ArrayList<Product> list = null;
		String sql = prop.getProperty("selectAll");

		try {
			pstm = con.prepareStatement(sql);
			rs = pstm.executeQuery();
			list = new ArrayList<>();

			while (rs.next()) {
				Product p = new Product(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4));
				list.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstm);
		}
		return list;
	}

	public Product selectOne(Connection con , String pName) {
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sql = prop.getProperty("selectOne");
		Product pro = new Product();
	
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, pName);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				pro.setpId(rs.getString(1));
				pro.setpName(rs.getString(2));
				pro.setPrice(rs.getInt(3));
				pro.setDesc(rs.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstm);
		}
		return pro;
	}

	public int insert(Connection con, Product insert) {
		PreparedStatement pstm = null;
		int res = 0;
		String sql = prop.getProperty("insert");
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, insert.getpId());
			pstm.setString(2, insert.getpName());
			pstm.setInt(3, insert.getPrice());
			pstm.setString(4, insert.getDesc());
			
			res = pstm.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstm);
		}
		return res;
	}

	public int update(Connection con, Product update) {
		PreparedStatement pstm = null;
		int res = 0;
		String sql = prop.getProperty("update");
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, update.getpName());
			pstm.setInt(2, update.getPrice());
			pstm.setString(3, update.getDesc());
			pstm.setString(4, update.getpId());
			
			res = pstm.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstm);
		}
		return res;
	}

	public int delete(Connection con, Product del) {
		PreparedStatement pstm = null;
		int res = 0;
		String sql = prop.getProperty("delete");
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, del.getpName());
			
			res = pstm.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstm);
		}
		return res;
	}

}
