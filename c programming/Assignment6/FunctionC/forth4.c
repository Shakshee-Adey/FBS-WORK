#include<stdio.h>
void strong(int,int,int,int,int,int,int);
void main()
{
	int num, n,sum;
	printf("enter a range n : ");
	scanf("%d",&n);
	int temp;
		int rem;
		int fact;
			int i;
	strong(num,n,sum,temp,rem,fact,i);
}
void strong(int num,int n, int sum,int temp, int rem, int fact,int i)
{
	
	for(num=1; num<=n; num++)
	{
		temp=num;
		sum=0;
		while(temp>0)
		{
			rem=temp%10;
			fact=1;
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
