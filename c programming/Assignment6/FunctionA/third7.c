#include<stdio.h>
void strong();
void main()
{
	strong();
}
void strong()
{
	int temp;
	printf("enter a number \n");
	scanf("%d",&temp);
	int n;
	n=temp;
	int rem;
	int sum=0;
	while(n>0)
	{
		int fact=1, i;
		rem = n%10;
		for(i=1; i<=rem; i++)
		{
			fact=fact*i;
		}
		sum=sum+fact;
		n=n/10;
	}
	if(temp==sum)
	{
		printf("number is strong");
	}
	else
	{
		printf("number is not strong");
	}
}
