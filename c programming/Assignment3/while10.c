#include<stdio.h>
void main()
{
	int n=12345;
	int fd,ld,sum=0;
	ld=n%10;
	printf("last digit is %d\n",ld);
	while(n!=0)
	{
		fd=n%10;
		n=n/10;
	}
	printf("first digit is %d\n",fd);
	sum=ld+fd;
	printf("sum of last and first digit %d",sum);
}
