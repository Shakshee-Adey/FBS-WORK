#include<stdio.h>
int leapyear(int);
void main()
{
	int year;
	printf("enter a number: \n");
	scanf("%d",&year);
	int res = leapyear(year);
	if(res==1)
	{
		printf("year is leap ");
	}
	else
	{
		printf("not leapyear");
	}
}
 int leapyear(int v )
 {
	if(v%4==0&&v%100!=0||v%400==0)
	{
	 return 1;
	}
	else
	{
	 return 0;
	}
 }
