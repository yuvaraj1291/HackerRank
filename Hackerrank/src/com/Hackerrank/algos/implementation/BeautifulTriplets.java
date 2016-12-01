package com.Hackerrank.algos.implementation;

import java.util.Scanner;

public class BeautifulTriplets {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		int count=0;
		int dif1=0,dif2=0;
		for(int i=1;i<n-1;i++){
			for(int j=i-1;j>=0;j--){
				dif1=a[i]-a[j];
				if(dif1==d){
					for(int k=i+1;k<n;k++){
						dif2=a[k]-a[i];
						if(dif2==d){
							count++;
						}
					} 
				}


			}
		}
		System.out.println(count);
	}
}

