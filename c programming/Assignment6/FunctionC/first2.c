#include<stdio.h>
void palindrome(int);
void main()
{
	int a;
	printf("enter a : \n");
	scanf("%d",&a);
   palindrome(a);
}
void palindrome(int a)
{
	int lastd=a/10;
	printf("last digit is %d\n",lastd);
	
	while(a>0){
	int firstd = a%10;
	a=a/10;
}
	printf("first digit is %d\n",firstd);
	if(lastd==firstd)
	{
		printf("number is palindrome");
	}
	else
	{
		printf("number is not palindrome");
	}
}
