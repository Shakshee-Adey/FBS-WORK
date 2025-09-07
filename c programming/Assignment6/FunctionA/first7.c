#include<stdio.h>
void bsalary();
void main()
{
  bsalary();
}
void bsalary()
{
   double bsalary,da,ta,hra,tsalary;
   printf("enter a bsalary :\n");
   scanf("%lf",&bsalary);
   if(bsalary<=5000)
   {
   	da=bsalary*0.10;
   	ta=bsalary*0.20;
   	hra=bsalary*0.25;
   }
   else
   {
   	da=bsalary*0.15;
   	ta=bsalary*0.25;
   	hra=bsalary*0.30;
   }
   tsalary=bsalary+da+ta+hra;
   printf("totalsalary is %lf",tsalary);
}
