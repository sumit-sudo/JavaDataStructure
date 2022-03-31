package com.java.data.structure;


public class MainClass {
	public static void main(String arg[])
	{
		// ArrayList OPeration
		
//		ArrayList obj=new ArrayList();
//		obj.arrayListOperation();
		
		// SIngle Linked List
		
//		SIngleLinkList list=new SIngleLinkList();
//		list.insert(new Employee(1,"SUmit Kumar",10000.0));
//		list.insert(new Employee(2,"XUmit Kumar",20000.0));
//		list.insert(new Employee(3,"YUmit Kumar",30000.0));
//		list.insert(new Employee(4,"ZUmit Kumar",40000.0));
//		
//		list.insertAtLast(new Employee(100,"Pintu Saha",4000000.0));
//		
//		list.insertAtBegining(new Employee(1000,"Rabinda Sharma",1000.0));
//		list.insertAtLast(new Employee(101,"Pintu Saha1",4000000.0));
//		list.printList();
//		System.out.println(list.findMiddle());
		
		// Double Linked List
		
//		DoubleLinkedList dlist=new DoubleLinkedList();
//		dlist.insert(new Cutsomer(100, "SUMIT KUMAR", 1000.00));
//		dlist.insert(new Cutsomer(101, "AUMIT KUMAR", 10000.00));
//		dlist.printList();
		
		// STACK Implementation
		
//		StackImpl stack=new StackImpl();
//		for (int i=1;i<5;i++)
//		{
//			stack.push(10*i);
//		}
//		stack.printStack();
//		stack.pop();
//		stack.printStack();
		
		// QUEUE Implememtation
		
//		QueueImpl q=new QueueImpl();
//		for(int i=1;i<=5;i++)
//		{
//			q.enqueue(10*i);
//			
//		}
//		q.enqueue(10);
//		q.printQueue();
//		q.dequeue();
//		System.out.println("after deque");
//		q.printQueue();
		
		// Circular Queue
//		CircularQueueImpl q=new CircularQueueImpl();
//		for(int i=1;i<=5;i++)
//			{
//				q.enqueu(10*i);
//				
//			}
//		q.showCircularQueue();
//		q.enqueu(10*10); checking weather there is notification when we try to add value in the position
//	    where value is already present.
//		q.dequue();
//		q.showCircularQueue();
//		q.enqueu(10*10);
//		q.showCircularQueue();
//		
//		q.dequue();
//		q.showCircularQueue();
//		q.enqueu(20*20);
//		q.showCircularQueue();
		
		// PalindromeUsingStack
		
//		PalindromeUsingStack obj=new PalindromeUsingStack();
//		String pal="aba";
//		for(int i=0;i<pal.length();i++)
//		{
//			obj.push(pal.charAt(i));
//		}
//		System.out.println(obj.checkPalindrome(pal));
		
		// SimpleHashTableImpl
		
//		SimpleHashTableImpl obj=new SimpleHashTableImpl();
//		Employee emp=new Employee(1,"SUmit",10000.0);
//		Employee emp1=new Employee(1,"Amit",10000.0);
//		Employee emp2=new Employee(1,"Rahul",10000.0);
//		obj.put(obj.hasCode(emp.getEname()), emp);
//		obj.put(obj.hasCode(emp1.getEname()), emp1);
//		obj.put(obj.hasCode(emp2.getEname()), emp2);
//		
//		obj.printHashTable();
		
		// BinarySearch 
		
//		BinarySearch obj=new BinarySearch();
//		int arr[]= {10,30,40,50,90,160,200,250,260,300};
//		System.out.println(obj.search(arr, 250));
		
		// BST
		
		BinarySearchTree bst=new BinarySearchTree();
		for (int i=0;i<5;i++)
		{
			bst.insert(10*i);
		}
		
		
	}
}
