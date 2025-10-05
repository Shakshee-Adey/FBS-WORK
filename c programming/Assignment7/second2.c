#include<stdio.h>
void tringle(int*,int*,int*);
void main()
{
	int a,b,c;
	printf("enter a number a: \n");
	scanf("%d",&a);
	printf("enter a number b: \n");
	scanf("%d",&b);
	printf("enter a number c: \n");
	scanf("%d",&c);
	tringle(&a,&b,&c);
}
void tringle(int* a,int* b, int* c)
{
	
	if(*a == *b && *b == *c)
	{
		printf("tringle is equivlant ");
	}
	else
	{
		if(*a == *b||*b == *c|| *a == *c)
		{
			printf("tringle is isoscalen ");
		}
		else{
		     if(*a!=*b!=*c)
		{
			printf("tringle is scalen ");
		}
	}
	}
}
