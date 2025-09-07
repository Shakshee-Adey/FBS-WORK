#include<stdio.h>
void factorial(int,int);
void main()
{
	int n;
	printf("enter a number \n");
	scanf("%d",&n);
	int fact=1;
	factorial(n,fact);
}
void factorial(int n,int fact)
{
	while(n>1)
	{
		fact=fact*n;
		n--;
	}
	printf("factorial %d",fact);
}
