
import java.io.*;
import java.util.*;

// This class represents a directed graph using adjacency list
// representation
public class Cycle {

    private int V;   // No. of vertices
    int lastValue;
    boolean flag = false;
    // Array  of lists for Adjacency List Representation
    private LinkedList<Integer> adj[];
    int parent[];

    // Constructor

    Cycle(int v) {
        V = v;
        adj = new LinkedList[v];
        parent = new int[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList();
        }
    }

    //Function to add an edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w);  // Add w to v's list.
    }

    // A function used by DFS
    void DFSUtil(int v, boolean visited[], ArrayList gray, ArrayList black) {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v + " ");
        gray.add(v);
        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (gray.contains(n)) {
                System.out.println("Contains cycle");
                //System.out.println(v+" "+n);
                parent[n] = v;
                lastValue = n;
                flag = true;
                return;
            }
            if (!visited[n]) {
                parent[n] = v;
                DFSUtil(n, visited, gray, black);
            }
        }
        black.add(gray.remove((Integer) v));
    }

    // The function to do DFS traversal. It uses recursive DFSUtil()
    void DFS(int v) {
        // Mark all the vertices as not visited(set as
        // false by default in java)
        boolean visited[] = new boolean[V];
        ArrayList white = new ArrayList<Integer>();
        ArrayList black = new ArrayList<Integer>();
        // Call the recursive helper function to print DFS traversal
        DFSUtil(v, visited, white, black);
    }

    public static void main(String args[]) {
        Cycle g = new Cycle(9);

        g.addEdge(3, 5);
        g.addEdge(3, 1);
        g.addEdge(5, 4);
        g.addEdge(5,2);
        g.addEdge(2, 6);
        g.addEdge(4, 6);
        g.addEdge(6, 8);
        g.addEdge(7, 8);
        g.addEdge(1,7);
        
        
        

        for (int i = 1; i <= 8; i++) {
            System.out.println("Source = "+i);
            g.DFS(i);
            
            if (g.flag == true) {
                int parent = g.parent[g.lastValue];
                for (;g.lastValue != parent;) {
                    System.out.println(g.parent[parent] + " ");
                    parent = g.parent[parent];
                    
                }
            }
        }

    }
}
