package com.Hackerrank.algos.dynamicprogramming;

import java.util.Scanner;

public class LongestCommonSubsequence {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[] a=new int[m];
        int[] b=new int[n];
        for(int i=0;i<m;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        int[][] r=new int[m+1][n+1];
        
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(a[i-1]==b[j-1]){
                    r[i][j]=r[i-1][j-1]+1;
                }else{
                    r[i][j]=Math.max(r[i][j-1],r[i-1][j]);
                }
            }
        }
        //checking
       /* for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                System.out.print(r[i][j]+"  ");
            }
            System.out.println();
        }*/
        
        int[] out=new int[r[m][n]];
        int size=r[m][n]-1;
        int i=m,j=n;
        while(size>=0){
            if(r[i][j]==r[i][j-1]){
                j=j-1;
            }else if(r[i][j]==r[i-1][j]){
                i=i-1;
            }else{
                out[size]=b[j-1];
                i=i-1;
                j=j-1;
                size--;
            }
        }
        for(int val:out){
            System.out.print(val+" ");
        }
        
    }
}