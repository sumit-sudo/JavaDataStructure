package com.java.data.structure;


public class BinarySearchTree {

	BinaryNode root;
	public void insert(int data)
	{
		
		BinaryNode newnode=new BinaryNode();
		newnode.setData(data);
		newnode.setLeft(null);
		newnode.setRight(null);
		if(root==null)
		{
			root=newnode;
		}
		else
		{
			BinaryNode  prev=null;
			BinaryNode temp=root;
			while(temp!=null)
			{
				prev=temp;
				if(temp.getData()>data)
				{
					temp=temp.getLeft();
				/*
				 * with the help of temp.getLeft() or temp.getRight(), we are traversing till last node of the tree
				 * as last node of the tree should either temp.getLeft() null or temp.getRight() null, or 
				 * bother are null
				 */
				}
				else
				{
					temp=temp.getRight();
				}
			}
			if(prev.getData()>data)
				prev.setLeft(newnode);
			else
				prev.setRight(newnode);
			
			
		}
		
		inOrderTraverse(root);
	}
	public void inOrderTraverse(BinaryNode node)
	{
		//In order traverse will always produce a sorted array, ascending order
		//
		if(node==null)
			return;
		inOrderTraverse(node.getLeft());
		System.out.print(node.getData()+ ",");
		inOrderTraverse(node.getRight());
		
	}
	
}
