package com.Hackerrank.ds.trees;

import java.util.LinkedList;
import java.util.Queue;

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

	static int getHeight(Node root) {
		// Write your code here.
		if(root==null)
			return -1;
		int leftTreeHeight=getHeight(root.left);
		int rightTreeHeight=getHeight(root.right);

		return Math.max(leftTreeHeight,rightTreeHeight)+1;
	}
	void top_view(Node root)
	{
		printLeftTopView(root.left);
		System.out.print(root.data+" ");
		printRightTopView(root.right);
	}

	void printLeftTopView(Node node){
		if(node==null){
			return;
		}
		printLeftTopView(node.left);
		System.out.print(node.data+" ");
	}
	void printRightTopView(Node node){
		if(node==null){
			return;
		}
		System.out.print(node.data+" ");
		printRightTopView(node.right);
	}

	void LevelOrder(Node root) {

		Queue<Node> queue=new LinkedList<Node>();
		if(root!=null){
			queue.add(root);
		}
		Node peekNode;
		while(!queue.isEmpty()){
			peekNode=queue.peek();
			System.out.println(peekNode.data);
			if(peekNode.left!=null){
				queue.add(peekNode.left);
			}
			if(peekNode.right!=null){
				queue.add(peekNode.right);
			}
			queue.poll();
		}
	}
		static Node lca(Node root,int v1,int v2)
		{   
			if(root.data > v1 && root.data > v2){
				root=lca(root.left,v1,v2);
			}else if(root.data < v1 && root.data < v2){
				root=lca(root.right,v1,v2);
			}
			return root;
		}
		 Node Insert(Node root,int value)
	    {
	        Node temp=root;
	        if(temp==null){
	            temp=new Node();
	            temp.data=value;
	            return temp;
	        }
	        
	            if(temp.data < value){
	                temp.right=Insert(temp.right, value);
	            }else{
	                temp.left=Insert(temp.left, value);
	           }
	             //System.out.println(temp.data);
	       
	        
	        return root;
	    }
		 //Huffman Coding problem in Hackerrank
		 void decode(String S ,Node root)
		    {
		        Node next=root;
		        for(int i=0;i<S.length();i++){
		             next= S.charAt(i) == '1' ? next.right : next.left;
		             if(next.left==null && next.right==null){
		                 System.out.print(next.data);
		                 next=root;
		             }            
		        }
		    }
		
	}