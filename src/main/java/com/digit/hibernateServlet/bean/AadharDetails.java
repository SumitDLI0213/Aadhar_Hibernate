package com.digit.hibernateServlet.bean;

public class AadharDetails 
{
	 int aadhar_id;
     String name;
     String father_name;
     String mother_name;
     String dob;
     String address;
     String city;
	 int pincode;
	 public int getAadhar_id() {
			return aadhar_id;
		}
		public void setAadhar_id(int aadhar_id) {
			this.aadhar_id = aadhar_id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
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
		public String getDob() {
			return dob;
		}
		public void setDob(String dob) {
			this.dob = dob;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public int getPincode() {
			return pincode;
		}
		public void setPincode(int pincode) {
			this.pincode = pincode;
		}
}
