package com.Hackerrank.algos.seaching;

import java.util.Scanner;

public class IceCreamParlour {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
           int m=sc.nextInt();
           int n=sc.nextInt();
           int[] a=new int[n];
           for(int j=0;j<n;j++){
               a[j]=sc.nextInt();
           }
            int sum=0;
           outerloop:
           for(int j=0;j<n;j++){
               int k=j-1;   
               while(k>=0){
                    sum= a[k]+a[j];
                   if(sum==m){
                       System.out.println((k+1)+" "+(j+1));
                       break outerloop;
                   }
                   k--;
               }
           }
        }
    }
}