#include<stdio.h>
void temp(float* c);
void main()
{
	float c;
	printf("enter a number c: \n");
	scanf("%f",&c);
	temp(&c);
}
   void temp(float* f)
{
	float farenhight = (*f * 1.8)+32;
	printf("%f",farenhight);
}
