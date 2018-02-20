
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
public class Parenthesis {
    public static void main(String[] args) {
        while(true){
        String s;
        Stack st=new Stack();
        Queue<Integer> q = new LinkedList<>();
        System.out.println("Give input");
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        int i=0,flag=0;
        char c;
       
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
            {
                st.add(s.charAt(i));
            }
            else if(s.charAt(i)==')')
            {
                if(st.empty()){
                    flag=1;
                    break;
                }
                c=(char) st.pop();
                if(c=='(')
                    continue;
                else 
                {
                    flag=1;
                    break;
                }
            }
            else if(s.charAt(i)=='}')
            {
                if(st.empty()){
                    flag=1;
                    break;
                }
                c=(char) st.pop();
                if(c=='{')
                    continue;
                else 
                {
                    flag=1;
                }
            }
            else if(s.charAt(i)==']')
            {
                if(st.empty()){
                    flag=1;
                    break;
                }
                c=(char) st.pop();
                if(c=='[')
                    continue;
                else 
                {
                    flag=1;
                }
            }
        }
        if(flag!=1&&st.empty())
        {
            System.out.println("balanced");
        }
        else 
            System.out.println("imbalanced");
    }
    }
    
}
