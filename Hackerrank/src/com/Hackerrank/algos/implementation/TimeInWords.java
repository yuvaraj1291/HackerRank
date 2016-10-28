package com.Hackerrank.algos.implementation;

import java.util.Scanner;

public class TimeInWords {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int hr=sc.nextInt();
        int min=sc.nextInt();
        
        String[] onesteens = {"one" , "two" , "three" ,"four" , "five", "six", "seven" , "eight" , "nine", "ten" ,
                          "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"};
        String[] tens= {"ten", "twenty", "thrity","fourty","fifty","sixty"};
        int part=0,whole=0;
        if(min==00){
                System.out.println(onesteens[hr-1]+" o' clock");     
        }else if(min==15){
            System.out.println("quarter past "+onesteens[hr-1]);
        }else if(min==30){
            System.out.println("half past "+onesteens[hr-1]);            
        }else if(min==45){
            System.out.println("quarter to "+onesteens[hr]);
        }else if(min<=29){
            if(min<=20){
                System.out.println(onesteens[min-1]);
            }else{
                 part=min%10;
                 whole=min/10;
                if(part!=0){
                    System.out.print(tens[whole-1]+" "+onesteens[part-1]);
                }else{
                     System.out.print(tens[whole-1]);
            }
            }
            System.out.println(" minutes past "+onesteens[hr-1]);
        }else{
                min=60-min;
                if(min<=20){
                System.out.print(onesteens[min-1]);
                }else if(min>20){
                 part=min%10;
                 whole=min/10;
                if(part!=0){
                    System.out.print(tens[whole-1]+" "+onesteens[part-1]);
                }else{
                     System.out.print(tens[whole-1]);
            }
        }
        System.out.println(" minutes to "+onesteens[hr]);
        }
        sc.close();
    }
}