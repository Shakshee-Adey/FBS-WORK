#include<stdio.h>
int evenodd();
void main()
{
	int res = evenodd();
	if(res==1)
	{
		printf("even");
	}
	else
	{
		printf("odd");
	}
}
 int evenodd( )
 {
 	int c;
	printf("enter a number: \n");
	scanf("%d",&c);
 	if(c%2==0)
	{
	 return 1;
	}
	else
	{
	 return 0;
	}
 }
