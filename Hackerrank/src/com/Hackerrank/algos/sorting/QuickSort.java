package com.Hackerrank.algos.sorting;

import java.io.*;
import java.util.*;

public class QuickSort {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }  
        quickSort(a,0,a.length-1);
        //System.out.println(Arrays.toString(a));
    }
    
    private static void quickSort(int[] a,int p,int r){
        if(p<r){
                int q=partion(a,p,r);
                quickSort(a,p,q-1);
                quickSort(a,q+1,r);
                printArray(a,p,r);
        }
    }
    private static int partion(int[] a,int p,int r){
        int pivot=a[p];
        int i=p,temp;
        for(int j=p+1;j<=r;j++){
            if(a[j]<pivot){
              i++;
              temp=a[j];
              a[j]=a[i];
              a[i]=temp;  
            }
        }
        //swapping pivot
        temp=a[p];
        a[p]=a[i];
        a[i]=temp;
        return i;
    }
    private static void printArray(int[] a,int start,int end){
        for(int i=start;i<=end;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    
}