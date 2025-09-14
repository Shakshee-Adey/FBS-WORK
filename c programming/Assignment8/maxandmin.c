#include<stdio.h>
void main()
{
	int arr[6];
	int i;
	for(i=0; i<6; i++)
	{
		scanf("%d",&arr[i]);
	}
	int max = arr[0];
	int min = arr[0];
	for(i=1; i<6; i++)
	{
		if(max<arr[i])
			max = arr[i];
		if(min>arr[i])
		    min = arr[i];
	}
	printf("maximam value is : %d\n",max);
	printf("minimam value is : %d",min);
	
}
