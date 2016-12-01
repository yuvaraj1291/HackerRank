package com.Hackerrank.algos.warmup;

import java.io.*;
import java.util.*;

public class DiagonalDifference {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] ar=new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				ar[i][j]=sc.nextInt();
			}
		}
		int d1=0,d2=0;
		for(int i=0,j=n-1;i<n;i++,j--){
			d1=d1+ar[i][i];
			d2=d2+ar[i][j];
		}
		int diff=Math.abs(d1-d2);
		System.out.println(diff);
	}
}