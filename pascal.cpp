#include <stdio.h>
int main()
{
    int n,i,j;
    scanf("%d",&n);
    int a[n][n+1];
    for(i=0;i<n;i++)
    {
        for(j=0;j<=i;j++){
            if(j==0||j==i)
            {
                a[i][j]=1;
                printf("%d ",a[i][j]);
            }
            else if(i>1)
            {
                a[i][j]=a[i-1][j-1]+a[i-1][j];
                printf("%d ",a[i][j]);
            }

        }
        printf("\n");
    }
}
