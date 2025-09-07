#include<stdio.h>
int number(int);
void main()
{
	int k=1;
 int res = number(k);
 printf("%d",res);	
}//main end here
int number(int k)
{
	while(k<=10)
	{
		k++;
	}
	return k;
}
