#include<stdio.h>
void prime(int ,int,int);
void main()
{
   int n=7,i=2, flag=0;
  prime(n,i,flag);
}
void prime(int n, int i, int flag)
{
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
