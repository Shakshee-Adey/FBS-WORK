#include<stdio.h>
void armstrong();
void main()
{
	armstrong();
}
void armstrong()
{
	int j,n;
	printf("enter a number n:");
	scanf("%d",&n);
	
	for(j=1; j<=n; j++)
	{
		int count=0;
		int temp=j;
		while(temp>0)
		{
			count++;
			temp=temp/10;
		}
		int sum=0,rem;
		temp=j;
		while(temp>0)
		{
			rem=temp%10;
			int result=1,i;
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
