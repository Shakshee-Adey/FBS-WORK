#include<stdio.h>
int add(int , int);
void main()
{
	int a,b;
	printf("enter a number a \n ");
	scanf("%d",&a);
	printf("enter a number b \n ");
	scanf("%d",&b);
	int res = add(a,b);
	printf("result is %d ",res);
}
int add(int x, int y)
{
	return x+y;
}
