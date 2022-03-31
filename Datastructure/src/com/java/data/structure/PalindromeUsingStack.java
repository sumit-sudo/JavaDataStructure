package com.java.data.structure;

public class PalindromeUsingStack {

	
	char arr[]=new char[10];
	int top=0;
	public void push(char c)
	{
		arr[top]=c;
		top++;
	}
	public char pop()
	{
		char c=arr[--top];
		return c;
		
	}
	public boolean checkPalindrome(String str)
	{
		StringBuilder newstr=new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			newstr.append(pop());
		}
		System.out.println("str "+str + str.length());
		System.out.println("newstr "+newstr+ newstr.length());
		if(str.equals(newstr.toString())) {
			return true;
		}
		else
		{
			return false;
		}
	}
}
