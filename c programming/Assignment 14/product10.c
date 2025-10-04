#include<stdio.h>
struct product
{
  int id;
  char ename[20];
  int quantity;	
  float price;
};
void storevalue(struct product*,int);
void displayvalue(struct product*,int);
void main()
{
	struct product arr[5];
	storevalue(arr,5);
	displayvalue(arr,5);
}
void storevalue(struct product*arr,int size)
{
	int i;
	printf("enter a values :- \n");
	for(i=0; i<size; i++)
	{
	   scanf("%d",&arr[i].id);
	   scanf("%s",arr[i].ename);
	   scanf("%d",&arr[i].quantity);
	   scanf("%f",&arr[i].price);
	}
}
void  displayvalue(struct product*arr,int size)
{
	int i;
	printf("id,name,salary,incentive,target :- \n");
	for(i=0; i<size; i++)
	{
	printf("%d,%s,%d,%f\n", arr[i].id, arr[i].ename, arr[i].quantity, arr[i].price);
    }
}
