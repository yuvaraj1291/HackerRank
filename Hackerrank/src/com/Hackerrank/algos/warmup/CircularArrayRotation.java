package com.Hackerrank.algos.warmup;

import java.util.Scanner;

public class CircularArrayRotation {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int q=sc.nextInt();
        r=r%n;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<q;i++){
            int m=sc.nextInt();
            int j=m-r;
            //System.out.println("j value"+j);
            if(m-r>=0){
                System.out.println(a[j]);
            }else{
                System.out.println(a[j+n]);
            }
            
        }
        
    }
}