package com.Hackerrank.algos.graphtheory;

import java.io.*;
import java.util.*;

public class PrimMSTSpecialSubtree {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc=new Scanner(System.in);
		int nv=sc.nextInt();
		int ne=sc.nextInt();
		Map<Integer,ArrayList<Edge>> edgeMap=new HashMap<Integer,ArrayList<Edge>>();
		ArrayList<Edge> edgeList=new ArrayList<Edge>();
		Edge edge=null;
		for(int i=0;i<ne;i++){
			int s=sc.nextInt();
			int e=sc.nextInt();
			int w=sc.nextInt();
			edge=new Edge(s,e,w);
			edgeList.add(edge);
		}

		int start = sc.nextInt();

		PriorityQueue<Vertex> queue=new PriorityQueue(nv);
		for(int i=1;i<=nv;i++){
			if(i==start){
				queue.add(new Vertex(i,0));
			}else{
				queue.add(new Vertex(i,Integer.MAX_VALUE));
			}
		}

		//System.out.print("Result "+queue.peek().v);
		HashMap<Integer,Edge> outputMap=new HashMap<Integer,Edge>();

		while(!queue.isEmpty()){
			Vertex v=queue.remove();
			int vertex=v.v;
			int weight=v.w;
			// System.out.println("Processing "+v);
			for(Edge e:edgeList){
				boolean flag=false;
				Vertex adjVertex=null;
				if(e.start==vertex || e.end==vertex){
					int adj=0;
					if(e.start==vertex){
						adj=e.end;
					}else{
						adj=e.start;                       
					}

					Edge minEdge=null;
					//int adjWeight=0;
					for(Vertex ver:queue){
						//System.out.println("Vertex"+ver);
						if(ver.v==adj){
							if(ver.w>e.weight){
								flag=true;
								adjVertex=ver;
								//minEdge=e;
							}
						}
					}
				}
				if(flag){
					queue.remove(adjVertex);
					queue.add(new Vertex(adjVertex.v,e.weight));
					outputMap.put(adjVertex.v,e);
				}

			}
		}
		long sum=0;
		for(Map.Entry<Integer,Edge> e:outputMap.entrySet()){
			// System.out.print(e.getKey());
			//System.out.println("  "+e.getValue().weight);
			sum+=e.getValue().weight;
		}
		System.out.println(sum);
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
			// TODO
			return w-v.w;
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