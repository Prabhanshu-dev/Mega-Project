package com.jpa.test.entites;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;

	@Entity
	public class Product {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(length=5)
		private short pId;
		@Column(length=10)
		private String pTitle;
		@Column(length = 50)
		private String pDesc;
		private String pPhoto;
		@Column(length=5)
		private short pPrice;
		@Column(length=5)
		private short pDiscount;
		@Column(length=5)
		private short pQuantity;
		@Column(length=5)
		private short cId;
		
		public Product() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Product(String pTitle, String pDesc, String pPhoto, short pPrice, short pDiscount, short pQuantity, short cId) {
			super();
			this.pTitle = pTitle;
			this.pDesc = pDesc;
			this.pPhoto = pPhoto;
			this.pPrice = pPrice;
			this.pDiscount = pDiscount;
			this.pQuantity = pQuantity;
			this.cId = cId;
		}

		public short getpId() {
			return pId;
		}

		public void setpId(short pId) {
			this.pId = pId;
		}

		public String getpTitle() {
			return pTitle;
		}

		public void setpTitle(String pTitle) {
			this.pTitle = pTitle;
		}

		public String getpDesc() {
			return pDesc;
		}

		public void setpDesc(String pDesc) {
			this.pDesc = pDesc;
		}

		public String getpPhoto() {
			return pPhoto;
		}

		public void setpPhoto(String pPhoto) {
			this.pPhoto = pPhoto;
		}

		public short getpPrice() {
			return pPrice;
		}

		public void setpPrice(short pPrice) {
			this.pPrice = pPrice;
		}

		public short getpDiscount() {
			return pDiscount;
		}

		public void setpDiscount(short pDiscount) {
			this.pDiscount = pDiscount;
		}

		public short getpQuantity() {
			return pQuantity;
		}

		public void setpQuantity(short pQuantity) {
			this.pQuantity = pQuantity;
		}

		public short getcId() {
			return cId;
		}

		public void setcId(short cId) {
			this.cId = cId;
		}

		@Override
		public String toString() {
			return "Product [pId=" + pId + ", pTitle=" + pTitle + ", pDesc=" + pDesc + ", pPhoto=" + pPhoto + ", pPrice="
					+ pPrice + ", pDiscount=" + pDiscount + ", pQuantity=" + pQuantity + ", cId=" + cId + "]";
		}

		
		
		
	}
