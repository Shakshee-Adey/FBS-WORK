#include<stdio.h>
void main()
{
	int a=5, i=1, fact=1;
	while(i<=5)
	{
	  fact=fact*i;
	  i++;	
	}
	printf("fact = %d",fact);
}
