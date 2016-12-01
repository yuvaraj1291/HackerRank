package com.Hackerrank.algos.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HappyLadyBugs {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int Q = in.nextInt();

		for(int a0 = 0; a0 < Q; a0++){
			int n = in.nextInt();
			char[] c = in.next().toCharArray();

			HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
			int val=0;
			int _count=0;
			for(char ch:c){
				if(hm.containsKey(ch)){
					val=hm.get(ch);
					val+=1;
					hm.put(ch,val);
				}else{
					if(ch!='_'){
						hm.put(ch,1);
					}else{
						_count++;
					}
				}
			}
			boolean flag=true;
			int value=0;
			if(_count!=0){
				for(Map.Entry<Character,Integer> entry:hm.entrySet()){
					value=entry.getValue();
					if(value==1){
						flag=false;
						break;
					}
				}
			}else if(n==1){
				if(c[0]!='_'){
					flag=false;
				}
			}else{
				for(int i=0;i<n;i++){
					if(i!=0 && i!=n-1){
						if(c[i]!=c[i+1] && c[i-1]!=c[i]){
							flag=false;
							break;
						}
					}else if(i==0){
						if(c[i]!=c[i+1]){
							flag=false;
							break;
						}
					}else{
						if(c[i]!=c[i-1]){
							flag=false;
							break;
						}
					}

				}

			}
			if(flag){
				System.out.println("YES"); 
			}else{
				System.out.println("NO");
			}

		}
	}
}

