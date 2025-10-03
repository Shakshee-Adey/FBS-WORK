#include<stdio.h>
void storefirst(int*, int);
void storesecond(int*, int);
void storeboth(int*,int*,int*,int);
void main()
{
	int s;
	printf("enter array size :- \n");
	scanf("%d",&s);
	int arr[s];
	int brr[s];
	int crr[s];
	storefirst(arr,s);
	storesecond(brr,s);
	storeboth(arr,brr,crr,s);
}
void storefirst(int*arr, int size)
{
	int i;
	printf("enter first array element :- \n");
	for(i=0; i<size; i++)
	{
		scanf("%d",&arr[i]);
	}
}
void storesecond(int*brr, int size)
{
	printf("enter second array element :- \n");
	int i;
	for(i=0; i<size; i++)
	{
		scanf("%d",&brr[i]);
	}
	printf("sum arrays :- \n");
}
void storeboth(int*arr,int*brr,int*crr,int size)
{	
int i;
	for(i=0; i<size; i++)
	{
		crr[i]= arr[i] + brr[i];
		printf("%d ",crr[i]);
	}
}
	
