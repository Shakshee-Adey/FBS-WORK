#include<stdio.h>
struct employee
{
  int eid;
  char ename[20];
  double salary;	
};
void storevalue(struct employee*,int);
void displayemployee(struct employee*,int);
void main()
{
	struct employee arr[5];
	storevalue(arr,5);
	displayemployee(arr,5);
}
void storevalue(struct employee*arr,int size)
{
	int i;
	printf("enter a values :- \n");
	for(i=0; i<size; i++)
	{
	   scanf("%d",&arr[i].eid);
	   scanf("%s",arr[i].ename);
	   scanf("%lf",&arr[i].salary);
	}
}
void  displayemployee(struct employee*arr,int size)
{
	int i;
	for(i=0; i<size; i++)
	{
	printf("eid = %d\n,ename = %s\n,salary = %lf\n", arr[i].eid,arr[i].ename,arr[i].salary);
    }
}
