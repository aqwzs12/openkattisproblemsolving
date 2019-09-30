package Amalgam_Artichock;

import java.util.*;

class Problem {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int p = in.nextInt();
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			int d = in.nextInt();
			int n = in.nextInt();
			double[] T = new double[n + 1];
			double peak = 0;
			double maxDiff = 0;
			for (int k = 1; k <= n; k++) {
				T[k] = p * (Math.sin(a * k + b) + Math.cos(c * k + d) + 2);
				if (T[k] >= peak) {
					peak = T[k];
				} else {
					double diff = peak - T[k];
					if (diff > maxDiff) {
						maxDiff = diff;
					}
				}

			}

			System.out.printf("%.6f\n", maxDiff);
		}

	}
}