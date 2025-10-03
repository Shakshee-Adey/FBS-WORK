#include<stdio.h>
void storesum(int*, int);
void main()
{
	int arr[6];
	storesum(arr,6);
}
void storesum(int* ptr, int size)
{
	int i;
	int sum=0;
	for(i=0; i<6; i++)
	{
		scanf("%d",&ptr[i]);
		sum= sum+ptr[i];
	}
	  printf("%d",sum);
}
