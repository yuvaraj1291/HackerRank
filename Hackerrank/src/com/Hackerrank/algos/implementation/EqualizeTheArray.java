package com.Hackerrank.algos.implementation;

import java.util.HashMap;
import java.util.Scanner;

public class EqualizeTheArray {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=0;
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        int key,value;
        for(int i=0;i<n;i++){
            key=sc.nextInt();
            if(hm.containsKey(key)){
                value=hm.get(key);
                value++;
                hm.put(key,value);
            }else{
                value=1;
                hm.put(key,value);
            }
            if(value>max){
                    max=value;
            }
        }
        System.out.println(n-max);
    }
}
