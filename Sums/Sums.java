package kattis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class brackets {
	private int open;
	private int close;

	public brackets(int open, int close) {
		super();
		this.open = open;
		this.close = close;
	}

	public int getOpen() {
		return open;
	}

	public void setOpen(int open) {
		this.open = open;
	}

	public int getClose() {
		return close;
	}

	public void setClose(int close) {
		this.close = close;
	}

}

public class Sums {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		ArrayList<brackets> list2 = new ArrayList<brackets>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(')
				list.add(i);
			if (s.charAt(i) == ')') {
				list2.add(new brackets(list.get(list.size() - 1), i));
				list.remove(list.size() - 1);
			}
		}

		Set<String> set = new TreeSet<String>();

		int a = (int) Math.pow(2.0, list2.size());
		char[] A = s.toCharArray();
		for (int i = 1; i < a; i++) {
			char[] B = A.clone();
			String r = Integer.toBinaryString(i);
			int b = r.length();

			for (int j = 0; j < list2.size() - b; j++)
				r = '0' + r;

			for (int j = r.length() - 1; j >= 0; j--) {
				if (r.charAt(j) == '1') {

					B[list2.get(j).getClose()] = '_';
					B[list2.get(j).getOpen()] = '_';

				}

			}
			set.add(String.copyValueOf(B).replaceAll("_", ""));

		}

		for (String w : set) {
			System.out.println(w);
		}

	}

}
