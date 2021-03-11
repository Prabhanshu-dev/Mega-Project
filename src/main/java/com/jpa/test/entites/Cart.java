package com.jpa.test.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cart {
	
	@Id
	@Column(length=5)
	private short cartId;
	@Column(length=5)
	private short pId;
	private short userid;;
	private short Quantity;
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cart(short pId, short userid, short quantity) {
		super();
		this.pId = pId;
		this.userid = userid;
		Quantity = quantity;
	}
	public short getCartId() {
		return cartId;
	}
	public void setCartId(short cartId) {
		this.cartId = cartId;
	}
	public short getpId() {
		return pId;
	}
	public void setpId(short pId) {
		this.pId = pId;
	}
	public short getUserid() {
		return userid;
	}
	public void setUserid(short userid) {
		this.userid = userid;
	}
	public short getQuantity() {
		return Quantity;
	}
	public void setQuantity(short quantity) {
		Quantity = quantity;
	}
	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", pId=" + pId + ", userid=" + userid + ", Quantity=" + Quantity + "]";
	}
	
	
	

}
