package com.Hackerrank.algos.sorting;

import java.util.Scanner;

public class InsertionSortAdvancedAnalysis {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		InsertionSortAdvancedAnalysis solution=new InsertionSortAdvancedAnalysis();
		for(int i=0;i<t;i++){
			int n=sc.nextInt();
			long[] a=new long[n];
			for(int j=0;j<n;j++){
				a[j]=sc.nextLong();
			}
			long count=solution.mergeSortShiftCount(a);
			System.out.println(count);
		}
	}
	public long mergeSortShiftCount(long[] a){
		int size=a.length;
		if(size==1){
			return 0;
		}
		int n1=size/2;
		int n2=size-n1;
		long[] arr1=new long[n1];
		long[] arr2=new long[n2];
		for(int i=0;i<n1;i++){
			arr1[i]=a[i];
		}
		for(int i=0;i<n2;i++){
			arr2[i]=a[i+n1];
		}
		long ans=mergeSortShiftCount(arr1)+mergeSortShiftCount(arr2);
		int i1=0;
		int i2=0;
		int k=0;
		while(i1<n1 && i2<n2){
			if(arr1[i1]<=arr2[i2]){
				a[k]=arr1[i1];
				i1++;
			}else{
				a[k]=arr2[i2];
				i2++;
				ans += n1 - i1;
			}
			k++;
		}
		while(i1<n1){
			a[k]=arr1[i1];
			i1++;
			k++;
		}
		while(i2<n2){
			a[k]=arr2[i2];
			i2++;
			k++;
		}
		return ans;
	}
}