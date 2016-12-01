package com.Hackerrank.algos.warmup;

import java.util.Scanner;

public class StairCase {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int space=0;
		for(int i=1;i<=n;i++){
			space=n-i;
			for(int j=0;j<space;j++){
				System.out.print(" ");
			}
			for(int k=0;k<i;k++){
				System.out.print("#");
			}
			System.out.println();
		}

	}
}