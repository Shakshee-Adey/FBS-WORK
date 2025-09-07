#include<stdio.h>
float area();    // declaration
void main()
{
	float a;     // call
	a = area();
	printf("%f",a);
}
float area()      // defination
{
	float b=12,area;
	area=3.14*b*b;
	return area;
}
