#include<stdio.h>
void sqrcub(int);
void main()
{
	int a;
	printf("enter a : \n");
	scanf("%d",&a);
   sqrcub(a);
}
void sqrcub(int f)
{
	int squre= f*f;
	printf("squre is = %d\n",squre);
	int cube = f*f*f;
	printf("cube is = %d",cube);
}
