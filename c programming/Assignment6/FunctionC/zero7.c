#include<stdio.h>
void time(int);
void main()
{
	int totalminit;
	printf("enter total minit : \n");
	scanf("%d",&totalminit);
   time(totalminit);
}
void time(int tm)
{
	int hour= tm/60;
	printf("hour is = %d\n",hour);
	int Rminit = tm%60;
	printf("rimaning minit is = %d",Rminit);
}
