#include<stdio.h>
void main()
{
	int arr[10];
	int i;
	printf("enter a number : \n");
	for(i=0; i<10; i++)
	{
		scanf("%d ",&arr[i]);
	}
	for(i=0; i<10; i++)
	{
		printf("%d ",arr[i]);
	}
}
