#include<stdio.h>
struct hr
{
  int id;
  char ename[20];
  double salary;
  double commission;	
};
void storevalue(struct hr*,int);
void displayvalue(struct hr*,int);
void main()
{
	struct hr arr[5];
	storevalue(arr,5);
	displayvalue(arr,5);
}
void storevalue(struct hr*arr,int size)
{
	int i;
	printf("enter a values :- \n");
	for(i=0; i<size; i++)
	{
	   scanf("%d",&arr[i].id);
	   scanf("%s",arr[i].ename);
	   scanf("%lf",&arr[i].salary);
	   scanf("%lf",&arr[i].commission);
	}
}
void  displayvalue(struct hr*arr,int size)
{
	int i;
	printf("id,name,salary,commision :- \n");
	for(i=0; i<size; i++)
	{
	printf("%d,%s,%lf,%lf\n", arr[i].id, arr[i].ename, arr[i].salary, arr[i].commission);
    }
}
