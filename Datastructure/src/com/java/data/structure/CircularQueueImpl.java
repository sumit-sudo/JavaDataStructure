package com.java.data.structure;

public class CircularQueueImpl {

	int queue[]=new int[5];
	int front=0;
	int rear=0;
	int size=0;
	
	public void enqueu(int data)
	{
		
		if(front==rear && size!=0)
		{
			System.out.println("Circular Size is full");
		}
		else
		{
			queue[rear]=data;
			rear=(rear+1)%5;
			size++;
			
		}
		//System.out.println(size);
	}
	public void dequue()
	{
		if(size==0)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			int deletedItem=queue[front];
			System.out.println("Deleted Item is"+ deletedItem);
			front=(front+1)%5;
			size--;
		}
	}
	public void showCircularQueue()
	{
		int temp=front;
		System.out.println("Size"+size);
		for(int i=0;i<size;i++)
		{
			
			System.out.print(queue[temp]+" ");
			temp=(temp+1)%5;
		}
		
	}
	
}
