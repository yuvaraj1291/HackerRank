package com.Hackerrank.algos.implementation;

import java.util.Scanner;

public class ACMICPCTeam {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//person
		int m=sc.nextInt();//topic 
		int maxChap=Integer.MIN_VALUE;
		int teams=0;
		char[][] ch=new char[n][m];
		for(int i=0;i<n;i++){
			ch[i]=sc.next().toCharArray();
		}
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				int count=0;
				for(int k=0;k<m;k++){
					if(ch[i][k]=='1' || ch[j][k]=='1'){
						count++;
					}
				} 
				if(count>maxChap){
					maxChap=count;
					teams=1;
				}else if(count==maxChap){
					teams++;
				}
			}

		}
		System.out.println(maxChap);
		System.out.println(teams);
	}
}