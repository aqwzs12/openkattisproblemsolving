package coloring_graph;

import java.util.ArrayList;
import java.util.Scanner;

public class scorify {
	
	public static ArrayList	<ArrayList<Integer>> init_graph(int N){
		ArrayList<ArrayList<Integer>> graph=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<N;i++){
			graph.add(new ArrayList<Integer>());
		}
		return graph;
	}
	public static int[][] init_Color(int N){
		int[][] m=new int[N][N];
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				m[i][j]=j;
			}
		}
		return m;
	}
	
	public static void processing(ArrayList<ArrayList<Integer>> graph,int[][] m){
		int max=0;
		for(int i=0;i<m[0].length;i++){
			for(int j=0;j<m[0].length;j++){
				if(m[i][j]!=-1){
					if(m[i][j]>max) max=m[i][j];
					for(int r : graph.get(i)){
						m[r][j]=-1;
					}
					break;
				}
			}
			
		}
		System.out.println(max+1);
	}
	
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int Case=sc.nextInt();
		for(int o=0;o<Case;o++){
			
			int N=sc.nextInt();
			int M=sc.nextInt();
			// init graph
			ArrayList<ArrayList<Integer>> graph=init_graph(N);
			int[][] Color=init_Color(N);
			for(int i=0;i<M;i++){
				int a=sc.nextInt()-1;
				int b=sc.nextInt()-1;
				graph.get(b).add(a);	graph.get(a).add(b);
			}
			
			processing(graph,Color);
			
			
		}
		
		
	
		
		
		
	}

}
