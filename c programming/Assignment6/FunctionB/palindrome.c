#include<stdio.h>
int palindrome();
void main()
{
	int result = palindrome();
	if(result==1)
	{
		printf("number is palindrome");
	}
	else
	{
		printf("number is not palindrome");
	}
}
int palindrome()
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
		return 1;
	}
	else
	{
		return 0;
	}
}
