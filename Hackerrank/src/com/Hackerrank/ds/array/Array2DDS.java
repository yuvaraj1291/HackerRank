package com.Hackerrank.ds.array;

import java.util.*;

public class Array2DDS {

    private static Scanner sc;

	public static void main(String[] args) {
        sc = new Scanner(System.in);
        int[][] a=new int[6][6];
        int max=0,sum=0;
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                sum=a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
                if(i==0 && j==0){
                    max=sum;
                }else if(sum > max){
                    max=sum;
                }
            }
        }
        System.out.println(max);
    }
}