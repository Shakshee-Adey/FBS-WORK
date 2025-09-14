#include<stdio.h>
void swap(int*a, int*b);
void main()
{
	int a,b;
	printf("enter before swaping a and b : ");
	scanf("%d%d",&a,&b);
	swap(&a,&b);
	
}
void swap(int*a, int*b)
{
   int temp=*a;
	*a=*b;
	*b=temp;
	printf("after swaping a = %d and b = %d", *a , *b );
}
