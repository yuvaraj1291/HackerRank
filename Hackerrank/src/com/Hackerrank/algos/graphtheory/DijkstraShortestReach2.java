package com.Hackerrank.algos.graphtheory;

import java.io.*;
import java.util.*;

public class DijkstraShortestReach2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int nv=sc.nextInt();
            int ne=sc.nextInt();
      
        ArrayList<Edge> ar=new ArrayList<Edge>();
        for(int j=0;j<ne;j++){
            ar.add(new Edge(sc.nextInt(),sc.nextInt(),sc.nextInt()));
        }
        PriorityQueue<Vertex> queue=new PriorityQueue<Vertex>();
        int source=sc.nextInt();
        for(int j=1;j<=nv;j++){
            if(j!=source){
                 queue.add(new Vertex(j,Integer.MAX_VALUE));
            }else{
                 queue.add(new Vertex(j,0));
            }
        }
        HashMap<Integer,Integer> outputMap=new HashMap<Integer,Integer>();
        while(!queue.isEmpty()){
            Vertex ver=queue.remove();
            if(ver.w==Integer.MAX_VALUE){
                break;
            }
            for(Edge e:ar){
                if(e.start==ver.v || e.end == ver.v){
                    int adjVer=0;
                    if(e.start==ver.v){
                        adjVer=e.end;
                    }else{
                        adjVer=e.start;
                    }
                    Vertex updateVer=null;
                    boolean updateFlag=false;
                    for(Vertex curVer:queue){
                        if(curVer.v==adjVer){
                            if(ver.w+e.weight<curVer.w){
                                updateFlag=true;
                                updateVer=curVer;
                                break;
                            }
                        }
                    }
                    if(updateFlag){
                        queue.remove(updateVer);
                        queue.add(new Vertex(adjVer,ver.w+e.weight));
                        outputMap.put(adjVer,ver.w+e.weight);
                    }
                }
            }
        }
           /* for(Map.Entry<Integer,Integer> ent:outputMap.entrySet()){
                 System.out.print(ent.getValue()+" ");
            }*/
            for(int k=1;k<=nv;k++){
                if(k!=source){
                    if(outputMap.containsKey(k)){
                        System.out.print(outputMap.get(k)+" ");
                    }else{
                        System.out.print("-1 ");
                    }
                }
            }
        System.out.println();     
    }
  }
    private static class Vertex implements Comparable<Vertex>{
		int v;
		int w;
		Vertex(int v,int w){
			this.v=v;
			this.w=w;
		}
		@Override
		public int compareTo(Vertex v) {
            if(w>v.w){
                return 1;
            }else if(w<v.w){
                return -1;
            }else{
                return 0;
            }
		}
		@Override
		public String toString(){
			return v+" "+w;
		}
	}

	private static class Edge {
		int start;
		int end;
		int weight;
		Edge(int start,int end,int weight){
			this.start=start;
			this.end=end;
			this.weight=weight;
		}

		@Override
		public String toString(){
			return start+" "+end+"   "+weight;
		}
	}
}