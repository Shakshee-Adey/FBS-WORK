#include<stdio.h>
void main()
{
	int i,j,n=5,k;
	for(i=5; i>=1; i--)
	{
		for(j=1; j<=i; j++)
		{
			printf("*");
		}
		for(k=n-1; k>=i; k--)
		{
			printf(" ");
		}
		printf("\n");
	}	
	
	}
