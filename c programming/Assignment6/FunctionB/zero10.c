#include<stdio.h>
int a,b,c,d,e ;  //global variable
int sum;
int add();
int marks();
void main()
{
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
	sum= add();
	printf("%d",sum);
	int percentage = marks();
	printf("percentage is = %d",percentage);
}

int add()
{
	return a+b+c+d+e;
}

int marks()
{
	return sum/5;
}
