#include<stdio.h>
void strong();
void main()
{
	strong();
}
void strong()
{
	int num, n,sum;
	printf("enter a range n : ");
	scanf("%d",&n);
	
	for(num=1; num<=n; num++)
	{
		int temp=num;
		int sum=0;
		int rem;
		while(temp>0)
		{
			rem=temp%10;
			int fact=1;
			int i;
			for(i=1; i<=rem; i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			temp=temp/10;
		}
	if(sum==num)
	{
		printf("number is strong %d\n",num);
	}
   }
}
