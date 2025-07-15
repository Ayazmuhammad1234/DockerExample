package com.orderservice.model;

public class OrderEvent {
    private String orderId;
    private String userEmail;
    private String productName;
    private int quantity;
    private double price;

    // Constructors
    public OrderEvent() {}
    public OrderEvent(String orderId, String userEmail, String productName, int quantity, double price) {
        this.orderId = orderId;
        this.userEmail = userEmail;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "OrderEvent [orderId=" + orderId + ", userEmail=" + userEmail + ", productName=" + productName
				+ ", quantity=" + quantity + ", price=" + price + "]";
	}
    
    
}