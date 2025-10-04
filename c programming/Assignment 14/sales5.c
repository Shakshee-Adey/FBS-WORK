#include<stdio.h>
struct salesManager
{
  int id;
  char ename[20];
  double salary;
  double incentive;	
  int target;
};
void storevalue(struct salesManager*,int);
void displayvalue(struct salesManager*,int);
void main()
{
	struct salesManager arr[5];
	storevalue(arr,5);
	displayvalue(arr,5);
}
void storevalue(struct salesManager*arr,int size)
{
	int i;
	printf("enter a values :- \n");
	for(i=0; i<size; i++)
	{
	   scanf("%d",&arr[i].id);
	   scanf("%s",arr[i].ename);
	   scanf("%lf",&arr[i].salary);
	   scanf("%lf",&arr[i].incentive);
	   scanf("%d",&arr[i].target);
	}
}
void  displayvalue(struct salesManager*arr,int size)
{
	int i;
	printf("id,name,salary,incentive,target :- \n");
	for(i=0; i<size; i++)
	{
	printf("%d,%s,%lf,%lf,%d\n", arr[i].id, arr[i].ename, arr[i].salary, arr[i].incentive, arr[i].target);
    }
}
