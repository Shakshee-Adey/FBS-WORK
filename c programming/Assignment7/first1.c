#include<stdio.h>
void evenodd(int*);
void main()
{
	int a;
	printf("enter a : \n");
	scanf("%d",&a);
   evenodd(&a);
}
void evenodd(int* a)
{
	if(*a%2==0)
	{
		printf("number is even");
	}
	else
	{
		printf("number is odd");
	}
}
