#include<stdio.h>
void area(float);
void main()
{
	float  r;
	printf("enter a r: ");
	scanf("%f",&r);
	area(r);
}
 void area(float r)
 {
 	float res = 3.14*r*r;
 	printf("%f",res);
 }
