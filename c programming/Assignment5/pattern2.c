#include<stdio.h>
void main(){
	int i,j;
	int n=5;
	for(i=1; i<=n; i++)
	{
		for(j=1; j<=i; j++)
		{
			printf("*");
		}
		printf("\n");
	}
}
