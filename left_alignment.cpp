#include <stdio.h>
#include <string.h>
int main()
{
    char sample[100],res[100];
    int c;
    FILE *file;
    int i=0,j=0,si,length,temp=0;
    file = fopen("test.txt", "r");
    if (file)
    {
        while ((c = getc(file)) != EOF){
            putchar(c);
            sample[i++]=c;
        }
        sample[i]='\0';
        fclose(file);
    }
    printf("\n");
    scanf("%d",&si);
    length=strlen(sample);
    for(i=0,j=0;i<length;i++,j++)
    {
        if(sample[i]!=' ')
            temp++;
        else
            temp=0;

        if(j==si&&sample[i]==' '){
            res[j]='\0';
            printf("from 1st\n");
            printf("%s\n",res);
            j=-1;
        }
        else if(j==si)
        {
            j-=temp;
            res[j]='\0';
            i-=temp;
            printf("from 2nd\n");
            printf("%s\n",res);
            j=-1;
        }
        else if(sample[i+1]=='\0')
        {
            res[j]=sample[i];
            res[j+1]='\0';
            printf("from 3rd\n");
            printf("%s",res);
        }
        else
            res[j]=sample[i];


    }
    return 0;

}
