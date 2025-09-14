#include<stdio.h>
void main()
{
	int arr[6];
	int i;
	for(i=0; i<6; i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("print the array : [ ");
	for(i=0; i<6; i++)
	{
		printf("%d ",arr[i]);
		if(i<5)
		{
			printf(", ");
		}
	}
	printf(" ]\n");
}
