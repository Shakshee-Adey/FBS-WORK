#include<stdio.h>
void perfact(int,int,int);
void main()
{
	int n;
	   printf("enter a number : \n");
	   scanf("%d",&n);
	   int sum=0,i=1;
	perfact(n,sum,i);
}
void perfact(int n,int sum,int i)
{
	   while(i<n)
	   {
	   	if(n%i==0)
	   	{
	   		sum=sum+i;
		}
		i++;
	   }
	   if(sum==n)
	   {
	   	printf("number is perfact");
	   }
	   else
	   {
	   	printf("number is not prfact");
		   }	
}
