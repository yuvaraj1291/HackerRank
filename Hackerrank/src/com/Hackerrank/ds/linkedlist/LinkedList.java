package com.Hackerrank.ds.linkedlist;

import java.util.HashSet;

public class LinkedList {


	class Node {
		int data;
		Node next;
		Node prev;
	}

	Node InsertLast(Node head,int data) {
		// This is a "method-only" submission. 
		// You only need to complete this method. 
		Node current=head;
		Node temp=new Node();
		temp.data=data;
		temp.next=null;
		if(head==null){
			head=temp;
			return temp;
		}
		while(current.next!=null){
			current=current.next;
		}

		current.next=temp;

		return head;

	}
	Node InsertFirst(Node head,int x) {

		Node temp=new Node();
		temp.data=x;
		temp.next=head;
		head=temp;
		return head;

	}

	void Print(Node head) {

		while(head != null){
			System.out.print(head.data+"->");
			head=head.next;
		}
		System.out.println("NULL");

	}
	Node InsertNth(Node head, int data, int position) {
		// This is a "method-only" submission. 
		// You only need to complete this method. 

		Node insertNode=new Node();
		insertNode.data=data;
		if(head==null){
			insertNode.next=null;
			return insertNode;
		}else if(position==0){
			insertNode.next=head;
			return insertNode;
		}
		Node output=head;
		for(int i=0;i<position-1;i++){
			head=head.next;
		}
		Node nextNode=head.next;
		head.next=insertNode;
		insertNode.next=nextNode;
		return output;

	}
	void ReversePrint(Node head) {
		// This is a "method-only" submission. 
		// You only need to complete this method.
		if(head==null){
			return;
		}
		ReversePrint(head.next);
		System.out.println(head.data);

	}
	int CompareLists(Node headA, Node headB) {
	    // This is a "method-only" submission. 
	    // You only need to complete this method 
	    if(headA==null && headB==null){
	        return 1;
	    }
	    int output=1;
	    while(headA != null || headB !=null){
	       if(headA!=null && headB!=null && headA.data==headB.data){
	           headA=headA.next;
	           headB=headB.next;
	       }else{
	         output=0;
	         break;
	       }
	    }
	    return output;
	    
	}
	Node MergeLists(Node headA, Node headB) {
	     // This is a "method-only" submission. 
	     // You only need to complete this method
	     Node temp=null;
	     Node current=null;
	     Node output=null;
	     while(headA != null && headB != null){
	         temp=new Node();
	         if(headA.data <= headB.data){
	            temp.data = headA.data; 
	             headA=headA.next;
	         }else{
	            temp.data=  headB.data;
	             headB=headB.next;
	         }
	        if(current==null){
	          current=temp;
	          output=current;
	        } else{
	        current.next=temp;
	        current=current.next; 
	        }
	         
	         
	     }
	     if(headA!=null){
	         if(current!=null){
	            current.next=headA;
	         }else{
	             output=headA;
	            }
	     }  
	     if(headB!=null){
	         if(current!=null){
	             current.next=headB; 
	         }else{
	             output=headB;
	        }
	        
	     }
	    return output;
	}
	Node Reverse(Node head) {
	    if(head==null || head.next==null){
	        return head;
	    }
	   
	    Node remaining=Reverse(head.next);
	    head.next.next=head;
	    head.next=null;
	    return remaining;
	}
	
	
	
	Node RemoveDuplicates(Node head) {
		  // This is a "method-only" submission. 
		  // You only need to complete this method. 
		    Node current=head;
		    while(head.next!=null){
		        if(head.data==head.next.data){
		            head.next=head.next.next;
		        }else{
		             head=head.next;
		        }
		    }

		    return current;
		}

	int GetNodeFromLast(Node head,int n) {
	     // This is a "method-only" submission. 
	     // You only need to complete this method. 
	    Node posNode=head;
	    int position=0;
	    while(head.next!=null){
	         head=head.next;           
	        if(position<n){
	            position++;
	        }else{
	            posNode=posNode.next;
	        }
	    }
	    return posNode.data;
	    

	}
	int FindMergeNode(Node headA, Node headB) {
	    // Complete this function
	    // Do not write the main method. 
	    
	    Node current;
	    int data=0;
	    outerloop:
	    while(headA!=null){
	        current=headB;
	        while(current!=null){
	            if(headA==current){
	                data=headA.data;
	                break outerloop;
	            }
	            current=current.next;
	        }
	        headA=headA.next;
	    }
	    return data;

	}
	Node SortedInsert(Node head,int data) {
	    
	    if(head==null){
	        head=new Node();
	        head.data=data;
	        head.next=null;
	    }else{
	     
	        Node nextNode=head;
	        Node prevNode=null;
	        while(nextNode != null){
	            if(data > nextNode.data){
	                prevNode=nextNode;
	                nextNode=nextNode.next;
	            }else{
	                break;
	            }
	        }
	        
	        Node insertNode=new Node();
	        insertNode.data=data;
	        insertNode.next=nextNode;
	        insertNode.prev=prevNode;
	        if(prevNode!=null){
	             prevNode.next=insertNode;
	        } 
	        if(nextNode!=null){
	          nextNode.prev=insertNode;  
	        }
	        
	    }
	    return head;
	  
	}
	Node ReverseSingleLLIteration(Node head) {
	    
	    Node current=head;
	    Node prevNode=null;
	    Node nextNode=null;
	    
	    while(current!=null){
	        nextNode=current.next;
	        current.next=prevNode;
	        prevNode=current;
	        current=nextNode;
	    }
	    return prevNode;

	}
	boolean hasCycle(Node head) {
	    
	    boolean cycle=false;
	    HashSet<Node> hs=new HashSet<Node>();
	    while(head != null){
	        if(hs.contains(head)){
	            cycle=true;
	            break;
	        }else{
	            hs.add(head);
	            head=head.next;
	        }
	    }
	    return cycle;
	}
	Node ReverseDLLIteration(Node head) {
	    
	    Node currentNode=head;
	    Node nextNode=null;
	    Node prevNode=null;
	    
	    while(currentNode!=null){
	        nextNode=currentNode.next;
	        
	        currentNode.next=prevNode;
	        currentNode.prev=nextNode;
	        
	        prevNode=currentNode;
	        currentNode=nextNode;
	        
	    }
	    return prevNode;
	}



}