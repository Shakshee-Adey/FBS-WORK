#include<stdio.h>
void year();
void main()
{
  year();
}
void year()
{
   int year;
   printf("enter a year :");
   scanf("%d",&year);
   if(year%4==0&&year%100!=0||year%400==0)
   {
   	printf("year is leap");
   }
   else
   {
   	printf("not leap year");
   }
   
}
