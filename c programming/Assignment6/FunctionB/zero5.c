#include<stdio.h>
int sqr();
int cub();
void main()
{
	
	int squre = sqr();
	printf("squre is %d\n",squre);
	int cube = cub();
	printf("cube is %d",cube);
}//main end here

int sqr()
{
	int a;
	printf("enter a number \n");
	scanf("%d",&a);
	return a*a;
}

//cube start here

int cub()
{
	int a;
	printf("enter a number \n");
	scanf("%d",&a);
	return a*a*a;
}
