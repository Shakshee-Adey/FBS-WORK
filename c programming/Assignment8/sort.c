#include<stdio.h>
void main()
{
	int s1;
	printf("enter a  1 size :- \n");
	scanf("%d",&s1);
	int arr[s1];
	int i;
	printf("enter element in array arr :- \n ");
	for(i=0; i<s1; i++)
	{
		scanf("%d",&arr[i]);
	}
	// sorting
	for(i=0; i<s1-1; i++)
	{
		int j;
		for(j=0; j < s1-i-1; j++)
		{
			if(arr[j]>arr[j+1])
			{
				int temp= arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		
	}
	printf("sorted array : ");
	for(i=0; i<s1; i++)
	{
		printf("%d ",arr[i]);
	}
}
