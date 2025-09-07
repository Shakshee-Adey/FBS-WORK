#include<stdio.h>
void evenodd();
void main()
{
  evenodd();
}
void evenodd()
{
   int n;
   printf("enter a number n :");
   scanf("%d",&n);
   if(n%2==0)
   {
   	printf("number is even");
   }
   else
   {
   	printf("number is odd");
   }
}
