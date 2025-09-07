#include<stdio.h>
int sum();    // declaration
void main()
{
	int a;     // call
	a = sum();
	printf("%d",a);
}
int sum()      // defination
{
	int b=12,c=13,sum;
	sum= b+c;
	return sum;
}
