#include<stdio.h>
void main(){
	int i,j;
	int n=5;
	for(i=1; i<=n; i++)
	{
		for(j=1; j<=n; j++)
		{
			if(i==1||i==j||i==n||j==1||j==n)
			{
				printf("*");
			}
			else
			{
				printf(" ");
			}
		}
		printf("\n");
	}
}
