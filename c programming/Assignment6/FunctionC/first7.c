#include<stdio.h>
void bsalary(double,double,double,double,double);
void main()
{
	double bsalar,da,ta,hra,tsalary;
   printf("enter a bsalary :\n");
   scanf("%lf",&bsalar);
  bsalary(bsalar,da,ta,hra,tsalary);
}
void bsalary(double bsalar,double da,double ta,double hra,double tsalary)
{
   
   if(bsalar<=5000)
   {
   	da=bsalar*0.10;
   	ta=bsalar*0.20;
   	hra=bsalar*0.25;
   }
   else
   {
   	da=bsalar*0.15;
   	ta=bsalar*0.25;
   	hra=bsalar*0.30;
   }
   tsalary=bsalar+da+ta+hra;
   printf("totalsalary is %lf",tsalary);
}
