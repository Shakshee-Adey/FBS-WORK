#include<stdio.h>
void prime();
void main()
{
  prime();
}
void prime()
{
   int n=7,i=2, flag=0;
   while(i<=n/2)
   {
   	if(n%i==0)
   	{
   		flag=1;
   		break;
    }
   	i++;
   }
   if(flag==0)
   {
   	printf("number is prime");
   }
   else
   {
   	printf("not prime");
   }
}
