#include<stdio.h>
void tringle(int,int);
void main()
{
	int hight,base;
	printf("enter hight : \n");
	scanf("%d",&hight);
	printf("enter base : \n");
	scanf("%d",&base);
   tringle(hight,base);
}
void tringle(int h, int b)
{
	float area= 0.5*h*b;
	printf("tringle of area = %f\n",area);
}
