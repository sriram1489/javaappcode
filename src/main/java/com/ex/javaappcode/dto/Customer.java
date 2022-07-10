package com.ex.javaappcode.dto;

import java.util.Date;

public class Customer {
	
	private String name;
	private String regnumber;
	private Date regdate;
	
	public Customer() {}
	
	
	public Customer(String name, String regnumber, Date regdate) {
		super();
		this.name = name;
		this.regnumber = regnumber;
		this.regdate = regdate;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegnumber() {
		return regnumber;
	}
	public void setRegnumber(String regnumber) {
		this.regnumber = regnumber;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

}
