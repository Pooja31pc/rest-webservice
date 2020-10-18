package com.learn.shoeproject;

import javax.persistence.*;

@Entity
public class OrderItem {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long orderItemId;
	private int quantity;
	private int totalPrice;
	private int size;

	@OneToOne(targetEntity= Customer.class)
	private Customer customer;

	@OneToOne(targetEntity= Shoe.class)
	private Shoe shoe;

	public OrderItem(int quantity, int totalPrice, int size, Customer customer1, Shoe boot) {
	}

	public Long getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(Long orderItemId) {
		this.orderItemId = orderItemId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Shoe getShoe() {
		return shoe;
	}

	public void setShoe(Shoe shoe) {
		this.shoe = shoe;
	}

	public OrderItem(Long orderItemId, int quantity, int totalPrice, int size, Customer customer, Shoe shoe) {
		this.orderItemId = orderItemId;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.size = size;
		this.customer = customer;
		this.shoe = shoe;
	}

	public OrderItem() {
	}
}
