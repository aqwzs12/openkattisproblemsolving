package How_Many_Digit;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Probleme
{
    public static void main (String[] args) throws java.lang.Exception
    {
            ArrayList<Double> list=new ArrayList<Double>();
            list.add(1.0);
            list.add(1.0);
                double zero=0;
                for(int i=2;i<=1000000;i++){
                    zero+=Math.log(i)/Math.log(10);
                    list.add(zero);}
                 
                    
        Scanner sc=new Scanner(System.in);
      while(sc.hasNext()) System.out.println((int) Math.ceil(list.get(sc.nextInt())));
        
    }
}