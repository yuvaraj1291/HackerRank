package com.Hackerrank.ds.array;

import java.util.Scanner;

public class LeftRotation {

    private static Scanner sc;

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        sc = new Scanner(System.in);
        int n=sc.nextInt();
        int rot=sc.nextInt();
 
        rot=rot%n;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }        
        
        for(int i=rot;i<n;i++){
            System.out.print(a[i]+" ");
        }
        for(int i=0;i<rot;i++){
            System.out.print(a[i]+" ");
        }
    }
}