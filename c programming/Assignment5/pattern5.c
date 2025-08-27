#include<stdio.h>
void main(){
	int i,j,k;
	int n=5;
	for(i=1; i<=n; i++)
	{
		for(j=n-1; j>=i; j--)
		{
			printf(" ");
		}
		for(k=1; k<=i; k++)
		{
			printf(" *");
		}
		printf("\n");
	}
}
