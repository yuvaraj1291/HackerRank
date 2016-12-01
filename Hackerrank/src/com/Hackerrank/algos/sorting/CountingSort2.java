package com.Hackerrank.algos.sorting;

import java.util.Scanner;

public class CountingSort2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int[] count=new int[100];
        int n=sc.nextInt();
        int val;

        for(int i=0;i<n;i++){
            val=sc.nextInt();
            count[val] += 1;
        }
        
        for(int i=0;i<100;i++){
            while(count[i]!=0){
                System.out.print(i+" ");
                count[i]-=1;
            }
        }
    }
}