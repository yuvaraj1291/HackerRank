package com.Hackerrank.algos.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LuckBalance {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int val,priority;
        ArrayList<Integer> implist=new ArrayList<Integer>();
        ArrayList<Integer> unImplist=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            val=sc.nextInt();
            priority=sc.nextInt();
            if(priority==1){
                implist.add(val);
            }else{
                unImplist.add(val);
            }
        }
        int size=implist.size();
        int winCount=size-k;
        if(winCount>0){
            Collections.sort(implist);
        }
        int luckFactor=0;
        for(int i:unImplist){
            luckFactor+=i;
        }
        for(int i=winCount;i<size;i++){
            luckFactor+=implist.get(i);
        }
        for(int i=0;i<winCount;i++){
            luckFactor-=implist.get(i);
        }
        System.out.println(luckFactor);
    }
}