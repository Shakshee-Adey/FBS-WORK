#include<stdio.h>
int sqr(int);
int cub(int);
void main()
{
	int a;
	printf("enter a number \n");
	scanf("%d",&a);
	
	int squre = sqr(a);
	printf("squre is %d\n",squre);
	int cube = cub(a);
	printf("cube is %d",cube);
}//main end here

int sqr(int b)
{
	return b*b;
}

//cube start here

int cub(int c)
{
	return c*c*c;
}
