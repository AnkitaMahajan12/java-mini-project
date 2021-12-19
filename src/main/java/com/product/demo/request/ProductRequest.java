package com.product.demo.request;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class ProductRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6475613409199084558L;

	private Long productId;
	private Long Price;
	private String productName;
	private Long quantitySold;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getPrice() {
		return Price;
	}

	public void setPrice(Long price) {
		Price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Long getQuantitySold() {
		return quantitySold;
	}

	public void setQuantitySold(Long quantitySold) {
		this.quantitySold = quantitySold;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
