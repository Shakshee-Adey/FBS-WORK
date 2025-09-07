#include<stdio.h>
void armstrong(int ,int,int,int,int,int,int,int);
void main()
{
	int j,n;
	printf("enter a number n:");
	scanf("%d",&n);
	int count;
		int temp;
		int sum,rem;
		int result,i;
	armstrong(j,n,count,temp,sum,rem,result,i);
}
void armstrong(int j, int n,int count, int temp,int sum, int rem, int result,int i)
{
	//int j,n;
	//printf("enter a number n:");
	//scanf("%d",&n);
	
	for(j=1; j<=n; j++)
	{
		count=0;
		 temp=j;
		while(temp>0)
		{
			count++;
			temp=temp/10;
		}
		sum=0;
		temp=j;
		while(temp>0)
		{
			rem=temp%10;
			result=1;
		for(i=1; i<=count; i++)
		{
			result=result*rem;
		}
			sum=sum+result;
			temp=temp/10;
     	}
     	if(sum==j)
     	{
     		printf("%d\n",j);
		 }
		
	}
}
