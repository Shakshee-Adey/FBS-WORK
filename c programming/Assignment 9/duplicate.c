#include<stdio.h>
void duplicate(int*,int,int,int );
void main()
{
	int n;
	printf("enter array size :- \n");
	scanf("%d",&n);
	int arr[n];
	int j,i;
	duplicate(arr,n,j,i);
}
void duplicate(int*arr,int n,int j, int i)
{
	printf("enter array element in array :- \n");
	for(i=0; i<n; i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("duplicate element in array :- \n");
	for(i=0; i<n; i++)
	{
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
