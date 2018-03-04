#include <stdio.h>
#include <string.h>
int maximum_palindromic_subsequence_len(char a[],int low,int high)
{
    int temp1,temp2;
    if(low==high)
        return 1;
    if (a[low] == a[high] && low + 1 == high)
     return 2;

    else if(a[low]==a[high])
    {
        return maximum_palindromic_subsequence_len(a,low+1,high-1)+2;
    }
    else if(a[low]!=a[high])
    {
        temp1=maximum_palindromic_subsequence_len(a,low+1,high);
        temp2=maximum_palindromic_subsequence_len(a,low,high-1);
        return temp1>temp2?temp1:temp2;
    }

}
int main()
{
    int i,j,k;
    char a[100];
    while(true)
    {
        gets(a);
        j=strlen(a);
        i=maximum_palindromic_subsequence_len(a,0,j-1);
        printf("%d\n",i);
        printf("minimum number of deletions to make it palindrome %d",j-i);
    }

    return 0;
}
