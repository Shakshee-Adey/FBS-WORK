#include<stdio.h>
void main()
{
    int n;
    printf("enter of array size :- \n");
    scanf("%d",&n);
	int arr[n];
	int i;
	printf("scan array element in array : \n");
	for(i=0; i<n; i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("revers array : - \n");
	for(i=n-1; i>=0; i--)
	{
		printf("%d ",arr[i]);
	}
}
