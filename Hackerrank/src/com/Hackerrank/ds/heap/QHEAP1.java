package com.Hackerrank.ds.heap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class QHEAP1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        for(int i=0;i<n;i++){
        int q=sc.nextInt();
        if(q==1){
        int value=sc.nextInt();
        pq.add(value);            
        }else if(q==2){
        int value=sc.nextInt();
        pq.remove(value);    
        }else{
            System.out.println(pq.peek());
        }
        }
       
    }
}