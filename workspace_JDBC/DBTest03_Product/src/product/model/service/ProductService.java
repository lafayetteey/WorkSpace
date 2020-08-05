package product.model.service;

import static common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import static common.JDBCTemplate.*;
import product.model.dao.ProductDao;
import product.model.vo.Product;

public class ProductService {
	ProductDao dao = new ProductDao();
	
	public List<Product> selectAll() {
		Connection con = getConnection();
		//res 안에 dao 의 list가 들어있음
		ArrayList<Product> res = dao.selectAll(con);
		close(con);
		return res;
	}

	public Product selectOne(String pName) {
		Connection con = getConnection();
		Product pro = dao.selectOne(con, pName);
		close(con);
		return pro;
	}

	public int insert(Product insert) {
		Connection con = getConnection();
		int res_insert = dao.insert(con , insert);
		if(res_insert > 0) {
			commit(con);
		} else {
			rollback(con);
		}
		close(con);
		return res_insert;
	}

	public int update(Product update) {
		Connection con = getConnection();
		int res_update = dao.update(con , update);
		if(res_update > 0) {
			commit(con);
		} else {
			rollback(con);
		}
		close(con);
		return res_update;
	}

	public int delete(Product del) {
		Connection con = getConnection();
		int res_del = dao.delete(con , del);
		if(res_del > 0) {
			commit(con);
		} else {
			rollback(con);
		}
		close(con);
		return res_del;
	}

}
