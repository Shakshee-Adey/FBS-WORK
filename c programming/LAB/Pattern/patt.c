#include<stdio.h>
void main()
{
	int i,j,n=9,k,l,f;
	for(i=n; i>=1; i--)
	{
		for(j=1; j<=i; j++)
		{
			printf(" ");
		}
		for(k=n; k>=i; k--)
		{
			printf("*");
		}
		for(l=n-1; l>=i; l--)
		{
			printf("*");
	    }
		
		printf("\n");
	}
}
