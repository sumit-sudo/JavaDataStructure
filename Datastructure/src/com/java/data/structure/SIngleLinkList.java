package com.java.data.structure;

public class SIngleLinkList {

	/*
	 * Here We have created a Node class which is responsible for Node creation. It has two field data and next,
	 * data is used to store the data and next field is holding address of next node.
	 */
	Node head;
	int count=0;
	public void insert(Employee emp)
	{
		Node node=new Node();
		node.setEmployee(emp);
		node.setNext(null);
		if(head==null)
		{
			
			head=node;
		}
		else
		{
			Node n=head;
			while(n.getNext()!=null)
			{
				n=n.getNext();
			}
			n.setNext(node);	
		}	
	}
	
	public int size()
	{
		
		Node node=head;
		while(node.getNext()!=null)
		{
			node=node.getNext();
			count++;
		}
		System.out.println(count);
		return count;
	}
	public Employee findMiddle()
	{
		Node node=head;
		int i=0;
		int middle= size()/2;
		while(i<middle)
		{
			node=node.getNext();
			i++;
		}
		return node.getEmployee();
	}
	public void insertAtLast(Employee emp)
	{
		Node newnode=new Node();
		newnode.setEmployee(emp);

		Node node=head;
		while(node.getNext()!=null)
		{
			
			node=node.getNext();
		}
		
		node.setNext(newnode);
		newnode.setNext(null);
	}
	public void insertAtBegining(Employee emp)
	{
		// Implementing stack using single linked list
		Node newnode=new Node();
		newnode.setEmployee(emp);
		newnode.setNext(head);
		head=newnode;
		
	}
	public void printList()
	{
		
		Node node=head;
		while(node.getNext()!=null)
		{
			System.out.print(node.getEmployee()+"-->");
			node=node.getNext();
		}
		System.out.println(node.getEmployee());
	}
}
