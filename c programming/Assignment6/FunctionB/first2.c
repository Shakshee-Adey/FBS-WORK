#include<stdio.h>
int palindrome();
void main()
{
	int res = palindrome();
	if(res==1)
	{
		printf("number is palindrome ");
	}
	else
	{
		printf("not palindrome");
	}
}
 int palindrome( )
 {
 	int c;
	printf("enter a number: \n");
	scanf("%d",&c);
	int lastd=c%10;
	int firstd;
	while(c>0)
	{
		firstd=c%10;
		c=c/10;
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
