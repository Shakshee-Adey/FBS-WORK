#include<stdio.h>
int palindrome(int , int,int);
void main()
{
	int n;
	printf("enter a number : \n");
	scanf("%d",&n);
	int lastd,firstd;
	int result = palindrome(n,lastd,firstd);
	if(result==1)
	{
		printf("number is palindrome");
	}
	else
	{
		printf("number is not palindrome");
	}
}
int palindrome(int n, int lastd, int firstd)
{
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
