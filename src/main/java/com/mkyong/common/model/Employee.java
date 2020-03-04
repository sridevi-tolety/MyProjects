package com.mkyong.common.model;

import java.util.Date;
@Entity
@Table(name= “employee”)
public class Employee {
	
	private int id;
	private String name;
	private Date date;
	private Date intime;
	private Date outtime;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getIntime() {
		return intime;
	}
	public void setIntime(Date intime) {
		this.intime = intime;
	}
	public Date getOuttime() {
		return outtime;
	}
	public void setOuttime(Date outtime) {
		this.outtime = outtime;
	}
	                       
	public Employee(int id, String name, Date date, Date intime, Date outtime, String location) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.intime = intime;
		this.outtime = outtime;
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", date=" + date + ", intime=" + intime + ", outtime="
				+ outtime + "]";
	}

}
