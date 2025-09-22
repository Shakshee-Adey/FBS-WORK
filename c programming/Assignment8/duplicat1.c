#include<stdio.h>
void main()
{
	int n;
	printf("enter array size :- \n");
	scanf("%d",&n);
	int arr[n];
	printf("enter array element in array :- \n");
	int i;
	for(i=0; i<n; i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("duplicate element in array :- \n");
	for(i=0; i<n; i++)
	{
		int j;
		for(j=i+1; j<n; j++)
		{
			if(arr[i]==arr[j])
			{
				printf("%d ",arr[i]);
				break;
			}
		}
	}
}
