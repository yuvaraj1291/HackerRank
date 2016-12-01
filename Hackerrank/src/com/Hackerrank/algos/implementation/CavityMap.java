package com.Hackerrank.algos.implementation;

import java.util.Scanner;

public class CavityMap {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[][] a=new char[n][n];
        
        for(int i=0;i<n;i++){
            String s=sc.next();
            a[i]=s.toCharArray();
        }
        
        for(int i=1;i<n-1;i++){
            for(int j=1;j<n-1;j++){
                if(a[i+1][j]!='X' && a[i-1][j]!='X' && a[i][j-1]!='X' && a[i][j+1]!='X'){
                 if(a[i][j]>a[i-1][j] && a[i][j]>a[i+1][j] && a[i][j]>a[i][j+1] && a[i][j]>a[i][j-1]){
                    a[i][j]='X';
                }   
                }
            }
        }
        for(int i=0;i<n;i++){
                System.out.print(new String(a[i]));
             System.out.println();
        }
       
    }
}