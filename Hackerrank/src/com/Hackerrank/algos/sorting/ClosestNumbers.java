package com.Hackerrank.algos.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ClosestNumbers {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
       // System.out.println(Arrays.toString(a));
        ArrayList<Integer> ar=null;
        for(int i=0;i<n-1;i++){
            int value=Math.abs(a[i+1]-a[i]);
            if(value<min){
                ar=new ArrayList<Integer>();
                ar.add(a[i]);
                ar.add(a[i+1]);
                min=value;
            }else if(value==min){
                ar.add(a[i]);
                ar.add(a[i+1]);
            }
        }
        for(Integer i:ar){
            System.out.print(i+" ");
        }
    }
}