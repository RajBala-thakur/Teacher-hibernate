package com.ty.dto;


	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;

	@Entity
	public class Student {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int identityNumber;
		private String name;
		private String address;
		private long phone;
		private int pincode;
		private String father_name;
		private String mother_name;
		public int getIdentityNumber() {
			return identityNumber;
		}
		public void setIdentityNumber(int identityNumber) {
			this.identityNumber = identityNumber;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public long getPhone() {
			return phone;
		}
		public void setPhone(long phone) {
			this.phone = phone;
		}
		public int getPincode() {
			return pincode;
		}
		public void setPincode(int pincode) {
			this.pincode = pincode;
		}
		public String getFather_name() {
			return father_name;
		}
		public void setFather_name(String father_name) {
			this.father_name = father_name;
		}
		public String getMother_name() {
			return mother_name;
		}
		public void setMother_name(String mother_name) {
			this.mother_name = mother_name;
		}
		@Override
		public String toString() {
			return "Student [identityNumber=" + identityNumber + ", name=" + name + ", address=" + address + ", phone="
					+ phone + ", pincode=" + pincode + ", father_name=" + father_name + ", mother_name=" + mother_name
					+ "]";
		}
		
		

	}



