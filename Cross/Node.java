package Cross;

import java.util.ArrayList;

public class Node {
	private ArrayList<Integer> value;
	private Node next_node;
	private int index_i;
	private int index_j;
 
	public ArrayList<Integer> getValue() {
		return value;
	}
 
	public void setValue(ArrayList<Integer> value) {
		this.value = value;
	}
 
	public Node getNext_node() {
		return next_node;
	}
 
	public void setNext_node(Node next_node) {
		this.next_node = next_node;
	}
 
	public int getIndex_i() {
		return index_i;
	}
 
	public void setIndex_i(int index_i) {
		this.index_i = index_i;
	}
 
	public int getIndex_j() {
		return index_j;
	}
 
	public void setIndex_j(int index_j) {
		this.index_j = index_j;
	}
 
	public Node(int index_i, int index_j) {
		value=new ArrayList<Integer>();
		for (int i = 1; i < 10; i++) {
			value.add(i);
		}
 
		this.index_i = index_i;
		this.index_j = index_j;
	}
 
}