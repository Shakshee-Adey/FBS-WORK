#include<stdio.h>

int sum();
int avarage();
void main()
{
	
	int avg = avarage(total);
	printf("%d",avg);
} // main end here

int sum()
{
    int a,b,c,d,e;
	printf("enter number a:\n");
	scanf("%d",&a);
	printf("enter number b:\n");
	scanf("%d",&b);
	printf("enter number c:\n");
	scanf("%d",&c);
	printf("enter number d:\n");
	scanf("%d",&d);
	printf("enter number e:\n");
	scanf("%d",&e);
	int total= sum(a,b,c,d,e);
	int add = a+b+c+d+e;
return add;
}

//avg start here
int avarage()
{
   int avg =total/5;
return avg;
}
