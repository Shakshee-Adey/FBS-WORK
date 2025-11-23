//Average of array
#include<stdio.h>
void main()
{
	int n;
	printf("enter array size :- ");
	scanf("%d",&n);
	int arr[n];
	int sum=0;
	printf("\nenter array element :- ");
	int i;
	for(i=0; i<n; i++)
	{
		scanf("%d",&arr[i]);
	}
	for(i=0; i<n; i++)
	{
		sum=sum+arr[i];
	}
	printf("\nsum of array is :- %d ",sum);
	int avg = sum/n;
	printf("\navg of array is :- %d ",avg);
	
	
}
