#include<stdio.h>
double area();
void main()
{
	double tringle = area();
	printf("tringle of area is = %.2lf",tringle);
}
//main end here
double area()
{
	double base , hight ;
	printf("enter a base \n");
	scanf("%lf",&base);
	printf("enter a hight \n");
	scanf("%lf",&hight);
	return 0.5*base*hight;
}
