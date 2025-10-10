#include<stdio.h>
void main()
{
	int i,j,k,n=5;
	for(i=1; i<=n; i++) //outer loop for rows
	{
		for(j=5; j>=i; j--) //first inner loop for space
		{
			printf("*");
		}
		for(k=n-1; k<=i; k++) // printing star
		{
			printf(" ");
		}
		printf("\n");
	}
}
