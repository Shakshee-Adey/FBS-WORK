#include<stdio.h>
void student(char, double, double);
void main()
{
	char isstudent = 'y';
	double price =7000;
	double totalprice;
	student(isstudent, price, totalprice);
}

void student(char isstudent, double price,double totalprice)
{
	
	if(isstudent=='y')
	{
		if(price<500)
		 totalprice= price-price*0.20;
		else
		 totalprice= price-price*0.10;
	}
	else
	{
		if(price>600)
		  totalprice = price-price*0.15;
		else
		  totalprice = price;
	}
	printf("the final price of customer is %lf",totalprice);
}
