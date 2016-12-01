package com.Hackerrank.algos.graphtheory;

import java.io.*;
import java.util.*;

import com.Hackerrank.algos.graphtheory.TestFileRead.Edge;

public class KruskalMST {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
       /* int nv=sc.nextInt();
        int ne=sc.nextInt();*/
        //ArrayList<Edge> ar=new ArrayList<Edge>();
        BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Yuvaraj\\git\\HackerRank\\Hackerrank\\src\\com\\Hackerrank\\algos\\graphtheory\\input.txt"));
    	String input=null;
    	ArrayList<Edge> ar=new ArrayList<Edge>();
    	br.readLine();
    	while((input=br.readLine())!=null){
    			String[] str=input.split(" ");
                ar.add(new Edge(Integer.valueOf(str[0]),Integer.valueOf(str[1]),Integer.valueOf(str[2])));
    	}
       /* for(int i=1;i<=ne;i++){
            ar.add(new Edge(sc.nextInt(),sc.nextInt(),sc.nextInt()));
        }*/
        
        Collections.sort(ar);
        
        ArrayList<HashSet<Integer>> setList=new ArrayList<HashSet<Integer>>(); 
        long sum=0;
       
         for(Edge e:ar){
            int start=e.start;
            int end=e.end;
            boolean setA=false;
            boolean setB=false;
            int setAIndex=0,setBIndex=0;
            boolean flag=true;
            for(int i=0;i<setList.size();i++){
                HashSet<Integer> set=setList.get(i);
                if(set.contains(start) && set.contains(end)){
                   // System.out.println("Skipping edge"+e.start+" "+e.end+" "+e.weight);
                    flag=false;
                    break;
                }else if(set.contains(start)){
                    setA=true;
                    setAIndex=i;
                }else if(set.contains(end)){
                    setB=true;
                    setBIndex=i;
                }
            }
            if(flag){
            	//System.out.println("Not skipped");
            sum+=e.weight;
            if(setA && setB){
               // System.out.println("Inside Merge"+setAIndex+" "+setBIndex);
                HashSet<Integer> hashSetA=setList.get(setAIndex);
                hashSetA.addAll(setList.get(setBIndex));
                //System.out.println("Aftermerge"+hashSetA);
                setList.remove(setBIndex);
            }else if(setA){
                 HashSet<Integer> set=setList.get(setAIndex);
                 set.add(end);
            }else if(setB){
                 HashSet<Integer> set=setList.get(setBIndex);
                 set.add(start);
            }else{
                HashSet<Integer> set=new HashSet<Integer>();
                set.add(start);
                set.add(end);
                setList.add(set);
            }   
        }else{
        	//System.out.println("Skipped");
        }
            /* for(HashSet<Integer> h:setList){
                 System.out.print(h);
             }
             System.out.println();*/
            System.out.println("Sum"+sum);
         }
        
        System.out.println(sum);
    }
    static class Edge implements Comparable<Edge>{
        int start;
        int end;
        long weight;
        
        Edge(int start,int end,int weight){
            this.start=start;
            this.end=end;
            this.weight=weight;
        }
        
        @Override
        public int compareTo(Edge e){
            if(weight>e.weight){
                return 1;
            }else if(weight<e.weight){
                return -1;
            }else{
                return 0;
            }
        }
        
        @Override
     		public String toString() {
     			return "Edge [start=" + start + ", end=" + end + ", weight=" + weight + "]";
     		}
    }
}