#include<stdio.h>
void prime();
void main()
{
	prime();
}
void prime()
{
	int n,i; //n=range
	printf("enter a n term of :");
	scanf("%d",&n);
	for(i=2; i<=n; i++)
	{
	   int j,flag=0;
		for(j=2; j<i; j++)
		{
		if(i%j==0)
		{
			flag=1;
			break;
		}
	}
		if(flag==0)
			printf("%d ",i);
		
	}
}
