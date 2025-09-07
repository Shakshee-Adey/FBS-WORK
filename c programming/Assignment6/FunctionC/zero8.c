#include<stdio.h>
void ractangle(int,int);
void main()
{
	int a,b;
	printf("enter a : \n");
	scanf("%d",&a);
	printf("enter b : \n");
	scanf("%d",&b);
   ractangle(a,b);
}
void ractangle(int f, int g)
{
	int perimeter= 2*(f+g);
	printf("rectangle of perimeter = %d\n",perimeter);
	int area = f*g;
	printf("rectangle of area = %d",area);
}
