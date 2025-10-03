#include<stdio.h>
void main()
{
	int * arr;
	arr=(int*)malloc(sizeof(int)*5);
	printf("enter a number : \n");
	int i;
	for(i=0; i<5; i++)
	{
		scanf("%d",&arr[i]);
	}
	for(i=0; i<5; i++)
	{
		printf("%d",arr[i]);
	}
}
