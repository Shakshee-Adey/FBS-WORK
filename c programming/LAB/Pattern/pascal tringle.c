#include<stdio.h>
void main()
{
	int row;
	printf("enter row : \n");
	scanf("%d",&row);
	int i,j,n;
	for(i=0; i<row; i++)
	{
		int number= 1;
		
		for(n=0; n<row-i-1; n++)
		{
			printf("  ");
		}
		for(j=0; j<=i; j++)
		{
			printf("%4d",number);
			number= number*(i-j)/(j+1);
		}
		printf("\n");
	}
	
}
