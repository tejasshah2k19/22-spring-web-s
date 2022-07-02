package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.ProductBean;

@Repository
public class ProductDao {

	@Autowired
	JdbcTemplate stmt;

	public void insertProduct(ProductBean product) {
		stmt.update("insert into products (name,price,qty,imgurl) values (?,?,?,?) ", product.getName(),
				product.getPrice(), product.getQty(), product.getImgurl());
	}

	public List<ProductBean> getAllProducts() {
		return stmt.query("select * from products", new BeanPropertyRowMapper<ProductBean>(ProductBean.class));
	}

//	public void  deleteProduct() {
//		
//	}

	public ProductBean getProductById(int productId) {
		return stmt.queryForObject("select * from products where productid = ? ",
				new BeanPropertyRowMapper<ProductBean>(ProductBean.class), new Object[] { productId });
	}
}
