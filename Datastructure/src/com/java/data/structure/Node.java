package com.java.data.structure;



public class Node {
	private Employee employee;
	private Node next;
	// The reason for creating object of Node class is , next will hold the object of next Node.
	// 
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}

	
	
}
