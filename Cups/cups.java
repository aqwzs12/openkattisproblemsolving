package zigi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Cup implements Comparable<Cup>{
	private int value;
	private String color;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Cup(int value, String color) {
		super();
		this.value = value;
		this.color = color;
	}

	@Override
	public int compareTo(Cup arg0) {
		// TODO Auto-generated method stub
		return this.getValue()-arg0.getValue();
	}
}

public class cups {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Case = sc.nextInt();
		ArrayList<Cup> list = new ArrayList<Cup>();
		for (int i = 0; i < Case; i++) {
			try {
				list.add(new Cup(sc.nextInt(), sc.next()));
			} catch (Exception e) {
				String s = sc.next();
				int a = sc.nextInt();
				list.add(new Cup(a * 2, s));
			}
		}
		Collections.sort(list);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getColor());
		}
	}

}
