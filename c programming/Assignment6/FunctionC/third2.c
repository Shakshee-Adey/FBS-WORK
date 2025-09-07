#include<stdio.h>
void table(int ,int);
void main()
{
  int n=6,i=1;
  table(n,i);
}
void table(int n, int i)
{
   
   while(i<=10)
   {
   	printf("%d ",n*i);
   	i++;
   }
}
