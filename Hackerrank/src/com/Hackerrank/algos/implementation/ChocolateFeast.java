package com.Hackerrank.algos.implementation;

import java.util.Scanner;

public class ChocolateFeast {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        for(int i=0;i<t;i++){
            int dol=sc.nextInt();
            int price=sc.nextInt();
            int exPrice=sc.nextInt();
            int chwrap=0;
            int choc=dol/price;
            chwrap=choc;
            int exChoc=0;
            int totExChoc=0;
            while(chwrap>=exPrice){
                exChoc=chwrap/exPrice;
                chwrap=exChoc+(chwrap%exPrice);
                totExChoc+=exChoc;
            }
            System.out.println((choc+totExChoc));
        }
    }
}