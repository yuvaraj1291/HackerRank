package com.Hackerrank.algos.warmup;

import java.util.Scanner;

public class SimpleArraySum {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int[] ar=new int[a];
		int sum=0;
		for(int i=0;i<a;i++){
			ar[i]=sc.nextInt();
			sum=sum +ar[i];
		}
		System.out.println(sum);
	}
}