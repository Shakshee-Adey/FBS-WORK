#include<stdio.h>
void main()
{
	int n,i;
	printf("enter a array size :-");
	scanf("%d",&n);
	int arr[n];
	printf("enter array element :- ");
	for(i=0; i<n; i++)
	{
		scanf("%d",&arr[i]);
	}
	//("sorting a array :- \n");
	for(i=0; i<n-1; i++)
	{
		int j;
		for(j=0; j<n-i-1; j++)
		{
			if(arr[j]>arr[j+1])
			{
				int temp= arr[j];
				arr[j]= arr[j+1];
				arr[j+1]= temp;
			}
		}
	}
	printf("sort array :- ");
	for(i=0; i<n; i++)
	{
		printf("%d ",arr[i]);
	}
	printf("\n");
	printf("second largest number in array is %d ",arr[n-2]);
}
