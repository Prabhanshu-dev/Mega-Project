package com.jpa.test.entites;





import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Orders {
	
     @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    
	private short OrderId;
     @Column(length=5)
	private short  userid;
     @Column(length=5)
	private short pId;
 
	private Date OrderDate;
	@Column(length=5)
	private short Order_cost;
	
	
	
  
	private short orderquantity;

	private short ShippingId;

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Orders(short userid, short pId, Date orderDate, short Order_cost, short orderquantity, short ShippingId) {
	super();
	this.userid = userid;
	this.pId = pId;
	this.OrderDate = orderDate;
	this.Order_cost = Order_cost;
	
	this.orderquantity = orderquantity;
	this.ShippingId = ShippingId;
}
	public short getOrderId() {
		return OrderId;
	}
	public void setOrderId(short orderId) {
		this.OrderId = orderId;
	}
	public short getUserid() {
		return userid;
	}
	public void setUserid(short userid) {
		this.userid = userid;
	}
	public short getpId() {
		return pId;
	}
	public void setpId(short pId) {
		this.pId = pId;
	}
	public Date getOrderDate() {
		return OrderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.OrderDate = orderDate;
	}
	public short getShippingId() {
		return ShippingId;
	}
	public void setShippingId(short ShippingId) {
		this.ShippingId = ShippingId;
	}
	public short getOrderquantity() {
		return orderquantity;
	}
	public void setOrderquantity(short orderquantity) {
		this.orderquantity = orderquantity;
	}
	public short getOrder_cost() {
		return Order_cost;
	}
	public void setOrder_cost(short order_cost) {
		Order_cost = order_cost;
	}

/*	public short getTotal_cost() {
		return Total_cost;
	}
	public void setTotal_cost(short total_cost) {
		Total_cost = total_cost;
	}*/
	
		
	
}
