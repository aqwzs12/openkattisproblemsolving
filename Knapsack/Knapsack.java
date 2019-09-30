package problem.Knapsack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
 

	 
	public class Knapsack {
	 
		public static void processing(Sack sack, List<Item> items) {
			int[][] T = new int[items.size() + 1][sack.getWeight() + 1];
	 
			for (int i = 0; i < sack.getWeight() + 1; i++) {
				T[0][i] = 0;
			}
			for (int i = 0; i < items.size() + 1; i++) {
				T[i][0] = 0;
			}
	 
			for (int i = 1; i < items.size() + 1; i++) {
				for (int j = 1; j < sack.getWeight() + 1; j++) {
					if (j < items.get(i - 1).getWeight()) {
						T[i][j] = T[i - 1][j];
					} else {
						T[i][j] = (int) Math.max(items.get(i - 1).getValue() + T[i - 1][j - items.get(i - 1).getWeight()],
								T[i - 1][j]);
					}
				}
			}
	 
	 
	 
			print_matrix(T, items.size() + 1, sack.getWeight() + 1);
	 
		}
	 
		public static void print_matrix(int[][] T, int n, int m) {
			for (int i = 1; i < n; i++) {
				for (int j = 1; j < m; j++) {
					System.out.print(T[i][j] + " ");
				}
				System.out.println();
			}
		}
	 
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
	 
			Sack sack = new Sack(5);
			List<Item> items = new ArrayList<Item>();
			items.add(new Item(50, 2));
			items.add(new Item(10, 1));
			items.add(new Item(100, 5));
	 
			Collections.sort(items);
			processing(sack, items);
	 
		}
	 
	}