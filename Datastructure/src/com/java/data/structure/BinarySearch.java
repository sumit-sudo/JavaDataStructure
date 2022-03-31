package com.java.data.structure;

public class BinarySearch {

	public boolean search(int arr[], int key)
	{
		int start=0,end=arr.length;
		boolean flag=false;
		while(start<end)
		{
			int mid=(start+end)/2;
			if(mid==key)
			{
				flag=true;
			}
			else
			{
				if(key<mid)
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
