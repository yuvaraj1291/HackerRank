package com.Hackerrank.algos.implementation;

import java.io.*;
import java.util.*;

public class BeautifulDaysAtMovies {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        int k=sc.nextInt();
        int diff=0;
        int rev=0;
        int temp=0;
        int last_digit=0,count=0;
        for(int i=start;i<=end;i++){
            temp=i;
            rev=0;
            while(temp>0){
                last_digit=temp%10;
                rev=rev*10+last_digit;
                temp=temp/10;
            }
            diff=Math.abs(i-rev);
            if(diff%k==0){
               count++; 
            }
        }
        System.out.println(count);
    }
}