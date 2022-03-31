package com.java.data.structure;

public class Cutsomer {

	private int custid;
	private String custname;
	private double salary;
	
	public Cutsomer(int custid, String custname, double salary) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.salary = salary;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "[custid=" + custid + ", custname=" + custname + ", salary=" + salary + "]";
	}
	 
	
}
