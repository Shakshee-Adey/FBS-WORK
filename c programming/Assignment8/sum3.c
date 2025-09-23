#include<stdio.h>
void main()
{
	int arr[6];
	int i;
	int sum=0;
	for(i=0; i<6; i++)
	{
		scanf("%d",&arr[i]);
		sum= sum+arr[i];
	}
	  printf("%d",sum);
	
}
