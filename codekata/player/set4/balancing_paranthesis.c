#include <stdio.h>

int main()
{
    char str[20],c1=0,c2=0;
    scanf("%s",str);
    for(int i=0;str[i]!='\0';i++)
    {
        if(str[i]=='(')
        {
            c1++;
        }
        else if(str[i]==')')
        {
            c2++;
        }
    }
if(c1==c2)
{
    printf("yes");
}
else
{
    printf("no");
}
    return 0;
}
