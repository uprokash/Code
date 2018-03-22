/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Uchchhwas
 */
public class NQueen {
    
    int N;

    public NQueen() {
        N=7;
    }
    
    public boolean isSafe(int board[][],int row,int col)
    {
        int i,j;
        for(i=0;i<N;i++)
            if(board[row][i]==1)
                return false;
        for (i=row, j=col; i>=0 && j>=0; i--, j--)
            if (board[i][j] == 1)
                return false;
 
        /* Check lower diagonal on left side */
        for (i=row, j=col; j>=0 && i<N; i++, j--)
            if (board[i][j] == 1)
                return false;
        return true;
    }
    public boolean NQueenSolve(int board[][],int col)
    {
        if(col==N)
            return true;
        for(int i=0;i<N;i++)
        {
            if(isSafe(board, i, col))
            {
                board[i][col]=1;
                if(NQueenSolve(board, col+1))
                    return true;
                board[i][col]=0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        NQueen nq=new NQueen();
        int board[][] = new int[nq.N][nq.N];
        if(nq.NQueenSolve(board, 0)==false)
        {
            System.out.println("Solution not possible");
        }
        for(int i=0;i<nq.N;i++)
        {
            for(int j=0;j<nq.N;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
