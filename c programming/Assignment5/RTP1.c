#include<stdio.h>
void main()
{
	int i,j,n=5,k;
	for(i=1; i<=n; i++)
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
