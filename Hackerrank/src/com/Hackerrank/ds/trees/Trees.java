package com.Hackerrank.ds.trees;

public class Trees {

	class Node {
		int data;
		Node left;
		Node right;
	}



	void preOrder(Node root) {

		System.out.print(root.data+" ");
		if(root.left != null){
			preOrder(root.left);
		}
		if(root.right!=null){
			preOrder(root.right);
		}
	}
	void postOrder(Node root) {
		if(root==null){
			return;
		}    
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
	void inOrder(Node root) {

		if(root==null){
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);

	}


}
