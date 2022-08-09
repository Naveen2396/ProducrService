package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	@Column(name="productid")
	private Integer productid;
	@Column(name="productname")
	private String productname;
	@Column(name="productprice")
	private Double productprice;
	@Column(name="productactvualprice")
	private Double productactvualprice;
	public Integer getProductid() {
		return productid;
	}
	public void setProductid(Integer productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public Double getProductprice() {
		return productprice;
	}
	public void setProductprice(Double productprice) {
		this.productprice = productprice;
	}
	public Double getProductactvualprice() {
		return productactvualprice;
	}
	public void setProductactvualprice(Double productactvualprice) {
		this.productactvualprice = productactvualprice;
	}
	
	

}
