#include<stdio.h>
void main(){
	int i,j,k=7;
	int n=4;
	for(i=1; i<=7; i++)
	{
		for(j=1; j<=i; j++)
		{
			if(j==1||i==n)
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
