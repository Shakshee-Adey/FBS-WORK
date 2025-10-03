#include<stdio.h>
void maxmin(int*,int);
void main()
{
	int arr[6];
	maxmin(arr,6);
}
void maxmin(int* ptr, int size)
{
	int i;
	for(i=0; i<6; i++)
	{
		scanf("%d",&ptr[i]);
	}
	int max = ptr[0];
	int min = ptr[0];
	for(i=1; i<6; i++)
	{
		if(max<ptr[i])
			max = ptr[i];
		if(min>ptr[i])
		    min = ptr[i];
	}
	printf("maximam value is : %d\n",max);
	printf("minimam value is : %d",min);
}
