package com.Hackerrank.algos.warmup;

import java.util.Scanner;

public class AVeryBigSum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        long sum=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        for(int i=0;i<n;i++){
            a=sc.nextInt();
            sum=sum+a;
        }
        System.out.println(sum);
    }
}