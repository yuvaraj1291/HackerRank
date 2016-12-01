package com.Hackerrank.algos.implementation;

import java.util.Scanner;

public class ManasaAndStones {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();

            int min=Math.min(a,b);
            int max=Math.max(a,b);
            int start = min*(n-1);
            int end =max*(n-1);
          
            if(start==end){
                System.out.print(start);
            }else{
                int diff=max-min;
                while(start<end){
                    
                    System.out.print(start+" ");
                    start+=diff;
                }
                System.out.print(end);
            }
            System.out.println();   
            
        }
        
    }
   
}