import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RichieRich {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// int n = in.nextInt();
		// int k = in.nextInt();
		// String number = in.next();
		int n = 6;
		int k = 2;
		String number = "932239";
		char[] input = number.toCharArray();

		ArrayList<Integer> ar = new ArrayList<Integer>();
		int count = 0;
		for (int i = 0; i < number.length() / 2; i++) {
			if (number.charAt(i) != number.charAt(number.length() - i - 1)) {
				ar.add(i - 1);
				count++;
			}
		}
		System.out.println("Count" + count);
		// error scenario
		if (k < count) {
			System.out.println("-1");
		} else if (k == count) {
			for (int i = 0; i < number.length() / 2; i++) {
				if (number.charAt(i) != number.charAt(number.length() - i - 1)) {
					if (number.charAt(i) > number.charAt(number.length() - i - 1)) {
						input[number.length() - i - 1] = number.charAt(i);
					} else {
						input[i] = number.charAt(number.length() - i - 1);
					}
				}
			}
			System.out.println(input);
		}

		// k is greater than count
		else if (k > count) {
			int diff = k - count;
			 System.out.println("count"+count);
			System.out.println("Before start Diff"+diff);
			if (diff > 0) {
				for (int i = 0; i < number.length() / 2; i++) {
					System.out.println("Iteration"+i);
					System.out.println("Diff"+diff);
					if (diff >= 2) {
						System.out.println("Iteration"+i);
						if (input[i] != '9') {
							System.out.println("Sub diff"+i);
							input[i] = '9';
							diff--;
						}
						if (number.charAt(number.length() - i - 1) != '9') {
							System.out.println(number.length() - i - 1);
							System.out.println(input[number.length() - i - 1]);
							System.out.println("Sub diff 2 nd loop"+i);
							input[number.length() - i - 1] = '9';
							diff--;
						}
						System.out.print("Before loop;");
						if (ar.contains(i)) {
							System.out.print("Inside loop;");
							int remID = ar.indexOf(i);
							ar.remove(remID);
							diff++;
						}

					} else if (diff == 1) {
						if (number.charAt(i) != number.charAt(number.length() - i - 1)) {
							int flag = 0;
							if (number.charAt(i) != '9') {
								input[i] = '9';
								flag++;
							}

							if (number.charAt(number.length() - i - 1) != '9') {
								input[number.length() - i - 1] = '9';
								flag++;
							}
							if (flag == 2) {
								diff--;
							}
						}
					} else if (diff == 0) {
						if (number.charAt(i) != number.charAt(number.length() - i - 1)) {
							if (number.charAt(i) > number.charAt(number.length() - i - 1)) {
								input[number.length() - i - 1] = number.charAt(i);
							} else {
								input[i] = number.charAt(number.length() - i - 1);
							}
						}
					}

					// diff=k-count;
					// System.out.println("Each Iteration diff"+diff);
				}

			}
			// System.out.println("diff"+diff);
			if (diff >= 1) {
				// int a=number.length()-1/2;
				// System.out.println("Value"+a);
				input[(number.length() - 1) / 2] = '9';
			}

			System.out.println(input);
		}
	}
}
