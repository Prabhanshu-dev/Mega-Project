package com.jpa.test.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Order_item {
	
         @Id
         @GeneratedValue(strategy = GenerationType.IDENTITY)
        private short order_item_id;
        private short pId;
        private  short OrderId;
        private short quantity;
        private short createdAt;
        private short  updatedAt;
        @Column(length=50)
        private  String content;
		public Order_item() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Order_item(short order_item_id, short pId, short orderId, short quantity, short createdAt, short updatedAt,
				String content) {
			super();
			this.order_item_id = order_item_id;
			this.pId = pId;
			OrderId = orderId;
			this.quantity = quantity;
			this.createdAt = createdAt;
			this.updatedAt = updatedAt;
			this.content = content;
		}
		public short getpId() {
			return pId;
		}
		public void setpId(short pId) {
			this.pId = pId;
		}
		public short getOrderId() {
			return OrderId;
		}
		public void setOrderId(short orderId) {
			OrderId = orderId;
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
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		@Override
		public String toString() {
			return "Order_item [order_item_id=" + order_item_id + ", pId=" + pId + ", OrderId=" + OrderId
					+ ", quantity=" + quantity + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", content="
					+ content + "]";
		}
		
		
		
}
