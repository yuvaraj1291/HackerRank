package com.Hackerrank.ds.stack;

import java.util.Scanner;
import java.util.Stack;

public class MaximumElementStack {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Stack<Node> stack=new Stack<Node>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int q=sc.nextInt();
            if(q==1){
                int value = sc.nextInt();
                max=Math.max(value,max);
                stack.push(new Node(value,max));
            }else if(q==2){
                Node temp=stack.pop();
                if(stack.isEmpty()){
                    max=Integer.MIN_VALUE;
                }else if(temp.curMax==max){
                    max=stack.peek().curMax;
                }
            }else if(q==3){            
                System.out.println(stack.peek().curMax);
            }
        }
    }
    
     private static class Node{
        int value;
        int curMax;
        Node(int value,int curMax){
            this.value=value;
            this.curMax=curMax;
        }
    }
}