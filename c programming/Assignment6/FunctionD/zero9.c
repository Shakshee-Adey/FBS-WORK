#include<stdio.h>
double area(double,double);
void main()
{
	double base , hight ;
	printf("enter a base \n");
	scanf("%lf",&base);
	printf("enter a hight \n");
	scanf("%lf",&hight);
	
	double tringle = area(base,hight);
	printf("tringle of area is = %.2lf",tringle);
}
//main end here
double area(double b, double h)
{
	return 0.5*b*h;
}
