package com.Hackerrank.algos.seaching;

import java.util.Scanner;

public class SherlockAndArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();       
        for(int i=0;i<t;i++){
            int totalRightSum=0;
            int leftSum=0;
            int n = sc.nextInt();
            int[] a=new int[n];
            for(int j=0;j<n;j++){
            a[j]=sc.nextInt();
            totalRightSum+=a[j];
            }
            boolean flag=false;
            for(int j=0;j<n;j++){
                totalRightSum-=a[j];
                if(leftSum==totalRightSum){
                    System.out.println("YES");
                    flag=true;
                    break;
                }   
                leftSum+=a[j];
            }
            if(!flag){
                System.out.println("NO");
            }
      }  
    }
}