#include<stdio.h>
int add(int,int,int,int,int);
int marks(int);
void main()
{
	int a,b,c,d,e ;
	printf("enter a \n");
	scanf("%d",&a);
	printf("enter b \n");
	scanf("%d",&b);
	printf("enter c \n");
	scanf("%d",&c);
	printf("enter d \n");
	scanf("%d",&d);
	printf("enter e \n");
	scanf("%d",&e);
	int sum= add(a,b,c,d,e);
	int percentage = marks(sum);
	printf("percentage is = %d",percentage);
}

int add(int a, int b, int c, int d, int e)
{
	return a+b+c+d+e;
}

int marks(int sum)
{
	return sum/5;
}
