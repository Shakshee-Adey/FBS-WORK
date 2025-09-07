#include<stdio.h>
void parcentage(int,int,int,int,int);
void main()
{
	int a,b,c,d,e;
	printf("enter a : \n");
	scanf("%d",&a);
	printf("enter b : \n");
	scanf("%d",&b);
	printf("enter c : \n");
	scanf("%d",&c);
	printf("enter d : \n");
	scanf("%d",&d);
	printf("enter e : \n");
	scanf("%d",&e);
   parcentage(a,b,c,d,e);
}
void parcentage(int f, int g, int h, int i, int j)
{
	int totalmarks = f+g+h+i+j;
	printf("total marks is = %d\n",totalmarks);
	int parcentage = totalmarks/5;
	printf("parcentage is = %d",parcentage);
}
