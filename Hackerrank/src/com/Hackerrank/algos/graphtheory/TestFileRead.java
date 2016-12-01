package com.Hackerrank.algos.graphtheory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TestFileRead {

    public static void main(String[] args) throws IOException {
    
    	BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Yuvaraj\\git\\HackerRank\\Hackerrank\\src\\com\\Hackerrank\\algos\\graphtheory\\input.txt"));
    	String input=null;
    	ArrayList<Edge> ar=new ArrayList<Edge>();
    	br.readLine();
    	while((input=br.readLine())!=null){
    			String[] str=input.split(" ");
                ar.add(new Edge(Integer.valueOf(str[0]),Integer.valueOf(str[1]),Integer.valueOf(str[2])));
    	}
    	System.out.println(ar);
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
		public String toString() {
			return "Edge [start=" + start + ", end=" + end + ", weight=" + weight + "]";
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
    }
}