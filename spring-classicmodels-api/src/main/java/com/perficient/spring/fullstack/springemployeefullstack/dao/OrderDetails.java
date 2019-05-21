package com.perficient.spring.fullstack.springemployeefullstack.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "orderdetails")
public class OrderDetails {

	@Id
	@Column(name = "orderNumber", columnDefinition = "int")
	private int  orderNumber;
	@Column(name = "productCode", columnDefinition = "varchar")
	private String productCode;
	@Column(name = "quantityOrdered", columnDefinition = "int")
	private int quantityOrdered;
	@Column(name = "priceEach", columnDefinition = "decimal")
	private double priceEach;

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public int getQuantityOrdered() {
		return quantityOrdered;
	}

	public void setQuantityOrdered(int quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}

	public double getPriceEach() {
		return priceEach;
	}

	public void setPriceEach(double priceEach) {
		this.priceEach = priceEach;
	}

	

}