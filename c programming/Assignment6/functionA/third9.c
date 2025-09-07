#include<stdio.h>
void lastfirstd();
void main()
{
	lastfirstd();
}
void lastfirstd()
{
	int n=1234;
	int lastd,firstd;
	int sum=0;
	lastd=n%10;
	while(n>0)
	{
		firstd= n%10;
		n=n/10;
	}
	sum= lastd+firstd;
	printf("%d",sum);
}
