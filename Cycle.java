
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Cycle {
    int visited[],n,flag=0;

    public Cycle(int n) {
        visited=new int[n];
    
    }
    
    public void find_cycle(int [][]graph,int goal,int source){
        
        visited[source]=1;
        for(;;)
        {
            
        }
    }
    public int countPaths(int [][]graph,int n)
    {
        
        return 0;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("input.txt"));
        int n,m,i,j;
        n=sc.nextInt();
        m=sc.nextInt();
        int [][]graph=new int[n][n];
        
        
        while(sc.hasNextInt()){
            i=sc.nextInt();
            j=sc.nextInt();
            graph[i][j]=1;
        }
        Cycle cycle=new Cycle(n);
        int source=0;
        cycle.countPaths(graph,n);
        cycle.find_cycle(graph,n,0);
        
    }
    
}
