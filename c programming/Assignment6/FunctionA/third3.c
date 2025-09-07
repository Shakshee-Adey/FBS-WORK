#include<stdio.h>
void sumof();
void main()
{
  sumof();
}
void sumof()
{
   int start=1,end=5,sum=0;
   while(start<=end)
   {
   	sum=sum+start;
   	start++;
   }
   printf("sum is %d",sum);
}
