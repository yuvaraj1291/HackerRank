package com.Hackerrank.algos.sorting;

import java.io.*;
import java.util.*;

public class FullCountingSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        LinkedList<String>[] list = new LinkedList[100];
        int tmp;
        String word;
        int half = size / 2;
        
        for (int i = 0; i < size; i++) {
            tmp = sc.nextInt();
            word = sc.next();
            word = (i >= half) ? word : "-";
            
            if (list[tmp] == null) {
                list[tmp] = new LinkedList<>();
                list[tmp].add(word);
            } else {
                list[tmp].add(word);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            while (list[i] != null && !list[i].isEmpty()) {
                sb.append(list[i].poll() + " ");
            }
        }
        System.out.println(sb.toString());
    }
}