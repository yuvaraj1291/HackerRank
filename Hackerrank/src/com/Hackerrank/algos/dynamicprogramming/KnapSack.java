package com.Hackerrank.algos.dynamicprogramming;

import java.util.Scanner;

public class KnapSack {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
			int n=sc.nextInt();
			int w=sc.nextInt();
			int[] elements=new int[n];
			for(int j=0;j<n;j++){
				elements[j]=sc.nextInt();
			}
			int[] mem=new int[w+1];

			for(int j=1;j<=w;j++){
				for(int k=0;k<n;k++){
					if(elements[k]<=j){
						mem[j]=Math.max(mem[j],elements[k]+mem[j-elements[k]]);
					}
				}
			}

			System.out.println(mem[w]);

		}

	}
}