package com.product.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.ToString;

@ToString
@Entity
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7990990475992677604L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ProductId")
	private Long productId;
	@Column(name = "Price")
	private Long price;
	@Column(name = "ProductName")
	private String productName;
	@Column(name = "QuantitySold")
	private Long quantitySold;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
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
