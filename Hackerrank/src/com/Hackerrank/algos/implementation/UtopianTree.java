package com.Hackerrank.algos.implementation;

import java.util.Scanner;

public class UtopianTree {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
			int n=sc.nextInt();
			int h=1;
			for(int j=0;j<n;j++){
				if(j%2==0){
					h=h*2;
				}else{
					h+=1;
				}
			}
			System.out.println(h);
		}
	}
}