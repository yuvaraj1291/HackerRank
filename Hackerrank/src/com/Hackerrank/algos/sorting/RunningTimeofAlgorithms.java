package com.Hackerrank.algos.sorting;

import java.util.Scanner;

public class RunningTimeofAlgorithms {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n]; 
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int key,i;
        int count=0;
        for(int j=1;j<n;j++){
            key=a[j];
            i=j-1;
            while(i>=0 && a[i]>key){
                a[i+1]=a[i];
                i--;
                count++;
            }
            a[++i]=key;
        }
        System.out.println(count);
    }
}