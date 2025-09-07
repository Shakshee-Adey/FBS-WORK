#include<stdio.h>
void sqr();  // function declaration
void main()
{
  sqr();	// call
}
void sqr()  // defination
{
	int b=30,sqr,cube;
	sqr= b*b;
	printf("squre = %d\n",sqr);
	cube= b*b*b;
	printf("cube = %d\n",cube);
	
}
