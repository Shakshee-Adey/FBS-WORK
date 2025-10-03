#include<stdio.h>
void alternate(int*,int ,int);
void main()
{
	int n;
	printf("enter a number : \n");
	scanf("%d",&n);
	int arr[n];
	int i;
	alternate(arr,n,i);
	
}
void alternate(int*arr,int n,int i)
{
	printf("enter element in array : \n");
	for(i=0; i<n; i++)
	{
		scanf("%d",&arr[i]);
		printf("%d \n",arr[i]);
	}
	printf("alternate element in the array : \n");
	for(i=0; i<n; i=i+2)
	{

		printf("%d ",arr[i]);
	}
}
