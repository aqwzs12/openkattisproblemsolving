package problem.Kurskal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Kurskal {
	List<Edge> edges;
	int[] UF;
 
	public Kurskal(List<Edge> edges,int V) {
		super();
		this.edges = edges;
		UF = new int[V];
		for (int i = 0; i < V; i++) {
			UF[i] = i;
		}
	}
 
	public List<Edge> getEdges() {
		return edges;
	}
 
	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}
 
	public void union(int a, int b) {
		UF[a] = (int) Math.min(UF[a], UF[b]);
		UF[b] = UF[a];
	}
 
	public int find(int a) {
		if (UF[a] == a)
			return a;
		return find(UF[UF[a]]);
	}
 
	public boolean check_same_grp(int a, int b) {
		if (find(a) == find(b))
			return true;
		return false;
	}
 
	public void Kurskal() {
		Set<String> list=new TreeSet<String>();
		Collections.sort(edges);	
		double count = 0;
		int coup=0;
		for (int i = 0; i < edges.size() ; i++) {
			if (!check_same_grp(edges.get(i).getDst(), edges.get(i).getSrc())) {
				coup++;
				union(edges.get(i).getDst(), edges.get(i).getSrc());
				//System.out.println(edges.get(i).getSrc()+"  "+edges.get(i).getDst()+"  "+edges.get(i).getWeight());
				list.add(edges.get(i).getSrc()+" "+edges.get(i).getDst());
				count += edges.get(i).getWeight();
			}
 
		}
		if(list.size()!=UF.length-1){
			System.out.println("impossible");
		}else{
 		System.out.printf("%.0f",count);
 		System.out.println();
 		for(String edge : list){
 			System.out.println(edge);
 		}
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int V=sc.nextInt();
			int Line=sc.nextInt();
			if(V==0 && Line==0)break;
					ArrayList<Edge> list=new ArrayList<Edge>();
					for(int i=0;i<Line;i++) {
						int a =sc.nextInt();
						int b=sc.nextInt();
						list.add(new Edge((int) Math.min(a, b), (int) Math.max(a, b), sc.nextInt()));
					}
					Kurskal kurskal=new Kurskal(list,V);
					kurskal.Kurskal();
		}
		
		
		
	
	}
 
 
}