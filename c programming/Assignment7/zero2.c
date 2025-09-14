#include<stdio.h>
void circle(float*);
void main()
{
	float r;
	printf("enter a number : \n");
	scanf("%f",&r);
	
	circle(&r);
}
void circle(float*s)
{
	float area = 3.14 *  *s *  *s;
	printf("%f",area);
}
