#include<stdio.h>
void sum(int,int);
void main()
{
	int a,b;
	printf("enter a number a:");
	scanf("%d",&a);
	printf("enter a number b:");
	scanf("%d",&b);
	sum(a,b);
}
 void sum(int x, int y)
 {
 	int res = x+y;
 	printf("result = %d", res);
 	
 }
