#include<stdio.h>
void main()
{
	int n=15,i,j;
	for(i=1; i<=n; i++)
	{
		for(j=1; j<=n; j++)
		{
			if(i==1||j==1||j==n||i==n||i==j||i+j==n+1&&i<n/2||j==n/2+1||i==n/2+1)
			printf("*");
			else
			printf(" ");
		}
	printf("\n");
    }
}
