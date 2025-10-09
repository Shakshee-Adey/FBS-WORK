#include<stdio.h>
void main()
{
	int n;
	printf("enter number n: \n ");
	scanf("%d",&n);
	if(n>0)
	{
		printf("number is positive");
	}
	else
	{
		if(n<0)
		{
			printf("number is negetive");
		}
		else
		{
			if(n==0)
			{
			printf("number is zero");	
			}
			else
			{
				printf("invalid number");
			}
			
		}
	}
}
