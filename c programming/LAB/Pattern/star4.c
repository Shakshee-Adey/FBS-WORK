#include<stdio.h>
void main()
{
	int i,j,k,n=5;
	for(i=1; i<=n; i++)
	{
		for(j=4; j>=i; j--)
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
