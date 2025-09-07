#include<stdio.h>
void sumof(int, int,int);
void main()
{
  int start=1,end=5,sum=0;
  sumof(start,end,sum);
}
void sumof(int start,int end, int sum)
{
   while(start<=end)
   {
   	sum=sum+start;
   	start++;
   }
   printf("sum is %d",sum);
}
