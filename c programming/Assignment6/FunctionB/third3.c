#include<stdio.h>
int sumof();
void main()
{
  
  int s = sumof();
  printf("%d",s);
}
int sumof()
{
	int start=1,end=5,sum=0;
   while(start<=end)
   {
   	sum=sum+start;
   	start++;
   }
   return sum;
}
