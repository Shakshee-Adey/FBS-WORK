#include<stdio.h>
void strong(int*,int*,int*,int*,int*,int*);
void main()
{
	int temp;
	printf("enter a number \n");
	scanf("%d",&temp);
	int n;
	int rem;
	int sum=0;
	int fact=1, i;
	strong(&temp,&n,&rem,&sum,&fact,&i);
}
void strong(int* temp,int* n, int* rem, int*sum,int* fact,int* i)
{
	*n=*temp;
	while(*n>0)
	{
		*fact=1, *i;
		*rem = *n%10;
		for(*i=1; *i<=*rem; *i++)
		{
			*fact=*fact* *i;
		}
		*sum=*sum+*fact;
		*n=*n/10;
	}
	if(*temp==*sum)
	{
		printf("number is strong");
	}
	else
	{
		printf("number is not strong");
	}
}
