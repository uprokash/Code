import java.io.*;
import java.util.*;

public class Solution {

    static int gcd(int x,int y){
        if(x%y==0||x==y)
            return y;
        else if(y%x==0)
            return x;
        else if(x>y)
        {
            return gcd(x%y,y);
        }
        else
            return gcd(y%x,x);            
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int x,y;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        int result=gcd(x,y);
        System.out.print(result);
    }
}