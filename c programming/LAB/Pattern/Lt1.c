#include<stdio.h>
void main()
{
	int i=1,n=5,j,k,l;
	for(i=1; i<=n; i++)
	{
		for(k=n-1; k>=i; k--)
		{
			printf(" ");
		}
		for(j=1; j<=i; j++)
		{
			printf("%d",j);
		}
		for(l=2; l<=i-1; l++)
		{
			printf("%d",i);
		}
		printf("\n");
	}
	
}
