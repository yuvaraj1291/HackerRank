package com.Hackerrank.algos.graphtheory;

import java.io.*;
import java.util.*;

public class BreadthFirstSearch {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int verCount,edCount;
        int ver,ed,start;
        for(int i=0;i<t;i++){
            verCount=sc.nextInt();
            edCount=sc.nextInt();
            @SuppressWarnings("unchecked")
			List<Integer>[] edgeList=new LinkedList[verCount];
            for(int j=0;j<edCount;j++){
                ver=sc.nextInt()-1;
                ed=sc.nextInt()-1;
                if(edgeList[ver]==null){
                    edgeList[ver]=new LinkedList<Integer>();
                    edgeList[ver].add(ed);
                }else{
                    edgeList[ver].add(ed);
                }
                
                  if(edgeList[ed]==null){
                    edgeList[ed]=new LinkedList<Integer>();
                   edgeList[ed].add(ver);
                }else{
                   edgeList[ed].add(ver);
                  }
            }
            start=sc.nextInt()-1;
            bFS(edgeList,start,verCount);
            System.out.println();
        }
    }
    private static void bFS(List<Integer>[] edgeList,int start,int verCount){
        
        int[] d=new int[verCount];
        for(int i=0;i<verCount;i++){
            d[i]=-1;
        }
        d[start]=0;
        Queue<Integer> queue=new LinkedList<Integer>();
        queue.add(start);
        int current;
        while(!queue.isEmpty()){
                current=queue.poll();
                for(int next:edgeList[current]){
                   if(d[next]==-1){
                       d[next]=d[current]+6;
                       queue.add(next);
                   }                  
                }
        }
        for(int i=0;i<verCount;i++){
            if(i!=start){
                System.out.print(d[i]+" ");
            }
            
        }
        
    } 
}