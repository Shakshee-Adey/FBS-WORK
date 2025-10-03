#include<stdio.h>
void search(int*,int,int,int);
void main()
{
	int arr[6];
	printf("enter array element : ");
	int i;
	int n;
	search(arr,6,i,n);
}
void search(int*arr,int size,int i,int n)
{
		for(i=0; i<size; i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("print the array element : [ ");
	for(i=0; i<size; i++)
	{
		printf("%d ",arr[i]);
	}
	printf(" ] \n");
		printf("enter the array element you want to search : \n");
	scanf("%d",&n);
	int index=-1;
	for(i=0; i<size; i++)
	{
		if(arr[i]==n)
		{
		index=i;
		break;
	    }
	}
	if(index==-1)
	{
		printf("number not found ");
	}
	else
	{
		printf("number found at %d index",index);
	}
	
}
