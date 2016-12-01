package com.Hackerrank.algos.implementation;

import java.util.Scanner;

public class SherlockAndSquares {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int a,b;
        for(int i=0;i<t;i++){
            a=sc.nextInt();
            b=sc.nextInt();
            int start=(int)Math.sqrt(a);
            while(start*start<a){
                start+=1;
            }
            int end=(int)Math.sqrt(b);
            if(start<=end){
                System.out.println(end-start+1);
            }else{
                System.out.println("0");
            }            
        }
      
    }
}