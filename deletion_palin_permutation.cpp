//Minimum removal to make palindrome permutation
#include <stdio.h>
#include <string.h>
int main()
{
    int i,j;
    char str[100];
    int counter[26],count=0;
    memset(counter, 0, sizeof(counter));
    gets(str);
    j=strlen(str);
    for(i=0;i<j;i++)
    {
        counter[str[i]-97]++;
    }
    for(i=0;i<26;i++)
    {
        if(counter[i]%2!=0)
            count++;
    }
    printf("Minimum removal to make palindrome permutation %d",(count == 0) ? 0 : count-1);
    return 0;
}

