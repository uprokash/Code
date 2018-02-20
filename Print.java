public class Print {
    public static void main(String[] args) {
        int i,j,n=10,flag=0;
        for(i=1;i>=1;)
        {
            System.out.print(i+" ");
            if(i==n)
                flag=1;
            if(flag==0)
                i++;
            if(flag==1)
                i--;
        }
    }
}
