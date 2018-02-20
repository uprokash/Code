
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SumFromFile {
    public static int sum() throws FileNotFoundException
    {
        Scanner sc=new Scanner(new File("sample.txt"));
        int temp,sum=0;
        while(sc.hasNext()){
            temp=sc.nextInt();
            sum+=temp;
        }
        return sum;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br=new BufferedReader(new FileReader("sample.txt"));
        char ch;
        int c,sum=0;
        
        while((c=br.read())!=-1){
            System.out.println(c);
            br.read();
            br.read();
            c-=48;
            sum+=c;
        }
        System.out.println("sum ="+sum);
        System.out.println(sum());
    }
    
}
