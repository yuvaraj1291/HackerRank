package com.Hackerrank.ds.heap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class JesseandCookies {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int min=sc.nextInt();
        int count=0;
        PriorityQueue<Integer> pr=new PriorityQueue<Integer>();
        for(int i=0;i<n;i++){
            pr.add(sc.nextInt());
        }
        int a=0;
        int b=0;
        int newValue=0;
        boolean flag=true;
        while(!pr.isEmpty()){
           if(pr.peek()>=min){
               break;
           }else{
               a=pr.peek();
               pr.remove(a);
               if(!pr.isEmpty()){
               b=pr.peek();
               pr.remove(b);
               newValue=a+(2*b); 
               pr.add(newValue);
               count++;
               }else{
                   flag=false;
                   break;
               }
           }
        }
        if(flag){
            System.out.println(count);
        }else{
            System.out.println("-1");
        }
        
    }
}