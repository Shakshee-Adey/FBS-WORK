#include<stdio.h>
void prime(int,int,int,int);
void main()
{
	int n,i; //n=range
	printf("enter a n term of :");
	scanf("%d",&n);
	int j,flag;
	prime(n,i,j,flag);
}
void prime(int n, int i, int j, int flag)
{
	for(i=2; i<=n; i++)
	{
	    flag=0;
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
