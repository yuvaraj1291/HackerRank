package com.Hackerrank.algos.warmup;

import java.util.Scanner;

public class TimeConversion {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String time=sc.next();
        int hours=Integer.valueOf(time.substring(0,2));
        String min=time.substring(3,5);
        String sec=time.substring(6,8);
        String amPm=time.substring(8,10);
        
        if(hours != 12 && amPm.equals("PM")){
            hours=hours+12;
        }else if(hours==12 && amPm.equals("AM")){
            hours=0;
        }
        System.out.println(String.format("%02d",hours)+":"+min+":"+sec);
        
    }
}