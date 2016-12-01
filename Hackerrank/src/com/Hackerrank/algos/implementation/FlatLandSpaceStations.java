package com.Hackerrank.algos.implementation;

import java.util.Scanner;

public class FlatLandSpaceStations {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int st=sc.nextInt();
        int[] s=new int[st];
        for(int i=0;i<st;i++){
            s[i]=sc.nextInt();
        }
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int min=Integer.MAX_VALUE;
            for(int j:s){
                int d=Math.abs(i-j);
                if(d<min){
                    min=d;
                }
            }
            max=Math.max(max,min);
        }
        System.out.println(max);
    }
}