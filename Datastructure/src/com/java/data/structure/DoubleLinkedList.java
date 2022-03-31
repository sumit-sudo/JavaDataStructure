package com.java.data.structure;

public class DoubleLinkedList {

	/*
	 * The main advantage of doublelinkedlist is, we can perform operation  from  both end.
	 * 
	 * 
	 */
	DoubleNode head;
	DoubleNode tail;
	public void insert(Cutsomer cust)
	{
		DoubleNode node=new DoubleNode();
		node.setCust(cust);
		if(head==null)
		{
			node.setPrev(null);
			node.setNext(null);
			head=node;
			tail=node;
		}
		else
		{
			DoubleNode n=head;
			while(n.getNext()!=null)
			{
				n=n.getNext();
			}
			n.setNext(node);
			node.setPrev(n);
			node.setNext(null);
			tail=node;
		}
	}
	
	public void printList()
	{
		DoubleNode n=head;
		while(n.getNext()!=null)
		{
			System.out.print(n.getCust());
		}
		System.out.println(n.getCust());
	}
}
