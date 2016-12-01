package com.Hackerrank.algos.implementation;

import java.util.Scanner;

public class LibraryFine {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int aday=sc.nextInt();
        int amonth=sc.nextInt();
        int ayear=sc.nextInt();
        int eday=sc.nextInt();
        int emonth=sc.nextInt();
        int eyear=sc.nextInt();
        
        if(ayear>eyear){
            System.out.println("10000");
        }else if(ayear== eyear && amonth>emonth){
            System.out.println(((amonth-emonth)*500));
        }else if(ayear==eyear && amonth==emonth && aday>eday){
             System.out.println(((aday-eday)*15));
        }else{
            System.out.println("0");
        }
        
    }
}