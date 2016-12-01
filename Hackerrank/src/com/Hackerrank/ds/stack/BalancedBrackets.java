package com.Hackerrank.ds.stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			String s = in.next();
			Stack<Character> st = new Stack<Character>();
			boolean flag = true;
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (c == '(' || c == '{' || c == '[') {
					st.push(c);
				} else {
					if (c == ')') {
						if (!st.isEmpty() && st.peek() == '(') {
							st.pop();
						} else {
							flag = false;
							break;
						}
					}
					if (c == ']') {
						if (!st.isEmpty() && st.peek() == '[') {
							st.pop();
						} else {
							flag = false;
							break;
						}
					}
					if (c == '}') {
						if (!st.isEmpty() && st.peek() == '{') {
							st.pop();
						} else {
							flag = false;
							break;
						}
					}
				}
			}

			if (st.isEmpty() && flag) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}
}
