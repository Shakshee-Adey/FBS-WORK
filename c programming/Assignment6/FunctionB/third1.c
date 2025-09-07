#include<stdio.h>
int number();
void main()
{
  int i = number();
  printf("%d",i);
}
int number()
{
   int i,b;
   for(i=1; i<=10; i++)
   {
   	printf("%d ",i);
   }
      return i;
}
