package com.Hackerrank.algos.sorting;
import java.io.*;
import java.util.*;

public class FindTheMedian {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int medpos=(n-1)/2;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        quickSort(a,0,n-1,medpos);
       
    }
     private static void quickSort(int[] a,int p,int r,int medpos){
        if(p<r){
                int q=partition(a,p,r);
                if(q==medpos){
                    System.out.println(a[q]);
                    return;
                }else if(q>medpos){
                    quickSort(a,p,q-1,medpos);
                }else{
                    quickSort(a,q+1,r,medpos); 
                }
                          
        }
    }
    
    private static int partition(int[] a,int p,int r){
        int pivot=a[r];
        int i=p-1,temp;
        for(int j=p;j<r;j++){
            if(a[j]<=pivot){
              i++;
              temp=a[j];
              a[j]=a[i];
              a[i]=temp;  
            }
        }
        //swapping pivot
        temp=a[r];
        a[r]=a[i+1];
        a[i+1]=temp;
        return (i+1);
    }
    
}