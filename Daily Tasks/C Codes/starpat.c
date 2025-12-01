#include<stdio.h>
void main()
{
	int n=6,i,j;
	
	for(i=1; i<n; i++)
	{
	 for(j=n; j>i; j--)
	 {
	 	printf("*");
	 }
	 printf("\n");
   }
  
}
