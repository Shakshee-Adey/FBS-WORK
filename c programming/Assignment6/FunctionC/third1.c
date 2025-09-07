#include<stdio.h>
void number(int);
void main()
{
	int i=1;
  number(i);
}
void number(int i)
{
   while(i<=10)
   {
   	printf("%d ",i);
   	i++;
   }
}
