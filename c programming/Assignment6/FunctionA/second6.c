#include<stdio.h>
void divisible();
void main()
{
	divisible();
}
void divisible()
{
  	int n;
  	printf("enter a number: \n");
  	scanf("%d",&n);
  	
  	if(n%3==0&&n%5==0)
  	{
  		printf("number is divisible by both\n");
	}
	else
	{
		if(n%3==0)
		{
			printf("number is divisible by 3\n");
		}
		else
		{
			if(n%5==0)
			{
				printf("divisible by 5\n");
			}
			else
			{
				printf("divisible by none\n");
			}
			
		}
	}
}
