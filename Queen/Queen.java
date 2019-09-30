package Queen;

import java.util.ArrayList;
import java.util.Scanner;

public class Queen {
    static ArrayList<int[][]> list=new ArrayList<int[][]>();
 static int[][] L;
 static boolean checker=false;
    public static boolean isSafe(int i, int j, int[][] M,int N) {
        // in a row & column
        for (int a = 0; a < N; a++) {
            if (M[i][a] == 1)
                return false;
            if (M[a][j] == 1)
                return false;
        }
        // in diag
        for (int a = 0; a < N; a++) {
            try {
                if (M[i - a][j - a] == 1)
                    return false;
            } catch (Exception e) {
            }
        }
        for (int a = 0; a < N; a++) {
            try {
                if (M[i - a][j + a] == 1)
                    return false;
            } catch (Exception e) {
            }
        }
        for (int a = 0; a < N; a++) {
            try {
                if (M[i + a][j - a] == 1)
                    return false;
            } catch (Exception e) {
            }
        }
        for (int a = 0; a < N; a++) {
            try {
                if (M[i + a][j + a] == 1)
                    return false;
            } catch (Exception e) {
            }
        }

        return true;
    }

    public static void processing(int[][] M,int i ,int j,int N){
    if(i==N) {if(compare_matrix(M,L)){System.out.println("valid");checker=true;} return;}
    
        for(int l=0;l<N;l++){
            if(isSafe(i, l, M,N)){
                M[i][l]=1;
                processing(M, i+1, 0,N);
                M[i][l]=0;
            }
        }
    
    }
    
    public static void print_M(int[][] M,int N){
        for (int i = 0; i <N ; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(M[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static boolean compare_matrix(int[][] M,int[][] N){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(M[i][j]!=N[i][j]) return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        
        int[][] M=new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                M[i][j]=0;
            }
        }
        
        L=new int[8][8];
        for(int i=0;i<8;i++){
            String s=sc.nextLine();
            for(int j=0;j<8;j++){
                if(s.charAt(j)=='*') L[i][j]=1;
                else L[i][j]=0;
            }
            
        }
        
        
        processing(M, 0, 0,8);
        if(!checker) System.out.println("invalid");
    }

}