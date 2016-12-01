package com.Hackerrank.algos.sorting;

import java.util.Scanner;

public class RunningTimeofQuicksort {
    static int quickSortCount=0;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n]; 	
        int[] b=new int[n]; 
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=a[i];
        }
        int key,i;
        int insSortCount=0;
        for(int j=1;j<n;j++){
            key=a[j];
            i=j-1;
            while(i>=0 && a[i]>key){
                a[i+1]=a[i];
                i--;
                insSortCount++;
            }
            a[++i]=key;
        }
        quickSort(b,0,n-1);
        System.out.println(insSortCount-quickSortCount);
    }
     private static void quickSort(int[] a,int p,int r){
        if(p<r){
                int q=quickSortCount(a,p,r);
                quickSort(a,p,q-1);
                quickSort(a,q+1,r);             
        }
    }
    private static int quickSortCount(int[] a,int p,int r){
        int pivot=a[r];
        int i=p-1,temp;
        for(int j=p;j<=r;j++){
            if(a[j]<pivot){
              i++;
              quickSortCount++;
              temp=a[j];
              a[j]=a[i];
              a[i]=temp;  
            }
        }
        //swapping pivot
        temp=a[r];
        a[r]=a[i+1];
        a[i+1]=temp;
        quickSortCount++;
        return i+1;
    }
}