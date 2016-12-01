package com.Hackerrank.algos.implementation;

import java.util.HashMap;
import java.util.Scanner;

public class MinimumDistances {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        int min=Integer.MAX_VALUE;
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
            if(hm.containsKey(A[A_i])){
                int diff=Math.abs(hm.get(A[A_i])-A_i);
                min=Math.min(min,diff);
                hm.put(A[A_i],A_i);
            }else{
                 hm.put(A[A_i],A_i);
            }
            
        }
        if(min!=Integer.MAX_VALUE){
                System.out.println(min);
            }else{
                System.out.println("-1");
            }
    }
}
