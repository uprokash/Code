
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Uchchhwas
 */
public class test {
    public static void main(String[] args) {
        String st="10";
        String temp="2";
        int []a=new int[3];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        int b[];
        b=a;
        System.out.println(a.length);
        System.out.println(b[2]);
        st.length();
        //System.out.println(a);
        if(Math.abs(Integer.valueOf(st)-Integer.valueOf(temp))%2==0)
                System.out.println("divisible by 2");
        char ch='a'+1;
        System.out.println(ch);
        String second="abcde";
        String first="abcde";
        int i=4;
        int A[]={1,2,3,4};
        System.out.println(A.length);
        int tem=second.indexOf(first.charAt(i));
                    second=second.substring(0,tem)+'$'+second.substring(tem+1);
                    System.out.println(second);
        String str="I eat rice";
        String my="I eat Rice";
        if(str.contains(my))
            System.out.println("yes");
        else 
            System.out.println("No");
        
              if(str.equals(my))
                  System.out.println("match");
              String [] strings = new String [] {"1", "2" };
        List<String> stringList = new ArrayList<String>(Arrays.asList(strings));
        stringList.remove("1");
        System.out.println(stringList);
    }
}
