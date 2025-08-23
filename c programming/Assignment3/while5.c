#include<stdio.h>
void main()
{
	int num=153;
	int rem,temp=num, sum=0;
	while(temp!=0)
	{
		rem=temp%10;
		sum=sum+rem*rem*rem;
		temp=temp/10;
	}
	if(num==sum)
	{
		printf("num is armstrong");
	}
	else
	{
		printf("num is not armstrong");
	}
}
