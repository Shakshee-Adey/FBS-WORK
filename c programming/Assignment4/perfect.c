#include<stdio.h>
void main()
{
	int j,n,sum;
	printf("enter a number n:");
	scanf("%d",&n);
	for(j=1; j<=n; j++)
	{
		int i,sum=0;
		for(i=1; i<j; i++)
		{
		if(j%i==0)
		{
			sum=sum+i;
		}
	    }
		if(sum==j)
		printf("perfact number = %d\n ",j);
	}
}
