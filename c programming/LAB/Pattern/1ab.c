#include<stdio.h>
void main()
{
	int n=6 ; //2,3,6
	for(i=1; i<=n; i++)
	{
		if(n%i==0)
		{
			sum=sum+i;
		}
	}
	if(sum==n)
	{
		printf("number is perfact");
	}
	else
	{
		printf("number is not perfact");
	}
		
	
}
