#include<stdio.h>
void main()
{
	int n=125,r1,r2,r3,q1,rev;
	r1= n%10;
	q1= n/10;
	r2= q1%10;
	r3= q1/10;
	
	rev=r1*100+r2*10+r1;
	if(n == rev)
	{
		printf("no. is palindrome");
	}
	else
	{
		printf("not palindrome");
	}
	
	
}
