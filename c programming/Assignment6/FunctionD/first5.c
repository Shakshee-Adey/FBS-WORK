#include<stdio.h>
int voting(int);
void main()
{
	int age;
	printf("enter a age: \n");
	scanf("%d",&age);
	int res = voting(age);
	if(res==1)
	{
		printf("person is eligible for vote ");
	}
	else
	{
		printf("not eligible for vote");
	}
}
 int voting(int age)
 {
	if(age>=18)
	{
	 return 1;
	}
	else
	{
	 return 0;
	}
 }
