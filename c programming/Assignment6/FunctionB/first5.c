#include<stdio.h>
int voting();
void main()
{
	
	int res = voting();
	if(res==1)
	{
		printf("person is eligible for vote ");
	}
	else
	{
		printf("not eligible for vote");
	}
}
 int voting()
 {
 	int age;
	printf("enter a age: \n");
	scanf("%d",&age);
	if(age>=18)
	{
	 return 1;
	}
	else
	{
	 return 0;
	}
 }
