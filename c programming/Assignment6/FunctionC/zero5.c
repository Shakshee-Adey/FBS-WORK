#include<stdio.h>
void avarage(int,int,int,int,int);
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
   avarage(a,b,c,d,e);
}
void avarage(int f, int g, int h, int i, int j)
{
	int sum= f+g+h+i+j;
	printf("sum is = %d\n",sum);
	int avrage = sum/5;
	printf("avrage is = %d",avrage);
}
