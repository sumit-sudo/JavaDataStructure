package com.java.data.structure;

public class BinaryNode {

	int data;
	BinaryNode left;
	BinaryNode right;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public BinaryNode getLeft() {
		return left;
	}
	public void setLeft(BinaryNode left) {
		this.left = left;
	}
	public BinaryNode getRight() {
		return right;
	}
	public void setRight(BinaryNode right) {
		this.right = right;
	}
	@Override
	public String toString() {
		return "BinaryNode [data=" + data + ", left=" + left + ", right=" + right + "]";
	}
	
	
}
