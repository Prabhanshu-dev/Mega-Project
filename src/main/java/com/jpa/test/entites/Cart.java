package com.jpa.test.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cart {
	
	@Id
	@Column(length=5)
	private short cId;
	@Column(length=5)
	private short pId;
	private short Quantity;
	
	public Cart()
	{
		super();
	}
	
	public Cart(short cId, short pId, short quantity) {
		super();
		this.cId = cId;
		this.pId = pId;
		this.Quantity = quantity;
	}

	public short getQuantity() {
		return Quantity;
	}
	public void setQuantity(short quantity) {
		Quantity = quantity;
	}
	public short getcId() {
		return cId;
	}
	public void setcId(short cId) {
		this.cId = cId;
	}
	public short getpId() {
		return pId;
	}
	public void setpId(short pId) {
		this.pId = pId;
	}
	
	@Override
	public String toString() {
		return "Cart [cId=" + cId + ", pId=" + pId + ", Quantity=" + Quantity + "]";
	}

}
