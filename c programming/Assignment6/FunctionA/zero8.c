#include<stdio.h>
void rectanglar();
void main()
{
  rectanglar();	
}
void rectanglar()
{
	int lenth=20, width=40;
	int perimeter;
	perimeter = 2*(lenth+width);
	printf("perimeter of rectanglar %d",perimeter);
}
