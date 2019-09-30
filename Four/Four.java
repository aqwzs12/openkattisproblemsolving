package zigi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;



public class Four {
	
	static ArrayList<String> listKey = new ArrayList<String>(Arrays.asList("4*4*4*4", "4*4*4-4", "4*4*4+4", "4*4*4/4", "4*4-4*4", "4*4-4-4", "4*4-4+4", "4*4-4/4", "4*4+4*4", "4*4+4-4", "4*4+4+4", "4*4+4/4", "4*4/4*4", "4*4/4-4", "4*4/4+4", "4*4/4/4", "4-4*4*4", "4-4*4-4", "4-4*4+4", "4-4*4/4", "4-4-4*4", "4-4-4-4", "4-4-4+4", "4-4-4/4", "4-4+4*4", "4-4+4-4", "4-4+4+4", "4-4+4/4", "4-4/4*4", "4-4/4-4", "4-4/4+4", "4-4/4/4", "4+4*4*4", "4+4*4-4", "4+4*4+4", "4+4*4/4", "4+4-4*4", "4+4-4-4", "4+4-4+4", "4+4-4/4", "4+4+4*4", "4+4+4-4", "4+4+4+4", "4+4+4/4", "4+4/4*4", "4+4/4-4", "4+4/4+4", "4+4/4/4", "4/4*4*4", "4/4*4-4", "4/4*4+4", "4/4*4/4", "4/4-4*4", "4/4-4-4", "4/4-4+4", "4/4-4/4", "4/4+4*4", "4/4+4-4", "4/4+4+4", "4/4+4/4", "4/4/4*4", "4/4/4-4", "4/4/4+4", "4/4/4/4"));
	static ArrayList<String> listVal = new ArrayList<String>(Arrays.asList("256", "60", "68", "16", "0", "8", "16", "15", "32", "16", "24", "17", "16", "0", "8", "1", "-60", "-16", "-8", "0", "-16", "-8", "0", "-1", "16", "0", "8", "1", "0", "-1", "7", "4", "68", "16", "24", "8", "-8", "0", "8", "7", "24", "8", "16", "9", "8", "1", "9", "4", "16", "0", "8", "1", "-15", "-7", "1", "0", "17", "1", "9", "2", "1.0", "-4", "4", "0"));
	


	public static void main(String[] args)  {
		
		
		Scanner sc=new Scanner(System.in);	
		int Case=sc.nextInt();
		for(int i=0;i<Case;i++){
		String a =""+sc.nextInt();
		int index=listVal.indexOf(a);
		if(index>=0){
			String[] r=listKey.get(index).split("");
			
			for(int o=0;o<r.length;o++) System.out.print(r[o]+" ");
			System.out.println("= "+a);
		}
		else
		{
			System.out.println("no solution");
		}
	}
	}
}
