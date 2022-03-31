package com.java.data.structure;

public class BinarySearch {

	public boolean search(int arr[], int key)
	{
		int start=0,end=arr.length-1;
		boolean flag=false;
		while(start<=end)
		{
			int mid=(start+end)/2;
			System.out.println(mid);
			
			//System.out.println(mid +" data "+arr[mid]);
			if(arr[mid]==key)
			{
				flag=true;
				break;
			}
			else
			{
				if(key<arr[mid])
				{
					end=mid-1;
				}
				else
				{
					start=mid+1;
				}
			}
		}
		return flag;
	}
}
