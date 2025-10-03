#include<stdio.h>
struct admin
{
  int id;
  char ename[20];
  double salary;
  double allowance;	
};
void storevalue(struct admin*,int);
void displayvalue(struct admin*,int);
void main()
{
	struct admin arr[5];
	storevalue(arr,5);
	displayvalue(arr,5);
}
void storevalue(struct admin*arr,int size)
{
	int i;
	printf("enter a values :- \n");
	for(i=0; i<size; i++)
	{
	   scanf("%d",&arr[i].id);
	   scanf("%s",arr[i].ename);
	   scanf("%2f",&arr[i].salary);
	   scanf("%2f",&arr[i].allowance);
	}
}
void  displayvalue(struct admin*arr,int size)
{
	int i;
	for(i=0; i<size; i++)
	{
	printf("id = %d\n ename = %s\n salary = %lf\n  allowance= %2f\n", arr[i].id, arr[i].ename, arr[i].salary, arr[i].allowance);
    }
}
