#include<stdio.h>
void main()
{
	float basics=6000;
	float da,ta,hra,totalsal;
	
	if(basics<=5000)
	{
		da=basics*0.10;
		ta=basics*0.20;
		hra=basics*0.25;
		printf("da=%f ta=%f hra=%f",da , ta, hra);
	}
	else
	{
		da=basics*0.15;
		ta=basics*0.25;
		hra=basics*0.30;
		printf("da=%f ta=%f hra=%f\n",da,ta,hra);
	}
	totalsal=da+ta+hra+basics;
	printf("total salary is %f",totalsal);
}
