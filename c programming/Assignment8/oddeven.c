#include<stdio.h>
void main()
{
	int n;
	printf("enter a number : \n");
	scanf("%d",&n);
	int arr[n];
	int i;
	printf("enter element in array : \n");
	for(i=0; i<n; i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("even element in array : ");
	for(i=0; i<n; i++)
	{
	if(arr[i] % 2 == 0)
	 printf("%d ",arr[i]);
    }
    printf("\n");
    printf("odd element in array : ");
    for(i=0; i<n; i++)
	{
	if(arr[i] % 2 != 0)
	 printf("%d ",arr[i]);
    }
    printf("\n");

}
