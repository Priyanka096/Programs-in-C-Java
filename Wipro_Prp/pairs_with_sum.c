#include <stdio.h>
int main()
{
    int n,arr[20],sum,count=0;
    printf("Enter the number of elements in an array:");
    scanf("%d",&n);
    printf("Enter the array elements:");
    for(int i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("Enter the sum to find the pairs:");
    scanf("%d",&sum);
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(arr[i]+arr[j]==sum)
            {
                printf("(%d,%d)",arr[i],arr[j]);
                count++;
            }
        }
    }
    if(count==0)
    {
        printf("-1");
    }
    return 0;
}
