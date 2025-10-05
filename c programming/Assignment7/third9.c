#include<stdio.h>
void lastfirstd(int*,int*,int*,int*);
void main()
{
	int n=1234;
	int lastd,firstd;
	int sum=0;
	lastd=n%10;
	lastfirstd(&n,&lastd,&firstd,&sum);
}
void lastfirstd(int* n, int* lastd, int* firstd, int* sum)
{
	
	while(*n>0)
	{
		*firstd= *n%10;
		*n=*n/10;
	}
	*sum= *lastd+*firstd;
	printf("%d",*sum);
}
