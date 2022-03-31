package com.java.data.structure;

public class QueueImpl {
	// FIFO
	int queue[]=new int[20];
	int front=0;
	int rear=0;
	int size=0;
	
	public void enqueue(int data)
	{
			queue[rear]=data;
			rear++;
			size++;	
	}
	
	public void printQueue()
	{
		for(int i=front;i<rear-1;i++)//rear will point next node where insertion will take place
		{
			System.out.print(" "+queue[i]);
		}
		System.out.println("\nFRONT"+front);
		System.out.println("REAR"+rear);
	}
	public void dequeue()
	{
		int deleteitem=queue[front];
		System.out.println("Successfully deleted"+ deleteitem);
		size--;
		front++;
		
	}
	
}
