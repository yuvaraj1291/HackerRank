package com.Hackerrank.ds.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SparseTrees {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Map<String,Integer> countMap=new HashMap<String,Integer>();
        String input=null;
        for(int i=0;i<n;i++){
            input=sc.next();
            if(countMap.containsKey(input)){
                countMap.put(input,countMap.get(input)+1);
            }else{
                countMap.put(input,1);
            }
        }
        int q=sc.nextInt();
        String query=null;
        for(int i=0;i<q;i++){
            query=sc.next();
            if(countMap.containsKey(query)){
                System.out.println(countMap.get(query));
            }else{
                System.out.println("0");
            }
        }
        sc.close();
        
    }
}