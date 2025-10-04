#include<stdio.h>
struct time
{
  int hour;
  int min;
  int second;
};
void storevalue(struct time*,int);
void displayvalue(struct time*,int);
void main()
{
	struct time arr[5];
	storevalue(arr,5);
	displayvalue(arr,5);
}
void storevalue(struct time*arr,int size)
{
	int i;
	printf("enter a values :- \n");
	for(i=0; i<size; i++)
	{
	   scanf("%d",&arr[i].hour);
	   scanf("%d",&arr[i].min);
	   scanf("%d",&arr[i].second);
	}
}
void  displayvalue(struct time*arr,int size)
{
	int i;
	printf("hour, minit ,second :- \n");
	for(i=0; i<size; i++)
	{
	printf("%d,%d,%d\n", arr[i].hour,arr[i].min, arr[i].second);
    }
}
