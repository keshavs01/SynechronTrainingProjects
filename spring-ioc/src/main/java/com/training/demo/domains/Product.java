package com.training.demo.domains;

public class Product {
	
	private int productId;
	private String productName;
	private String imageRef;
	private double ratePerUnit;
	public Product() {
		super();
		System.out.println("Product Initialised");
		// TODO Auto-generated constructor stub
	}
	public Product(int productId, String productName, String imageRef, double ratePerUnit) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.imageRef = imageRef;
		this.ratePerUnit = ratePerUnit;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		System.out.println("Inside the setter of ID");
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getImageRef() {
		return imageRef;
	}
	public void setImageRef(String imageRef) {
		this.imageRef = imageRef;
	}
	public double getRatePerUnit() {
		return ratePerUnit;
	}
	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", imageRef=" + imageRef
				+ ", ratePerUnit=" + ratePerUnit + "]";
	}	

}
