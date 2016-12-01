package com.Hackerrank.algos.warmup;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		float p=0,ne=0,z=0;
		int t=0;
		for(int i=0;i<n;i++){
			t=sc.nextInt();
			if(t>0){
				p++;
			}else if(t<0){
				ne++;
			}else{
				z++;  
			}
		}
		// System.out.println(p+" "+ne+" "+z);
		float pfrac=0,nfrac=0,zfrac=0;
		pfrac=p/n;
		nfrac=ne/n;
		zfrac=z/n;
		System.out.println(String.format("%.6f",pfrac));
		System.out.println(String.format("%6f",nfrac));
		System.out.println(String.format("%6f",zfrac));
	}
}