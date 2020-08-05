package product.controller;

import java.util.List;
import product.model.service.ProductService;
import product.model.vo.Product;

public class ProductController {
	ProductService ps = new ProductService();
	
	
	public List<Product> selectAll() {
		return ps.selectAll();
	}


	public Product selectOne(String pName) {
		return ps.selectOne(pName);
	}


	public int insert(Product insert) {
		return ps.insert(insert);
	}


	public int update(Product update) {
		return ps.update(update);
	}


	public int delete(Product del) {
		return ps.delete(del);
	}
	
}
