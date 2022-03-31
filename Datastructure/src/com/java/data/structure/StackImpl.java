package com.java.data.structure;

public class StackImpl {

	int arr[]=new int[100];
	int top=0;
	public void push(int data)
	{
		arr[top]=data;
		top++;
		
	}
	public void pop()
	{
		int data=arr[top-1];
		System.out.println("\nThe poped element is  "+data);
		arr[top]=0;
		top--;
	}
	
	public void printStack()
	{
		for (int i=0;i<top;i++)
		{
			System.out.print(" "+arr[i]);
		}
	}
}
