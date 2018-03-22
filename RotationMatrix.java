/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Uchchhwas
 */
public class RotationMatrix {
    static void rotateMatrix(int N, int mat[][])
    {
        // Consider all squares one by one
        for (int x = 0; x < N / 2; x++)
        {
            // Consider elements in group of 4 in 
            // current square
            for (int y = x; y < N-x-1; y++)
            {
                // store current cell in temp variable
                int temp = mat[x][y];
      
                // move values from right to top
                mat[x][y] = mat[y][N-1-x];
      
                // move values from bottom to right
                mat[y][N-1-x] = mat[N-1-x][N-1-y];
      
                // move values from left to bottom
                mat[N-1-x][N-1-y] = mat[N-1-y][x];
      
                // assign temp to left
                mat[N-1-y][x] = temp;
            }
        }
    }
    
    public static void antiClockRotate(int matrix [][],int n)
    {
        int i,j;
        int temp[][]=new int[4][4];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                
                temp[i][j]=matrix[j][n-1-i];
            }
        }
        for( i=0;i<4 ;i++){
            for( j=0;j<4;j++)
                System.out.print(temp[i][j]+" ");
            System.out.println("");
        }
    }
    public static void clockWise(int matrix[][],int n)
    {
        int i,j;
        int temp[][]=new int[4][4];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                
                temp[i][j]=matrix[n-1-j][i];
            }
        }
        for( i=0;i<4 ;i++){
            for( j=0;j<4;j++)
                System.out.print(temp[i][j]+" ");
            System.out.println("");
        }

    }
    public static void main(String[] args) {
        int n=4;
     int mat[][] =
        {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        antiClockRotate(mat,n);
        clockWise(mat, n);
        //show(mat);
    }
    
}
