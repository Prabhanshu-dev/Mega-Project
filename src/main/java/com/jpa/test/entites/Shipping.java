package com.jpa.test.entites;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Shipping {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ShippingId;
	private int OrderId;
	private Date Shipping_date;
	private int Shipping_cost;
	
	
	public Shipping() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shipping(int orderId, Date Shipping_date, int Shipping_cost) {
		super();
		OrderId = orderId;
		this.Shipping_date = Shipping_date;
		this.Shipping_cost = Shipping_cost;
	}


	public int getShippingId() {
		return ShippingId;
	}

	public void setShippingId(int shippingId) {
		ShippingId = shippingId;
	}

	public int getOrderId() {
		return OrderId;
	}

	public void setOrderId(int orderId) {
		OrderId = orderId;
	}


	public Date getShipping_date() {
		return Shipping_date;
	}

	public void setShipping_date(Date shipping_date) {
		Shipping_date = shipping_date;
	}

	public int getShipping_cost() {
		return Shipping_cost;
	}

	public void setShipping_cost(int shipping_cost) {
		Shipping_cost = shipping_cost;
	}

	
}
