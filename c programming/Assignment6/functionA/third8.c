#include<stdio.h>
void factorial();
void main()
{
	factorial();
}
void factorial()
{
	int n;
	printf("enter a number \n");
	scanf("%d",&n);
	int fact=1;
	while(n>1)
	{
		fact=fact*n;
		n--;
	}
	printf("factorial %d",fact);
}
