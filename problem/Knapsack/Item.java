package problem.Knapsack;

public class Item implements Comparable<Item>{
	private int weight;
	private int value;
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Item(int value , int weight) {
		super();
		this.weight = weight;
		this.value = value;
	}
	@Override
	public int compareTo(Item o) {
		return this.getWeight()-o.getWeight();
	}
 
 
}