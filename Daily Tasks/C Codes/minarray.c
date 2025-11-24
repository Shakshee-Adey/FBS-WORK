#include<stdio.h>
void main()
{
	int n;
	printf("enter array size :- \n");
	scanf("%d",&n);
	int arr[n];
	int i;
	printf("enter array element :- ");
	for(i=0; i<n; i++)
	{
		scanf("%d",&arr[i]);
	}
	int min =arr[0];
	for(i=0; i<n; i++)
	{
		if(min>arr[i])
		{
			min=arr[i];
		}
	}
	printf("%d",min);
}
