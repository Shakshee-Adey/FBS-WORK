#include<stdio.h>
void person();
void main()
{
	person();
}
void person()
{
	int age;
	printf("enter a number : \n");
	scanf("%d",&age);
	
	if(age<12)
	{
		printf("child");
	}
	else
	{
		if(12<=age&&age<=19)
		{
			printf("teenager");
		}
		else
		{
			if(20<=age&&age<=59)
			{
				printf("Adult");
			}
			else
			{
				if(age>=60)
				{
					printf("senior");
				}
				else
				{
					printf("invalid age");
				}
			}
		}
	}
}
