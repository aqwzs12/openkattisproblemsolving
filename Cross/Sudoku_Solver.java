package Cross;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Sudoku_Solver {
	static int[][] Matrix;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] T = new int[9][9];
		for (int i = 0; i < 9; i++) {
			String s = sc.nextLine();
			for (int j = 0; j < 9; j++) {
				if (s.charAt(j) == '.')
					T[i][j] = -1;
				else
					T[i][j] = Integer.parseInt("" + s.charAt(j));
			}

		}
		Matrix = T.clone();
		construct_tree(T);

	}

	public static void construct_tree(int[][] T) {
		Node node = null;
		Set<Integer> list = new TreeSet<Integer>();
		ArrayList<Node> Graph = new ArrayList<Node>();
		for (int i = 0; i < T[0].length; i++) {
			for (int j = 0; j < T[0].length; j++) {
				if (T[i][j] == -1) {
					node = new Node(i, j);
					list = new TreeSet<Integer>();
					for (int u = 0; u < T[0].length; u++) {
						if (T[i][u] != -1) {
							list.add(T[i][u]);
						}
						if (T[u][j] != -1) {
							list.add(T[u][j]);
						}

					}

				}
				if (node != null) {
					node.getValue().removeAll(list);
					Graph.add(node);
				}
			}
		}

		for (int i = 0; i < Graph.size() - 1; i++) {
			Graph.get(i).setNext_node(Graph.get(i + 1));
		}
		print_node(Graph.get(0));
		processing_solution(Graph.get(0), T);

	}

	public static void print_node(Node node) {
		System.out.println(node.getIndex_i() + " //  " + node.getIndex_j() + "/// values :" + node.getValue());
		try {
			print_node(node.getNext_node());
		} catch (Exception e) {
			return;
		}

	}

	public static void processing_solution(Node node, int[][] T) {
	
		if(node.getNext_node()==null){
			for (int i = 0; i < node.getValue().size(); i++) {
				
				if (checker(T, node.getIndex_i(), node.getIndex_j(), node.getValue().get(i))) 
					T[node.getIndex_i()][node.getIndex_j()] = node.getValue().get(i);
			}
			
			
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				System.out.print(T[i][j]+" ");
			}
		System.out.println();}
		System.out.println();}
		for (int i = 0; i < node.getValue().size(); i++) {
			
			if (checker(T, node.getIndex_i(), node.getIndex_j(), node.getValue().get(i))) {
				T[node.getIndex_i()][node.getIndex_j()] = node.getValue().get(i);
				if(node.getNext_node()!=null)
				processing_solution(node.getNext_node(), T);
				T[node.getIndex_i()][node.getIndex_j()] =-1;
				
			}
		}
		
		
	}

	public static boolean checker(int[][] T, int i, int j, int val) {
		for (int u = 0; u < T[0].length; u++) {
			if (val == T[u][j] || val == T[i][u])
				return false;
		}

		/// check in squart ///
		return  checker_sqrt(T, i, j, val);

	}

	public static boolean checker_sqrt(int[][] T, int i, int j, int val) {
		int a = i % 3;
		int b = j % 3;
		if (a == 0) {
			if (b == 0 && (T[i + 1][j + 1] == val || T[i + 1][j + 2] == val || T[i + 2][j + 1] == val
					|| T[i + 2][j + 2] == val))
				return false;
			if (b == 1 && (T[i + 1][j + 1] == val || T[i + 1][j - 1] == val || T[i + 2][j - 1] == val
					|| T[i + 2][j + 1] == val))
				return false;
			if (b == 2 && (T[i + 1][j - 1] == val || T[i + 1][j - 2] == val || T[i + 2][j - 1] == val
					|| T[i + 2][j - 2] == val))
				return false;
		}
		if (a == 1) {
			if (b == 0 && (T[i - 1][j + 1] == val || T[i - 1][j + 2] == val || T[i + 1][j + 1] == val
					|| T[i + 1][j + 2] == val))
				return false;
			if (b == 1 && (T[i + 1][j + 1] == val || T[i + 1][j - 1] == val || T[i - 1][j - 1] == val
					|| T[i - 1][j + 1] == val))
				return false;
			if (b == 2 && (T[i + 1][j - 1] == val || T[i + 1][j - 2] == val || T[i - 1][j - 1] == val
					|| T[i - 1][j - 2] == val))
				return false;
		}
		if (a == 2) {
			if (b == 0 && (T[i - 1][j + 1] == val || T[i - 1][j + 2] == val || T[i - 2][j + 1] == val
					|| T[i - 2][j + 2] == val))
				return false;
			if (b == 1 && (T[i - 1][j + 1] == val || T[i - 1][j - 1] == val || T[i - 2][j - 1] == val
					|| T[i - 2][j + 1] == val))
				return false;
			if (b == 2 && (T[i - 1][j - 1] == val || T[i - 1][j - 2] == val || T[i - 2][j - 1] == val
					|| T[i - 2][j - 2] == val))
				return false;
		}
		return true;
	}

}
