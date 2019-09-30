package InverseFact;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
public class InverseFact {
    public static void main (String[] args) throws java.lang.Exception
    {   
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int nbr=s.length()-1;
    
        if(nbr>7){
            double count=0;
            int i=0;
            while(true){
                if(count>=nbr){
                    System.out.println(i);
                    break;
                }
                i++;
                count +=Math.log(i)/Math.log(10);
                
                
            }
        }else{
            int count=1;
            for(int i=1;i<=12;i++){
                count *=i;
                if(Integer.toString(count).equals(s)){
                    System.out.println(i);
                    break;
                }
            }
        }

}
}
