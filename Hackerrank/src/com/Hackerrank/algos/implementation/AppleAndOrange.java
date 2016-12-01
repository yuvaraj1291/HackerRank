package com.Hackerrank.algos.implementation;


import java.util.Scanner;

public class AppleAndOrange {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int t = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int m = in.nextInt();
		int n = in.nextInt();
		int[] apple = new int[m];
		int appleCount=0,orangeCount=0;
		for(int apple_i=0; apple_i < m; apple_i++){
			apple[apple_i] = in.nextInt();
			if(apple[apple_i]>0 && apple[apple_i]+a>=s && apple[apple_i]+a<=t){
				appleCount++;
			}
		}
		int[] orange = new int[n];
		for(int orange_i=0; orange_i < n; orange_i++){
			orange[orange_i] = in.nextInt();
			if(orange[orange_i]<0 && orange[orange_i]+b>=s && orange[orange_i]+b<=t){
				orangeCount++;
			}
		}
		System.out.println(appleCount);
		System.out.println(orangeCount);
	}
}
