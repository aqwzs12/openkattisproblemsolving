package zigi;
/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		List<Integer> list=new ArrayList<Integer>();
		for(int i=2;i<=100000;i++){
			list.add(i);
		}
		for(int i=0;i<list.size();i++){
			for(int j=i+1;j<list.size();j++){
				if(list.get(j)%list.get(i)==0)list.remove(j);
			}
		}
		
		System.out.println(list);
	}
}