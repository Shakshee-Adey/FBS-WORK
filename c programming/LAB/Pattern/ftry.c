#include<stdio.h>
void main()
{
	int i,j, n=9;
	for(i=1; i<=n; i++)
	{
		for(j=1; j<=9; j++)
		{
			if(i==n||j==9||i+j==n+1)
			{
				printf("* ");
			}
			else
			{
				printf("  ");
			}
		}
		printf("\n");
	}
}
