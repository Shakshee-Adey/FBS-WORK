#include<stdio.h>
void farenhight(float);
void main()
{
	float c;
	printf("enter a c : \n");
	scanf("%f",&c);
   farenhight(c);
}
void farenhight(float celcies)
{
	float farenhight = (celcies*1.8)+32;
	printf("%f",farenhight);
}
