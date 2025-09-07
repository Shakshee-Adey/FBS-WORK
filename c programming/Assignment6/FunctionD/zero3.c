#include<stdio.h>
float farenhight(float);
void main()
{
	float c;
	printf("enter a number \n ");
	scanf("%f",&c);
	
    float f = farenhight(c);
	printf("%f",f);
}
float farenhight(float s)
{
	
  return (s*1.8)+32;
}
 
