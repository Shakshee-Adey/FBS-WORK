#include<stdio.h>
void add(int*,int*);
void main()
{
	int n,m;
	printf("enter a number n and m: \n");
	scanf("%d %d",&n,&m);
	add(&n,&m);
	
}
void add(int* n, int* m)
{
	int result= *n + *m;
	printf("result is = %d",result);
}
