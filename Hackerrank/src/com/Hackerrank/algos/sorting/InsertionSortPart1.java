package com.Hackerrank.algos.sorting;

import java.util.Scanner;

public class InsertionSortPart1 {
    
    

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function  
        
        int key=ar[ar.length-1];
        int j=ar.length-2;
            while(j>=0 && ar[j] > key){
            ar[j+1]=ar[j];
            j--;
                printArray(ar);
        }
            ar[j+1]=key;
            printArray(ar);
    }
    
    
/* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
 