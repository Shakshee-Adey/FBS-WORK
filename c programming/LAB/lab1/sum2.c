#include<stdio.h>
void main()
{
	int n=123456;
	int sum=0, r;
	while(n>0)
	{
		r=n%10;
		sum=sum+r;
		n=n/10;
		
	}
	printf("%d",sum);
}
