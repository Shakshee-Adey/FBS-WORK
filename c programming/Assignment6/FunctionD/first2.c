#include<stdio.h>
int palindrome(int);
void main()
{
	int c;
	printf("enter a number: \n");
	scanf("%d",&c);
	int res = palindrome(c);
	if(res==1)
	{
		printf("number is palindrome ");
	}
	else
	{
		printf("not palindrome");
	}
}
 int palindrome(int v )
 {
	int lastd=v%10;
	int firstd;
	while(v>0)
	{
		firstd=v%10;
		v=v/10;
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
