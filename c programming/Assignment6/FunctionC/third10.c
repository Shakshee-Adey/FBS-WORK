#include<stdio.h>
void palindrome(int , int,int);
void main()
{
	int n;
	printf("enter a number : \n");
	scanf("%d",&n);
	int lastd,firstd;
	palindrome(n,lastd,firstd);
}
void palindrome(int n, int lastd, int firstd)
{
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
