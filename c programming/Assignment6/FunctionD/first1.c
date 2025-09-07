#include<stdio.h>
int evenodd(int);
void main()
{
	int c;
	printf("enter a number \n");
	scanf("%d",&c);
	int res = evenodd(c);
	if(res==1)
	{
		printf("even");
	}
	else
	{
		printf("odd");
	}
}
 int evenodd(int v)
 {
 	if(v%2==0)
	{
	 return 1;
	}
	else
	{
	 return 0;
	}
 }
