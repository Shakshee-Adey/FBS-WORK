#include<stdio.h>
int leapyear();
void main()
{
	int res = leapyear();
	if(res==1)
	{
		printf("year is leap ");
	}
	else
	{
		printf("not leapyear");
	}
}
 int leapyear( )
 {
 	int year;
	printf("enter a number: \n");
	scanf("%d",&year);
	if(year%4==0&&year%100!=0||year%400==0)
	{
	 return 1;
	}
	else
	{
	 return 0;
	}
 }
