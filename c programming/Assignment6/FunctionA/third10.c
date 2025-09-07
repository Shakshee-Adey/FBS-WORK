#include<stdio.h>
void palindrome();
void main()
{
	palindrome();
}
void palindrome()
{
	int n;
	printf("enter a number : \n");
	scanf("%d",&n);
	int lastd,firstd;
	lastd=n%10;
	while(n>0)
	{
		firstd=n%10;
		n=n/10;
	}
	if(lastd==firstd)
	{
		printf("number is palindrome");
	}
	else
	{
		printf("number is not palindrome");
	}
}
