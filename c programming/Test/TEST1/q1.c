#include<stdio.h>
void main()
{
	int e;
	printf("enter a electricity : \n");
	scanf("%d",&e);
	if(1<=e<=50)
	{
		printf("rates is 30 rs/unit");
	}
	else
	{
		if(51<=e<=150)
		{
			printf("rate is 40 rs/unit");
		}
		else
		{
			if(150<e)
			{
				printf(" 50 unit");
			}
		}
	}
}
