#include<stdio.h>
void main()
{
	int n=145,temp=n,rem,fact,sum=0,i;
	while(temp!=0)
	{
	    fact=1;
		rem=temp%10;
		i=1;
		while(i<=rem)
	    {
		 fact=fact*i;
		 i++;
		}
	    sum=sum+fact;
	    temp=temp/10;
	    
	}
	if(n==sum)
	{
	 printf("no is strong");	
	}
	else
	{
	 printf("no is not strong");
	}
}
