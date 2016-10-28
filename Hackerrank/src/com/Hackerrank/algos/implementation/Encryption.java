package com.Hackerrank.algos.implementation;

import java.util.Scanner;

public class Encryption {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        char[] ch=input.toCharArray();
        int k=0;
        int row=(int)Math.floor(Math.sqrt(ch.length));
        int col=(int)Math.ceil(Math.sqrt(ch.length));
        if(row*col < ch.length){
            row = row + 1;
        }
        char[][] out=new char[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(k<ch.length){
                    out[i][j]=ch[k];
                    k++; 
                }else{
                    break;
                }
            }
        }
       
        k=0;
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                if(out[j][i]!=0){
                    if(k<ch.length){
                     System.out.print(out[j][i]);
                     k++;
                }
                }
            }
            if(i!=col-1){
                System.out.print(" ");
            }
            
        }
        sc.close();
    }
}