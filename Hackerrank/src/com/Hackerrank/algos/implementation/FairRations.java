package com.Hackerrank.algos.implementation;

import java.util.Scanner;

public class FairRations {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int B[] = new int[N];
        for(int B_i=0; B_i < N; B_i++){
            B[B_i] = in.nextInt();
        }
        int count=0;
        boolean flag=true;
        for(int i=0;i<N;i++){
            if(B[i]%2 != 0){
               if(i<N-1){
                    B[i]++;
                    B[i+1]++;
                    count+=2;
               }else{
                    flag=false;
                    break;
                }
            }
        }
        if(flag){
            System.out.println(count);
        }else{
            System.out.println("NO");
        }
    }
}
