#include<stdio.h>
int hour(int);
int rminit(int);
void main()
{
	int minit ;
	printf("enter a minit \n");
	scanf("%d",&minit);
	
	int h = hour(minit);   //function call
	printf("hour is %d\n",h);
	int r = rminit(minit); //function call
	printf("minit is %d",r);
}//main end here
int hour(int m)
{
	return m/60;
}
//hour function end here
int rminit(int minit)
{
	return minit%60;
}
