package com.Hackerrank.algos.dynamicprogramming;

import java.util.Scanner;

public class CoinChangeProblem {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int total=sc.nextInt();
        int nc=sc.nextInt();
        int[] coins=new int[nc+1];
        for(int i=1;i<=nc;i++){
            coins[i]=sc.nextInt();
        }
        long[][] out=new long[nc+1][total+1];
        for(int i=1;i<=nc;i++){
            for(int j=1;j<=total;j++){
                if(coins[i]<j){
                    //System.out.println(" i "+i+"  j "+j+" "+coins[i]);
                    out[i][j]=out[i][j-coins[i]]+out[i-1][j];
                }else if(coins[i]==j){
                    out[i][j]=1+out[i-1][j];
                }else{
                    out[i][j]=out[i-1][j];
                }
            }
        }
    /*  for(int i=0;i<=nc;i++){
            for(int j=0;j<=total;j++){
                 System.out.print(out[i][j]);
            }
          System.out.println();
        }*/
        System.out.println(out[nc][total]);
    }
}