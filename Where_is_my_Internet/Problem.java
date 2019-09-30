package Where_is_my_Internet;

import java.util.*;
import java.lang.*;
import java.io.*;

class Probleme {
	static int[] T;
/////////Union-Find/////////////////////////////////////
	public static int find(int x) {
		if (T[x] == x)
			return x;
		return T[x] = find(T[x]);

	}

	public static void union(int x, int y) {
		T[find(x)] = find(y);
	}
////////////////////////////////////////////////////////
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		T = new int[a];

		for (int i = 0; i < a; i++) {
			T[i] = i;

		}
		for (int i = 0; i < b; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			int min = (int) Math.min(x - 1, y - 1);
			int max = (int) Math.max(x - 1, y - 1);
			union(max, min);

		}

		int count = 0;
		for (int i = 1; i < a; i++) {
			if (find(i) != find(0)) {
				System.out.println(i + 1);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Connected");
		}

	}
}
