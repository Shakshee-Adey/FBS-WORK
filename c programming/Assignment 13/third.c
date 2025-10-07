#include<stdio.h>
int* somefun();
void main()
{
	int*str;
   str=somefun();
   int i;
   for(i=0; i<5; i++)
   {
   	scanf("%d",&str[i]);
   	printf("%d ",str[i]);
   }
   
}
int*somefun()
{
	int* arr=(int*)malloc(sizeof(int)*5);
	return arr;
}
