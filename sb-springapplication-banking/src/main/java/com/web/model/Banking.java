package com.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Banking {
	@Id
     private int an;
     private String un;
     private String pswd;
     private String cpswd;
     private double amount;
     private String address;
     private long phone;
	public Banking() {
		super();
	}
	public int getAn() {
		return an;
	}
	public String getUn() {
		return un;
	}
	public String getPswd() {
		return pswd;
	}
	public String getCpswd() {
		return cpswd;
	}
	public double getAmount() {
		return amount;
	}
	public String getAddress() {
		return address;
	}
	public long getPhone() {
		return phone;
	}
	public void setAn(int an) {
		this.an = an;
	}
	public void setUn(String un) {
		this.un = un;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	public void setCpswd(String cpswd) {
		this.cpswd = cpswd;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Banking [an=" + an + ", un=" + un + ", pswd=" + pswd + ", cpswd=" + cpswd + ", amount=" + amount
				+ ", address=" + address + ", phone=" + phone + "]";
	}
	
	
     
}
