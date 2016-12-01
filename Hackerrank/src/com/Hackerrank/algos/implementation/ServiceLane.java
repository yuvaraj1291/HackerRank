package com.Hackerrank.algos.implementation;

import java.util.Scanner;

public class ServiceLane {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int[] w=new int[n];
        for(int i=0;i<n;i++){
            w[i]=sc.nextInt();
        }
        int entry,exit;
        for(int i=0;i<t;i++){
            entry=sc.nextInt();
            exit=sc.nextInt();
            int min=3;
            for(int j=entry;j<=exit;j++){
                if(w[j]<min){
                    min=w[j];
                    if(min==1){
                        break;
                    }
                }
            }
            System.out.println(min);
        }
    }
}