package com.Hackerrank.algos.implementation;

import java.util.Scanner;

public class BiggerIsGreater {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		String[] input=new String[t];
		char[] ch=null;


		for(int i=0;i<t;i++){
			input[i]=sc.next();
		}
		for(int i=0;i<t;i++){
			ch=input[i].toCharArray();    
			char firstChar=' ';
			char celing=' ';
			int firstCharPos=0;
			int celingPos=0;
			int flag=0;
			for(int j=ch.length-1;j>0;j--){
				if(ch[j-1] < ch[j]){
					firstChar=ch[j-1];
					firstCharPos=j-1;
					celing = ch [j];
					celingPos=j;
					flag=1;
					break;
				}
			}
			if(flag==0){
				System.out.println("no answer");
			}else{

				for(int k=firstCharPos+1;k<ch.length;k++){
					if(ch[k] < celing && ch[k] > firstChar){
						celing = ch[k];
						celingPos=k; 
					}
				}
				//swapping celing and first Char
				if(celing != ' ' && firstChar != ' ' ){
					ch[firstCharPos]=celing;
					ch[celingPos]=firstChar;
				}
				char temp;
				for(int j=firstCharPos+1;j<ch.length;j++){
					for(int k=firstCharPos+2;k<ch.length-j+firstCharPos+1;k++){                  
						if(ch[k-1]>ch[k]){
							temp=ch[k-1];
							ch[k-1]=ch[k];
							ch[k]=temp;
						}
					}
				}

				System.out.println(String.valueOf(ch));


			}
		}
		sc.close();

	}
}