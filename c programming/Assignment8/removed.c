#include<stdio.h>
void main()
{
	int n,i;
	printf("enter array size :- \n");
	scanf("%d",&n);
	int arr[n];
	printf("enter array element :- \n");
	for(i=0; i<n; i++)
	{
		scanf("%d",&arr[i]);
	}
	print("duplicate element :- ");
	for(i=0; i<n; i++)
	{
		int j;
		for(j=i+1; j<n; j++)
		{
			if(arr[i]==arr[j])
			printf("%d ",arr[i]);
			break;
		}
	}
}
