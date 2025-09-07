#include<stdio.h>
int perimeter();
void main()
{
  int rectangle = perimeter();
  printf("rectangle of parameter is %d",rectangle);
}
 int perimeter()
 {
 	int lenth , width ;
	printf("enter a lenth \n");
	scanf("%d",&lenth);
	printf("enter a width \n");
	scanf("%d",&width);
 	return 2*(lenth+width);
 }
