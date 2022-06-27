package com.bean;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ProductBean {
	int productId;

	@NotBlank(message = "Please Enter Product Name")
	String name;

	@NotNull(message = "Please Enter Price")
	@Min(value = 10)
	Integer price;

	@NotNull(message = "Please Enter Qty")
	@Min(value = 1)
	int qty;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

}
