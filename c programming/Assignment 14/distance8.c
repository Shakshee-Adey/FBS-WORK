#include<stdio.h>
struct distance
{
  int feet;
  int inches;
};
void storevalue(struct distance*,int);
void displayvalue(struct distance*,int);
void main()
{
	struct distance arr[5];
	storevalue(arr,5);
	displayvalue(arr,5);
}
void storevalue(struct distance*arr,int size)
{
	int i;
	printf("enter a values :- \n");
	for(i=0; i<size; i++)
	{
	   scanf("%d",&arr[i].feet);
	   scanf("%d",&arr[i].inches);
	   
	}
}
void  displayvalue(struct distance*arr,int size)
{
	int i;
	printf("feet and inches :- \n");
	for(i=0; i<size; i++)
	{
	printf("%d,%d\n", arr[i].feet,arr[i].inches);
    }
}
