#include<stdio.h>
void vote();
void main()
{
  vote();
}
void vote()
{
   int age;
   printf("enter a age :");
   scanf("%d",&age);
   if(age>=18)
   {
   	printf("person is eligible for vote");
   }
   else
   {
   	printf("not eligible for vote");
   }
}
