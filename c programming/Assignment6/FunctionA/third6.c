#include<stdio.h>
void perfact();
void main()
{
	perfact();
}
void perfact()
{
       int n;
	   printf("enter a number : \n");
	   scanf("%d",&n);
	   int sum=0,i=1;
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
