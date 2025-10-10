#include<stdio.h>
void main()
{
	int n=9,i,j;
	for(i=1; i<=5; i++)
	{
		for(j=1; j<=n; j++)
		{
			if(i==j||i+j==n+1)
			{
				printf("*");
			}
			else
			{
				printf(" ");
			}
		}
		printf(" \n");
	}
}
