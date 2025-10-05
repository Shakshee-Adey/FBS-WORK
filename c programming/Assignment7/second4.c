#include<stdio.h>
void mark(int*);
void main()
{
	int marks;
	printf("enter a marks: \n");
	scanf("%d",&marks);
	mark(&marks);
}
void mark(int* marks)
{
	
	if(*marks>=75)
	{
		printf("distinction");
	}
	else
	{
		if(*marks>=65)
		{
			printf("first class");
		}
		else
		{
			if(*marks>=55)
			{
				printf("second class");
			}
			else
			{
				if(*marks>=40)
				{
					printf("pass class");
				}
				else
				{
					if(*marks<40)
					{
						printf("fail");
					}
					else
					{
						printf("invalid marks");
					}
				}
			}
		}
	}
}
