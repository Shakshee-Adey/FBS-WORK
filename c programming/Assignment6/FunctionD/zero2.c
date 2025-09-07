#include<stdio.h>
float circle(float);
void main()
{
	float r;
	printf("enter a number r \n ");
	scanf("%f",&r);
	
	float area = circle(r);
	printf("area is %f ",area);
}
float circle(float x)
{
	float area = 3.14*x*x;
	return area;
}
