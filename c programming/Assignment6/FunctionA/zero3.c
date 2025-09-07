#include<stdio.h>
void temprature();    // declaration 
void main() // main start here
{
	temprature();  // function call
}           // main end here
void temprature()     //function defination
{
	float f, c;
	printf("enter a number c: ");
	scanf("%f",&c);
	f =(c*1.8)+32;
	printf("temprature of farenheit %f",f);
}
