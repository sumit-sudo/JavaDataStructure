package com.java.data.structure;

import java.util.List;

public class ArrayList {

	public void arrayListOperation()
	{
		List<Employee> list=new java.util.ArrayList<>();
		list.add(new Employee(1,"SUmit Kumar",10000.0));
		list.add(new Employee(2,"XUmit Kumar",20000.0));
		list.add(new Employee(3,"YUmit Kumar",30000.0));
		list.add(new Employee(4,"ZUmit Kumar",40000.0));
		// Checking Size of array having type as Employee class
		System.out.println(list.size());//4 as there are 4 object of Employee class
		//Accessing List, complexcity - O(1) and this is the main advantage of array list over linked list
		System.out.println(list.get(2));
		// Adding element in the middle of list, this process is very slow as after insertion a lot of shifting
		// of data take place, that is why we use Linked for insertion and deletion
		list.add(2, new Employee(3,"YUmit Kumar",30000.0));
		list.remove(1);
		System.out.println(list);
		
		
	}
	
}
