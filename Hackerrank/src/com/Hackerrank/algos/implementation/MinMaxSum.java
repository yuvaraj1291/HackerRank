package com.Hackerrank.algos.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=5;
        long[] a=new long[n];
        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;
        long sum=0;
        for(int i=0;i<n;i++){
           a[i]= in.nextLong();
            if(a[i]<min){
                min=a[i];
            }
            if(a[i]>max){
                max=a[i];
            }
            sum+=a[i];
        }
        System.out.print(sum-max+" "+(sum-min));
        
        
        
    }
}
