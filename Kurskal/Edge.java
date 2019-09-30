package problem.Kurskal;

public class Edge implements Comparable<Edge>{
	private int src;
	private int dst;
	private int weight;
	public int getSrc() {
		return src;
	}
	public void setSrc(int src) {
		this.src = src;
	}
	public int getDst() {
		return dst;
	}
	public void setDst(int dst) {
		this.dst = dst;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Edge(int src, int dst, int weight) {
		super();
		this.src = src;
		this.dst = dst;
		this.weight = weight;
	}
	@Override
	public int compareTo(Edge o) {
		// TODO Auto-generated method stub
		return this.weight-o.weight;
	}
 
}