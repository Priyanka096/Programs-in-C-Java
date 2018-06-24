#include <stdio.h>
int main()
{
    int arr[20][20],n,count=0;
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            scanf("%d",&arr[i][j]);
        }
    }
    for(int i=0;i<n;i++)
   {
       for(int j=0;j<n;j++)
       {
           if(arr[i][j]==1)
           {
           if((arr[i][j-1]==0)&&(arr[i][j+1]==0)&&(arr[i-1][j]==0)&&(arr[i+1][j]==0))
           {
               count++;
           }
           }
       }
   }
   printf("%d",count);
    return 0;
}
