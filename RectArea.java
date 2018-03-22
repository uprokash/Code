import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RectArea {

    static long largestRectangle(int[] h) {
        // Complete this function
        int i=0,len,j=2,current,flag=0;
        int res=0,area;
        Stack<Integer> st = new Stack<Integer>();
        len=h.length;
        while(i<len){
            if(st.isEmpty()||h[i]>=h[st.peek()])
            {
                st.push(i);
                i++;
            }
            else
            {
                current=st.pop();
                if(st.isEmpty())
                    area=h[current]*(i);
                else
                    area=h[current]*(i-1-st.peek());
                if(area>res)
                    res=area;
            
            }
        }
        while(!st.isEmpty())
        {
            current=st.pop();
            if(st.isEmpty())
                area=h[current]*(i);
            else
                area=h[current]*(i-1-st.peek());
            if(area>res)
                res=area;
        }
            
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        int[] h = new int[n];
//        for(int h_i = 0; h_i < n; h_i++){
//            h[h_i] = in.nextInt();
//        }
//        long result = largestRectangle(h);
        int hist[] = { 6, 2, 5, 4, 5, 1, 6 };
        long result=largestRectangle(hist);
        System.out.println(result);
        in.close();
    }
}
