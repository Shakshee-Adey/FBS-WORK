#include<stdio.h>
void main()
{
	int n=6, i=1, sum=0; 
	while(i<n)
	{
		if(n%i==0)
		{
			sum=sum+i;
		}
		i++;
	}
	if(n==sum)
	{
		printf("no. is perfact");
	}
	else
	{
		printf("not perfact");
	}
}
