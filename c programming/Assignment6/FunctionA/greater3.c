#include<stdio.h>
void greatest();
void main()
{
	greatest();
}
void greatest()
{
	int a,b,c;
	printf("enter a number a: \n");
	scanf("%d",&a);
	printf("enter a number b: \n");
	scanf("%d",&b);
	printf("enter a number c: \n");
	scanf("%d",&c);
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
