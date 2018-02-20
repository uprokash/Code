public class Reverse_word {
    
    public String reverse_each_word(String st)
    {
        int length=st.length();
        String[] res=st.split(" ");
        String result="";
        int i,j;
        for(i=res.length-1;i>=0;i--){
            for(j=0;j<res[i].length();j++)
                result+=res[i].charAt(j);
            result+=" ";
        }
        return result;
    }
    public String reverseLine(String st)
    {
        int length=st.length();
        int i;
        String res="";
        for(i=st.length()-1;i>=0;i--){
            res+=st.charAt(i);
        }
        return res;
    }
    
    public static void main(String[] args) {
        String st="I love you";
        Reverse_word re=new Reverse_word();
        System.out.println(re.reverse_each_word(st));
        System.out.println(re.reverseLine(st));
        int i=10;
        String str=String.valueOf(10);
        System.out.println(str);
        System.out.println(str.length());
        Math.abs(i);
        
    }
}
