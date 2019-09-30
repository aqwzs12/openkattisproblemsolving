package Rational_Sequence;

import java.util.*;
import java.lang.*;
import java.io.*;


class Problem
{
     public static void main (String[] args) throws java.lang.Exception
    {
    Scanner sc=new Scanner(System.in);
    int M=sc.nextInt();
    for(int o=0;o<M;o++){
    int a=sc.nextInt();
    String[] r=sc.next().split("/");
 
    int p =Integer.parseInt(r[0]);
    int q=Integer.parseInt(r[1]);
    if(q==1){
    q=p+1;
    p=1;
     }
    else{
    if(p<q){
    int pp=q;
    int qq=q-p;
    p=pp;
    q=qq;
        
            
        
    }else{
        int k=(int) p/q;
        int rest=p%q;
        p=q;
        
        q=(q-rest)+k*q;
        
    
    }}
   System.out.println(a+" "+p+"/"+q);
    }
}
}
