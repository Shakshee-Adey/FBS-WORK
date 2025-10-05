#include<stdio.h>
void sum(int*, int* , int*, int*, int*, int*);
void avg(int*);
int a,b,c,d,e,add;
void main()
{
	printf("enter before swaping a , b, c, d, e : \n");
	scanf("%d %d %d %d %d",&a,&b,&c,&d,&e);
	sum(&a,&b,&c,&d,&e,&add);
	avg(&add);
}
void sum(int*a, int*b , int*c, int*d, int*e, int*res)
{
    *res = *a+*b+*c+*d+*e;
   printf("%d",*res);
}
void avg(int* add)
{
	int avg= *add/5;
	printf("%d",avg);
}
