package com.Hackerrank.algos.seaching;

import java.util.Scanner;


public class ConnectedCells {
        
    static int m,n;
    //static int[][] a=new int[11][11];
    private static int findMax(int i,int j,int[][] a){
        if(i<0 || j<0 || i>=m || j >= n || a[i][j]==0 || a[i][j]==-1){
            return 0;
        }
        a[i][j]=-1;
        return 1 + findMax(i-1,j-1,a) + findMax(i-1,j,a) + findMax(i-1,j+1,a) + findMax(i,j-1,a) + findMax(i,j+1,a) + findMax(i+1,j-1,a) + findMax(i+1,j,a) + findMax(i+1,j+1,a);
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
         m=sc.nextInt();
         n=sc.nextInt();
         int[][] a=new int[11][11];
          for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();   
            }
        }
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]==1){
                    max=Math.max(max,findMax(i,j,a));
                }
            }
        }
        System.out.println(max);
    }
}