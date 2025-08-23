#include<stdio.h>
void main()
{
	int a=297;
	int sum=0 ,r,r1,r2,temp=a;
	r=temp%10;
	sum=sum+r;
	temp=temp/10;
	r1=temp%10;
	sum=sum+r1;
	r2=temp/10;
	sum=sum+r2;
	printf("%d",sum);
}

