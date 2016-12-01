package com.Hackerrank.algos.sorting;

import java.util.Scanner;

public class InsertionSortPart2 {

	public static void insertionSortPart2(int[] ar)
	{       
		// Fill up the code for the required logic here
		// Manipulate the array as required
		// The code for Input/Output is already provided
		int j,key;
		for(int i=1;i<ar.length;i++){
			j=i-1;
			key=ar[i];
			while(j>=0 && ar[j] > key){
				ar[j+1]=ar[j];
				j--;    
			}
			ar[j+1]=key;
			printArray(ar);
		}

	}  

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for(int i=0;i<s;i++){
			ar[i]=in.nextInt(); 
		}
		insertionSortPart2(ar);    

	}    
	private static void printArray(int[] ar) {
		for(int n: ar){
			System.out.print(n+" ");
		}
		System.out.println("");
	}
}
