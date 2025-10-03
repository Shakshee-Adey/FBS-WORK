#include<stdio.h>
void primearray(int*,int, int);
void main()
{
	int n;
	printf("enter size of array : \n ");
	scanf("%d",&n);
	int arr[n];
	int i;
	primearray(arr,n,i);
}
void primearray(int*arr,int n, int i)
{
		printf("enter array element : ");
	for(i=0; i<n; i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("prime number: \n");
	for(i=0; i<n; i++)
	{
		int num= arr[i];
		int flag=1;
		int j;
		if(num<=1)
		{
			flag=0;
		}
		else
		{
			for(j=2; j<num; j++)
			{
				if(num%j==0)
				{
					flag=0;
					break;
				}
			}
		}
		if(flag==1)
	{
		printf("%d ",num);
	}
	}
}
