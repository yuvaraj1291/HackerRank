package com.Hackerrank.algos.implementation;

import java.io.*;
import java.util.*;

public class ViralAdvertising {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int next=5,count=0,curr;
        for(int i=0;i<d;i++){
            curr=(int)Math.floor(next/2);
            count+=curr;
            next=curr*3;
        }
        System.out.println(count);
    }
}