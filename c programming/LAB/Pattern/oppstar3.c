#include<stdio.h>
void main()
{
	int i,j,n=5;
	for(i=1; i<=5; i++)
	{
		for(j=5; j>=i; j--)
		{
			printf("*");
		}
		printf("\n");
	}
}
