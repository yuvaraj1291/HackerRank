package com.Hackerrank.algos.sorting;

import java.util.Scanner;

public class Quicksort1Partition {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();    
        }
        int pivot=a[0];
        int i=0;
        int temp;
        for(int j=1;j<n;j++){
            if(a[j]<pivot){
                i++;
                temp=a[j];
                a[j]=a[i];
                a[i]=temp;
            }
        }
        temp=a[i];
        a[i]=a[0];
        a[0]=temp;
        for(int val:a){
         System.out.print(val+" ");   
        }
        
    }
}