#include<stdio.h>
#include<conio.h>
#include <bits/stdc++.h>
using namespace std;
#define N 3
#define LEVEL 3
void printmatrix(int matrix[N][N]);
int row[] = {1,0,-1,0};
int col[] = {0,-1,0,1};
int MOVES=0;
int flag=0;
int check_goal(int matrix[N][N],int goal[N][N])
{
    int i=0,j=0,count=0;
    for(i=0;i<3;i++)
        for(j=0;j<3;j++)
            if(matrix[i][j]==goal[i][j])
                count++;
    if(count==9)
        return 1;
    else
        return 0;

}
void dfs(int matrix[N][N],int x, int y,int final[N][N],int level)
{
    int mov_x;
    int mov_y;


    int p1,p2,p3,p4,p5,p6,p7,p8,p9,q;

    if(matrix[2][2]==0 && level <LEVEL)
    {
        for(p9=1; p9<3; p9++)
        {
            int xx=p9%4;
            mov_x=row[xx]+x;
            mov_y=col[xx]+y;
            swap(matrix[x][y],matrix[mov_x][mov_y]);
            MOVES++;
            int goal=check_goal(matrix,final);

            printmatrix(matrix);
            printf("\n");
            if(goal==1){
                printf("goal found\n");
                flag=1;
                return ;
            }

            dfs(matrix,mov_x,mov_y,final,level+1);
            if(flag==1)
                break;
            swap(matrix[x][y],matrix[mov_x][mov_y]);
        }

    }


    else if(matrix[1][2]==0 && level <LEVEL)
    {
        for(p8=0; p8<3; p8++ )
        {
            int xx=p8%4;
            mov_x=row[xx]+x;
            mov_y=col[xx]+y;

            swap(matrix[x][y],matrix[mov_x][mov_y]);
             MOVES++;
            int goal=check_goal(matrix,final);
             printmatrix(matrix);
            printf("\n");
            if(goal==1){
                printf("goal found\n");
                flag=1;
                return ;
            }

            dfs(matrix,mov_x,mov_y,final,level+1);
            if(flag==1)
                break;
            swap(matrix[x][y],matrix[mov_x][mov_y]);
        }

    }


    else if(matrix[0][2]==0 && level <LEVEL)
    {
        for(p7=0; p7<2; p7++ )
        {
           int xx=p7%4;
            mov_x=row[xx]+x;
            mov_y=col[xx]+y;

            swap(matrix[x][y],matrix[mov_x][mov_y]);
             MOVES++;
            int goal=check_goal(matrix,final);
            printmatrix(matrix);
            printf("\n");
            if(goal==1){
                printf("goal found\n");
                flag=1;
                return ;
            }
            dfs(matrix,mov_x,mov_y,final,level+1);
            if(flag==1)
                break;
            swap(matrix[x][y],matrix[mov_x][mov_y]);
        }



    }

    else if(matrix[0][1]==0 && level <LEVEL)
    {
        for(p6=3; p6<6; p6++ )
        {
            int xx=p6%4;
            mov_x=row[xx]+x;
            mov_y=col[xx]+y;
            swap(matrix[x][y],matrix[mov_x][mov_y]);
             MOVES++;
            int goal=check_goal(matrix,final);
            printmatrix(matrix);
            printf("\n");
            if(goal==1){
                printf("goal found\n");
                flag=1;
                return ;
            }
            dfs(matrix,mov_x,mov_y,final,level+1);
            if(flag==1)
                break;
            swap(matrix[x][y],matrix[mov_x][mov_y]);
        }



    }

    else if (matrix[0][0]==0 && level<LEVEL)
    {
        for(p5=3; p5<5; p5++ )
        {
            int xx=p5%4;
            mov_x=row[xx]+x;
            mov_y=col[xx]+y;

            swap(matrix[x][y],matrix[mov_x][mov_y]);
             MOVES++;
            int goal=check_goal(matrix,final);
             printmatrix(matrix);
            printf("\n");
            if(goal==1){
                printf("goal found\n");
                flag=1;
                return ;
            }
            dfs(matrix,mov_x,mov_y,final,level+1);
            if(flag==1)
                break;
            swap(matrix[x][y],matrix[mov_x][mov_y]);
        }

    }

    else if(matrix[1][0]==0 && level<LEVEL)
    {
        for(p4=2 ; p4<5 ; p4++)
        {
            int xx=p4%4;
            mov_x=row[xx]+x;
            mov_y=col[xx]+y;
            //printf("%d   %d\n", x,y);
            swap(matrix[x][y],matrix[mov_x][mov_y]);
             MOVES++;
            int goal=check_goal(matrix,final);
             printmatrix(matrix);
            printf("\n");
            if(goal==1){
                printf("goal found\n");
                flag=1;
                return ;
            }
            dfs(matrix,mov_x,mov_y,final,level+1);
            if(flag==1)
                break;
            swap(matrix[x][y],matrix[mov_x][mov_y]);
        }

    }

    else if(matrix[2][0]==0 && level<LEVEL)
    {
        for(p3=2; p3<4; p3++)
        {
            mov_x=row[p3]+x;
            mov_y=col[p3]+y;
            //printf("%d   %d\n", mov_x, mov_y);
            swap(matrix[x][y],matrix[mov_x][mov_y]);
            MOVES++;
            int goal=check_goal(matrix,final);
             printmatrix(matrix);
            printf("\n");
            if(goal==1){
                printf("goal found\n");
                flag=1;
                return ;
            }
            dfs(matrix,mov_x,mov_y,final,level+1);
            if(flag==1)
                break;
            swap(matrix[x][y],matrix[mov_x][mov_y]);
        }

    }




    else if(matrix[2][1]==0 && level<LEVEL)
    {
        for(p2=1; p2<4; p2++)
        {
            mov_x=row[p2]+x;
            mov_y=col[p2]+y;
            swap(matrix[x][y],matrix[mov_x][mov_y]);
            MOVES++;
            int goal=check_goal(matrix,final);
             printmatrix(matrix);
            printf("\n");
            if(goal==1){
                printf("goal found\n");
                flag=1;
                return ;
            }
            dfs(matrix,mov_x,mov_y,final,level+1);
            if(flag==1)
                break;
            swap(matrix[x][y],matrix[mov_x][mov_y]);
        }

    }

    else if(matrix[1][1]==0 && level<LEVEL)
    {
        for(p1=0; p1<4; p1++)
        {
            mov_x=row[p1]+x;
            mov_y=col[p1]+y;
            swap(matrix[x][y],matrix[mov_x][mov_y]);
             MOVES++;
            int goal=check_goal(matrix,final);
             printmatrix(matrix);
            printf("\n");
            if(goal==1){
                printf("goal found\n");
                flag=1;
                return ;
            }
            dfs(matrix,mov_x,mov_y,final,level+1);
            if(flag==1)
                break;
            swap(matrix[x][y],matrix[mov_x][mov_y]);
        }

    }

}

void printmatrix(int matrix[N][N])
{
    for(int i=0; i<3; i++)
    {
        for(int j=0; j<3; j++)
        {
            printf("%d ",matrix[i][j]);
        }
        printf("\n");
    }
}

int main()
{
    int initial[N][N] =
    {
        {2,8,3},
        {1,6,4},
        {7,0,5}

    };
    int final[N][N]=
    {
        {2,8,3},
        {1,6,4},
        {7,5,0}
    };
    int x=2,y=1;
    dfs(initial,x,y,final,0);
    if(flag==1)
        printf("%d moves required",MOVES);
    else
        printf("Not found in %d levels",LEVEL);
    return 0;

}
