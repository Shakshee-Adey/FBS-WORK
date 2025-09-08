#include<stdio.h>
int sumofd();
void main()
{
	int res = sumofd();
	printf("%d",res);
}// main end here
// function start here
   int sumofd()
{
	int l;
	printf("enter a number \n");
	scanf("%d",&l);
    int lastd,firstd;
	int sum;
	lastd=l%10;
	while(l>0)
	{
		firstd=l%10;
		l=l/10;
	}
	sum=lastd+firstd;
	return sum;
}
