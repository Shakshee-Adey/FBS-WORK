#include<stdio.h>
int minit ;
	
int hour();
int rminit();
void main()
{
	printf("enter a minit \n");
	scanf("%d",&minit);
	int h = hour();   //function call
	printf("hour is %d\n",h);
	int r = rminit(); //function call
	printf("minit is %d",r);
}//main end here
int hour()
{
	return minit/60;
}
//hour function end here
int rminit()
{
	return minit%60;
}
