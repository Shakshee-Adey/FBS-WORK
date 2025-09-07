#include<stdio.h>
void area();    // declaration 
void main() // main start here
{
	area();  // function call
}           // main end here
void area()     //function defination
{
	float area, r;
	printf("enter a number r: ");
	scanf("%f",&r);
	area=3.14*r*r;
	printf("Area of circle %f",area);
}
