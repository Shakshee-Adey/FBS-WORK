#include<stdio.h>
void main()
{
	int s;
	printf("enter array size :- \n");
	scanf("%d",&s);
	int arr[s];
	int brr[s];
	int crr[s];
	int i;
	printf("enter first array element :- \n");
	for(i=0; i<s; i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("enter second array element :- \n");
	for(i=0; i<s; i++)
	{
		scanf("%d",&brr[i]);
	}
	printf("sum arrays :- \n");
	for(i=0; i<s; i++)
	{
		crr[i]= arr[i] + brr[i];
		printf("%d ",crr[i]);
	}
	
		
	
	
	
}
