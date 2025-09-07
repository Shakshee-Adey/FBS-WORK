#include<stdio.h>
void swap(int ,int, int);
void main()
{
	int a=2,b=90,temp;
    swap(a,b,temp);
}
void swap(int a ,int b, int temp)
{
	temp=a;
	a=b;
	b=temp;
	printf("before swaping a is 2 and after swaping a is %d\n",a);
	printf("before swaping b is 90 and after swaping b is %d",b);
}
