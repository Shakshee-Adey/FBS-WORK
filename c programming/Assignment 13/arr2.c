#include<stdio.h>
void main()
{
	int *ptr;
	ptr=(int*)malloc(sizeof(int)*6);
	int i;
	for(i=0; i<6; i++)
	{
		scanf("%d",&ptr[i]);
	}
	printf("print the array : [ ");
	for(i=0; i<6; i++)
	{
		printf("%d ",ptr[i]);
		if(i<5)
		{
			printf(", ");
		}
	}
	printf(" ]\n");
}
