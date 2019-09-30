package Three_Powers;

import java.util.*;
import java.math.*;

public class threepowers {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
                ArrayList<BigInteger> list=new ArrayList<BigInteger>();
                String s=sc.next();
                BigInteger B=new BigInteger(s);
                B=B.add(new BigInteger("-1"));
                if(B.equals(new BigInteger("-1")))break;
                String binaire=B.toString(2);   
                String reverse=new StringBuilder(binaire).reverse().toString();
                //System.out.println(binaire + "///"+reverse);
                
                for(int i=0;i<reverse.length();i++){
                    BigInteger A=new BigInteger("3");
                    if(reverse.charAt(i)=='1') list.add(A.pow(i));
                }
                    System.out.print("{ ");
                for(int i=0;i<list.size();i++){
                    System.out.print(list.get(i));
                    if(i!=list.size()-1){
                        System.out.print(", ");
                    }else{
                        System.out.print(" ");
                    }
                }
        
                System.out.println("}");
        }
        
    }
    
    
}