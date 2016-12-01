package com.Hackerrank.algos.implementation;

import java.util.Scanner;

public class TaumAndBDay {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
            if(x>y){
                if(y+z<x){
                    x=y+z;
                }
            }else if(y>x){
                if(x+z<y){
                    y=x+z;
                }
            }
            
            long price = (x*b)+(y*w);
            System.out.println(price);
            
        }
    }
}
