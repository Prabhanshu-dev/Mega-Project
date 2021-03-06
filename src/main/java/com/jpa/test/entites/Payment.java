package com.jpa.test.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short paymentId;
	private short payment_type;
	private int OrderId;
	private short ShippingId;

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payment(short payment_type, int orderId, short shippingId) {
		super();
		this.payment_type = payment_type;
		OrderId = orderId;
		ShippingId = shippingId;
	}

	public short getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(short paymentId) {
		this.paymentId = paymentId;
	}

	public short getPayment_type() {
		return payment_type;
	}

	public void setPayment_type(short payment_type) {
		this.payment_type = payment_type;
	}

	public int getOrderId() {
		return OrderId;
	}

	public void setOrderId(int orderId) {
		OrderId = orderId;
	}

	public short getShippingId() {
		return ShippingId;
	}

	public void setShippingId(short shippingId) {
		ShippingId = shippingId;
	}
	
	

}
