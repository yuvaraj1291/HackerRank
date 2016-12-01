package com.Hackerrank.algos.implementation;

import java.util.Scanner;

public class JumpingOnTheClouds {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int c[] = new int[n];
		for(int c_i=0; c_i < n; c_i++){
			c[c_i] = in.nextInt();
		}
		int energy=100;
		for(int i=k;i<n;i=i+k){
			if(c[i]==1){
				energy=energy-1-2;
			}else{
				energy-=1;
			}
		}
		if(c[0]==1){
			System.out.println(energy-1-2);
		}else{
			System.out.println(energy-1);
		}
	}
}
