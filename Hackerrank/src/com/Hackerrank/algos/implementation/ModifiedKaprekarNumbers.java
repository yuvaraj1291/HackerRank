package com.Hackerrank.algos.implementation;

import java.util.Scanner;

public class ModifiedKaprekarNumbers {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		boolean flag=true;
		for(long i=a;i<=b;i++){
			long square=i*i;
			int size=String.valueOf(square).length();
			int lsize=size/2;
			int rsize=size-lsize;
			long left=(long)(square/(Math.pow(10,rsize)));
			long right=(long)(square%(Math.pow(10,rsize)));
			long sum=left+right;
			if(i==(int)sum){
				flag=false;
				System.out.print(i+" ");
			}
		}
		if(flag){
			System.out.println("INVALID RANGE"); 
		}
	}
}