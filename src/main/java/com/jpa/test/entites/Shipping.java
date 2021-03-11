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
	private short ShippingId;
	private short OrderId;
	private Date Shipping_date;
	private short Shipping_cost;
	
	
	public Shipping() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shipping(short orderId, Date Shipping_date, short Shipping_cost) {
		super();
		OrderId = orderId;
		this.Shipping_date = Shipping_date;
		this.Shipping_cost = Shipping_cost;
	}


	public short getShippingId() {
		return ShippingId;
	}

	public void setShippingId(short shippingId) {
		ShippingId = shippingId;
	}

	public short getOrderId() {
		return OrderId;
	}

	public void setOrderId(short orderId) {
		OrderId = orderId;
	}


	public Date getShipping_date() {
		return Shipping_date;
	}

	public void setShipping_date(Date shipping_date) {
		Shipping_date = shipping_date;
	}

	public short getShipping_cost() {
		return Shipping_cost;
	}

	public void setShipping_cost(short shipping_cost) {
		Shipping_cost = shipping_cost;
	}

	
}
