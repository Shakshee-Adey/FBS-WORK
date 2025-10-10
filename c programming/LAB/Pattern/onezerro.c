#include<stdio.h>
void main()
{
	int n=5,i,j;
	for(i=1; i<=n; i++)
	{
		for(j=1; j<=n; j++)
		{
			if(j%2!=0)
			{
				printf("1");
			}
			else
			{
				printf("0");
			}
		}
		printf("\n");
	}
}
