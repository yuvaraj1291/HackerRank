package com.Hackerrank.ds.stack;

import java.util.Scanner;

public class EqualStacks {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int h1[] = new int[n1];
        int sumh1=0;
        int sumh2=0;
        int sumh3=0;
        for(int h1_i=0; h1_i < n1; h1_i++){
            h1[h1_i] = in.nextInt();
            sumh1=sumh1+h1[h1_i];
        }
        int h2[] = new int[n2];
        for(int h2_i=0; h2_i < n2; h2_i++){
            h2[h2_i] = in.nextInt();
             sumh2=sumh2+h2[h2_i];
        }
        int h3[] = new int[n3];
        for(int h3_i=0; h3_i < n3; h3_i++){
            h3[h3_i] = in.nextInt();
            sumh3=sumh3+h3[h3_i];
        }
        int a=0;
        int b=0;
        int c=0;
        while(sumh1 != sumh2 || sumh2 != sumh3){
            if(sumh1 > sumh2){
                if(sumh1>sumh3){
                   sumh1=sumh1-h1[a++]; 
                }else{
                    sumh3=sumh3-h3[c++];
                }
            }else if(sumh2 >sumh3){
               sumh2=sumh2-h2[b++];
            }else{
                sumh3=sumh3-h3[c++];
            }
                
            }
        System.out.println(sumh3);
          
        }
}