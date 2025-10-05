#include<stdio.h>
void year(int*);
void main()
{   
    int yea;
   printf("enter a year :");
   scanf("%d",&yea);
   year(&yea);
}
void year(int* y)
{
   if(*y%4==0&&*y%100!=0||*y%400==0)
   {
   	printf("year is leap");
   }
   else
   {
   	printf("not leap year");
   }
   
}
