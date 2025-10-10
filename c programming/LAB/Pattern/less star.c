#include<stdio.h>
void main()
{
	int i,j,n=9;
	for(i=5; i>=1; i--)
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
		printf("\n");
	}
}
