#include<stdio.h>
void main()
{
	int n=5;
	int i,j;
	for(i=1; i<n; i++)
	{
	  for(j=n; j>i; j--)
	  {
	  	if(i%2==0)
	  	{
	  		printf("s");
		  }
		else
		{
			printf("h");
		}
	  }
	printf("\n");
    }
}
