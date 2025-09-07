#include<stdio.h>
float farenhight();
void main()
{
	float f = farenhight();
	printf("%f",f);
}
float farenhight()
{
    float c;
	printf("enter a number \n ");
	scanf("%f",&c);	
   return (c*1.8)+32;
}
 
