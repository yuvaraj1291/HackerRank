package com.Hackerrank.ds.stack;

import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        String output="";
        Stack<StackNode> stack=new Stack<StackNode>();
        StackNode stackNode=null;
        for(int i=0;i<q;i++){
            int k=sc.nextInt();
            //insert
            if(k==1){
            String s=sc.next();
            output=output+s;   
            stackNode=new StackNode(s,true);
            stack.push(stackNode);    
            }else if(k==2){//delete
             int d=sc.nextInt();
             int size=output.length();   
             String deletedText=output.substring(size-d,size);   
             output=output.substring(0,size-d);
             stackNode=new StackNode(deletedText,false);
             stack.push(stackNode); 
            }else if(k==3){//print
             int p=sc.nextInt();   
             // System.out.println("Printing entire string"+output);
             System.out.println(output.charAt(p-1));
            }else {//undo
             if(!stack.isEmpty()){
                stackNode=stack.pop(); 
                 if(stackNode.insertFlag){
                     output=output.substring(0,output.length()-stackNode.str.length());
                 }else{
                     output=output+stackNode.str;
                 }
             }   
            }
        }
    }
    private static class StackNode{
        String str;
        boolean insertFlag;
        StackNode(String str,boolean insertFlag){
            this.str=str;
            this.insertFlag=insertFlag;
        }
    }
}