#include<stdio.h>
void main()
{
	int i,j,n=5,k;
	for(i=1; i<=n; i++)
	{
		for(j=n-1; j>=i; j--)
		{
			printf(" ");
		}
		for(k=1; k<=i; k++)
		{
			printf("*");
			
		}
		printf("\n");
	}
	for(i=4; i>=1; i--)
	{
		for(k=n-1; k>=i; k--)
		{
			printf(" ");
		}
		for(j=1; j<=i; j++)
		{
			printf("*");
		}
		
		printf("\n");
	}
}
