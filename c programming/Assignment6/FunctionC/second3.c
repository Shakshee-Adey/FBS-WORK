#include<stdio.h>
void greatest(int,int,int);
void main()
{
	int a,b,c;
	printf("enter a number a: \n");
	scanf("%d",&a);
	printf("enter a number b: \n");
	scanf("%d",&b);
	printf("enter a number c: \n");
	scanf("%d",&c);
	greatest(a,b,c);
}
void greatest(int a, int b, int c)
{
	if(a>b)
	{
		if(a>c)
		{
			printf("a is greater");
		}
		else
		{
			printf("c is greater");
		}
	}
	else
	{
		if(b>c)
		{
			printf("b is greater");
		}
		else
		{
			printf("c is greater");
		}
	}
}
