package com.Hackerrank.algos.implementation;

import java.util.HashMap;
import java.util.Scanner;

public class SockMerchant {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        int count=0;
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
            int val;
            if(hm.containsKey(c[c_i])){
                val=hm.get(c[c_i]);
                val++;
                if(val%2==0){
                    count++;
                }
                hm.put(c[c_i],val);
            }else{
                hm.put(c[c_i],1);
            }
        }
      System.out.println(count);
    }
}
