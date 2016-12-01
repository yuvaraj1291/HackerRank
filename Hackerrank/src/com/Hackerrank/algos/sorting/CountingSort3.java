package com.Hackerrank.algos.sorting;

import java.util.Scanner;

public class CountingSort3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */  
        Scanner sc=new Scanner(System.in);
        int[] count=new int[100];
        int n=sc.nextInt();
        int val;

        for(int i=0;i<n;i++){
            val=sc.nextInt();
            sc.next();
            count[val] += 1;
        }
        System.out.print(count[0]+" ");
        for(int i=1;i<100;i++){
          count[i]+=count[i-1];
          System.out.print(count[i]+" ");
        }
        
    }
}