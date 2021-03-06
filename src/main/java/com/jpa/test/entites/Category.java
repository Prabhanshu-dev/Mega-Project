package com.jpa.test.entites;

	import javax.persistence.Column;
import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;

	@Entity
	public class Category {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(length=5)
		private short cId;
		@Column(length=10)
		private String cTitle;
		@Column(length=50)
		private String cDesc;
		
		public Category() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Category(String cTitle, String cDesc) {
			super();
			this.cTitle = cTitle;
			this.cDesc = cDesc;
		}

		public short getcId() {
			return cId;
		}

		public void setcId(short cId) {
			this.cId = cId;
		}

		public String getcTitle() {
			return cTitle;
		}

		public void setcTitle(String cTitle) {
			this.cTitle = cTitle;
		}

		public String getcDesc() {
			return cDesc;
		}

		public void setcDesc(String cDesc) {
			this.cDesc = cDesc;
		}

		@Override
		public String toString() {
			return "Category [cId=" + cId + ", cTitle=" + cTitle + ", cDesc=" + cDesc + "]";
		}
		
		
		
		
	}
