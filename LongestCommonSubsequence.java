
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
public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String first,second;
        Scanner sc=new Scanner(System.in);
        first=sc.nextLine();
        second=sc.nextLine();
        int len1,len2,i,j=0;
        len1=first.length();
        len2=second.length();
        int array[][];
        array=new int[len1+1][len2+1];
        for(i=0;i<len1;i++)
        {
            for(j=0;j<len2;j++)
            {
                if(first.charAt(i)==second.charAt(j)){
                    array[i+1][j+1]=1+array[i][j];
                }
                else
                    array[i+1][j+1]=Math.max(array[i][j+1],array[i+1][j]);
            }
        }
        System.out.println("longest common subsequence= "+array[i][j]);
    }
    
}
