#include<stdio.h>
void vote(int*);
void main()
{
   int age;
   printf("enter a age :");
   scanf("%d",&age);
  vote(&age);
}
void vote(int* v)
{
   if(*v>=18)
   {
   	printf("person is eligible for vote");
   }
   else
   {
   	printf("not eligible for vote");
   }
}
