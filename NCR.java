
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Uchchhwas
 */
public class NCR {
    public static void main(String[] args) {
        int n,r,i,j=0;
        int matrix[][];
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        r=sc.nextInt();
        matrix=new int[n+1][r+1];
        for(i=0;i<=n;i++)
        {
            for(j=0;j<=Math.min(i,r);j++)
            {
                if(j==0||j==i)
                    matrix[i][j]=1;
                else
                    matrix[i][j]=matrix[i-1][j]+matrix[i-1][j-1];
            }
        }
        System.out.println(matrix[n][r]);
        
        
    }
    
}
