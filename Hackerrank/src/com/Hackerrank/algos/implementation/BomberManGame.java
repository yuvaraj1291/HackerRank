package com.Hackerrank.algos.implementation;

import java.util.*;

public class BomberManGame {

    private static Scanner sc;

	public static void main(String[] args) {
        
        sc = new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int n=sc.nextInt();
        int[][] num_1sec=new int[r][c];
        int[][] num_2sec=new int[r][c];
        int[][] num_3sec=new int[r][c];
        int[][] num_5sec=new int[r][c];
        String temp=null;
        char[] ch; 
         for(int i=0;i<r;i++){
          temp=sc.next();
          ch=temp.toCharArray();
           for(int j=0;j<c;j++){
                if(ch[j]=='.'){
                    num_1sec[i][j]=0;
                }else{
                    num_1sec[i][j]=2;
                }
                 
             }
        }
   
        //2 sec
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(num_1sec[i][j]==0){
                    num_2sec[i][j]=3;
                }else{
                    num_2sec[i][j]=num_1sec[i][j]-1;
                }
            }
        }
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(num_2sec[i][j]==1){
                        num_3sec[i][j]=-1;
                    if(i-1 >= 0 && num_2sec[i-1][j]!=1){
                        num_3sec[i-1][j]=-1;
                    } if(i+1 <r && num_2sec[i+1][j]!=1){
                        num_3sec[i+1][j]=-1;
                    } if(j-1 >=0 && num_2sec[i][j-1]!=1){  
                        num_3sec[i][j-1]=-1;
                    } if(j+1 < c && num_2sec[i][j+1]!=1){
                        num_3sec[i][j+1]=-1;
                    }
                    
                }
            }
        }
              
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(num_3sec[i][j] == 0){
                        num_3sec[i][j]=num_2sec[i][j]-1;    
                }
            }
        }
       
        //5 sec
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
              if(num_3sec[i][j]==2){
                        num_5sec[i][j]=-1;
                    if(i-1 >= 0 && num_3sec[i-1][j]!=2){
                        num_5sec[i-1][j]=-1;
                    } if(i+1 < r && num_3sec[i+1][j]!=2){
                        num_5sec[i+1][j]=-1;
                    } if(j-1 >=0 && num_3sec[i][j-1]!=2){  
                        num_5sec[i][j-1]=-1;
                    } if(j+1 < c && num_3sec[i][j+1]!=2){
                        num_5sec[i][j+1]=-1;
                    }
                    
                }  
            }
        }
        
          for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(num_5sec[i][j] == 0){
                        num_5sec[i][j]=2;    
                }
            }
        }
        
        
        if(n%2==0){
           for(int i=0;i<r;i++){
               for(int j=0;j<c;j++){
                   System.out.print("O");
               }
               System.out.println();
           }
        }else if(n==1){
            for(int i=0;i<r;i++){
               for(int j=0;j<c;j++){
                   if(num_1sec[i][j]>0){
                        System.out.print("O");
                   }else{
                       System.out.print(".");
                   }
               }
                System.out.println();
           }
            }else if(n%4==1){
            for(int i=0;i<r;i++){
               for(int j=0;j<c;j++){
                   if(num_5sec[i][j]>0){
                        System.out.print("O");
                   }else{
                       System.out.print(".");
                   }
               }
                System.out.println();
           }
        }else if(n%4==3){
            for(int i=0;i<r;i++){
               for(int j=0;j<c;j++){
                   if(num_3sec[i][j]>0){
                        System.out.print("O");
                   }else{
                       System.out.print(".");
                   }
                  
               }
                System.out.println();
         }
        }     
        
    }
}