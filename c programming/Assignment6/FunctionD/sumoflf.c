#include<stdio.h>
int sumofd(int);
void main()
{
	int s;
	printf("enter a number \n");
	scanf("%d",&s);
	int res = sumofd(s);
	printf("%d",res);
}// main end here
// function start here
   int sumofd(int l)
{
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
    
