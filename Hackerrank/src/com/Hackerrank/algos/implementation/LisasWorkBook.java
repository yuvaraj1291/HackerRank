package com.Hackerrank.algos.implementation;

import java.util.Scanner;

public class LisasWorkBook {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc=new Scanner(System.in);
		int chap=sc.nextInt();
		int k=sc.nextInt();
		int[] prob=new int[chap];
		for(int i=0;i<chap;i++){
			prob[i]=sc.nextInt();
		}
		int spCount=0;
		int totalProb=0;
		int totalPages,lastPageProb;
		int pageNo=0;
		for(int i=0;i<chap;i++){
			totalProb=prob[i];
			totalPages=totalProb/k;
			lastPageProb=totalProb%k;
			int prevProb=1;
			int curProb=0;
			for(int j=1;j<=totalPages;j++){
				pageNo++;
				curProb=curProb+k;
				if(pageNo >= prevProb && pageNo<=curProb){
					spCount++;
				}
				prevProb=curProb+1;
			}
			if(lastPageProb!=0){
				pageNo++;
				curProb+=lastPageProb;
				if(pageNo >= prevProb && pageNo<=curProb){
					spCount++;
				}
			}
		}
		System.out.println(spCount);
	}
}