#include<stdio.h>
int perimeter(int,int);
void main()
{
	int lenth , width ;
	printf("enter a lenth \n");
	scanf("%d",&lenth);
	printf("enter a width \n");
	scanf("%d",&width);
	
  int rectangle = perimeter(lenth,width);
  printf("rectangle of parameter is %d",rectangle);
}
 int perimeter(int l, int w)
 {
 	return 2*(l+w);
 }
