package com.jpa.test.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart_item {
          
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short cart_item_id;
	private short pId;
	private short cartId;
	 private short quantity;
     private short createdAt;
     private short  updatedAt;
     
	public Cart_item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cart_item(short pId, short cartId, short quantity, short createdAt, short updatedAt) {
		super();
		this.pId = pId;
		this.cartId = cartId;
		this.quantity = quantity;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	public short getCart_id() {
		return cart_item_id;
	}
	public void setCart_id(short cart_id) {
		this.cart_item_id = cart_id;
	}
	public short getpId() {
		return pId;
	}
	public void setpId(short pId) {
		this.pId = pId;
	}
	public short getCartId() {
		return cartId;
	}
	public void setCartId(short cartId) {
		this.cartId = cartId;
	}
	public short getQuantity() {
		return quantity;
	}
	public void setQuantity(short quantity) {
		this.quantity = quantity;
	}
	public short getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(short createdAt) {
		this.createdAt = createdAt;
	}
	public short getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(short updatedAt) {
		this.updatedAt = updatedAt;
	}
	@Override
	public String toString() {
		return "Cart_item [cart_id=" + cart_item_id + ", pId=" + pId + ", cartId=" + cartId + ", quantity=" + quantity
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}
	
	
	
}
