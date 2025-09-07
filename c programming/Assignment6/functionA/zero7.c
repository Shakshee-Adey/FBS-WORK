#include<stdio.h>
void minit();
void main()
{
  minit();	
}
void minit()
{
	int time;
	int hour ,minit;
	printf("enter a time : \n");
	scanf("%d",&time);
	hour=time/60;
	printf("hour = %d\n",hour);
	minit = time%60;
	printf("minit = %d",minit);
}
