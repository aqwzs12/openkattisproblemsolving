package Charcter;
import java.util.Scanner;
public class character {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.printf("%.0f",Math.pow(2, a*1.0)-a-1);
	}
	
}
