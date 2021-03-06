package com.jpa.test.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

	@Entity
	public class User {
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(length=5)
		private short userid;
		@Column(length=12 ,unique=true)
		private short cardid;
		@Column(length=10)
		private String username;
		@Column(unique=true,length=40)
		private String email;
		@Column(length=12)
		private String password;
		@Column(length=10)
		private String phonenumber;
		@Column(length=200)
		private String address;
		@Column(length=10)
		private String user_type;
		
		
		
		
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
		public User(short cardid, String username, String email, String password, String phonenumber, String address,
				String user_type) {
			super();
			this.cardid = cardid;
			this.username = username;
			this.email = email;
			this.password = password;
			this.phonenumber = phonenumber;
			this.address = address;
			this.user_type = user_type;
		}



		public String getUser_type() {
			return user_type;
		}
		public void setUser_type(String user_type) {
			this.user_type = user_type;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		
		public short getCardid() {
			return cardid;
		}
		public void setCardid(short cardid) {
			this.cardid = cardid;
		}
		
		
		public short getUserid() {
			return userid;
		}
		public void setUserid(short userid) {
			this.userid = userid;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getPhonenumber() {
			return phonenumber;
		}
		public void setPhonenumber(String phonenumber) {
			this.phonenumber = phonenumber;
		}
		
		

	}


