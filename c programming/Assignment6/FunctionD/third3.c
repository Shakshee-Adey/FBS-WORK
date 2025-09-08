#include<stdio.h>
int sumof(int, int,int);
void main()
{
  int start=1,end=5,sum=0;
  int s = sumof(start,end,sum);
  printf("%d",s);
}
int sumof(int start,int end, int sum)
{
   while(start<=end)
   {
   	sum=sum+start;
   	start++;
   }
   return sum;
}
