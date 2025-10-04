#include<stdio.h>
struct date
{
  int date;
  int month;
  int year;
};
void storevalue(struct date*,int);
void displayvalue(struct date*,int);
void main()
{
	struct date arr[5];
	storevalue(arr,5);
	displayvalue(arr,5);
}
void storevalue(struct date*arr,int size)
{
	int i;
	printf("enter a values :- \n");
	for(i=0; i<size; i++)
	{
	   scanf("%d",&arr[i].date);
	   scanf("%d",&arr[i].month);
	   scanf("%d",&arr[i].year);
	}
}
void  displayvalue(struct date*arr,int size)
{
	int i;
	printf("date, month ,year :- \n");
	for(i=0; i<size; i++)
	{
	printf("%d,%d,%d\n", arr[i].date, arr[i].month, arr[i].year);
    }
}
