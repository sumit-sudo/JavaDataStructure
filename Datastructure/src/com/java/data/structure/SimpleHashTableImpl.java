package com.java.data.structure;

public class SimpleHashTableImpl {

	// Creating a HashTable of size 16 and having type Employee
	Employee HashTable[]=new Employee[16];
	
	public int hasCode(String fname)
	{
		// We are deciding key i.e position based on length of employee  name
		return fname.length()%HashTable.length;
	}
	public void put(int key, Employee emp)
	{
		if(HashTable[key]!=null)
		{
			while(HashTable[key]!=null && key<HashTable.length)
			{
				key++;
			}
			// Linear probing
			HashTable[key]=emp;
			// Similarly we can implement probing for LinkedList as well
		}
		else
		{
			HashTable[hasCode(emp.getEname())]=emp;
		}
	}
	public void printHashTable()
	{
		for(int i=0;i<HashTable.length;i++)
		{
			System.out.println(HashTable[i]);
		}
	}
}
