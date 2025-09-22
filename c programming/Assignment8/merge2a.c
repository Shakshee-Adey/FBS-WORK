#include<stdio.h>
void main()
{
	int s1, s2;
	printf("enter a  1 size :- \n");
	scanf("%d",&s1);
	printf("enter a  2 size :- \n");
	scanf("%d",&s2);
	int arr[s1];
	int brr[s2];
	int s3 = s1+s2;
	int crr[s3];
	int i;
	printf("enter element in array arr :- \n ");
	for(i=0; i<s1; i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("\n");
	printf("enter element in array brr :- \n ");
	for(i=0; i<s2; i++)
	{
		scanf("%d",&brr[i]);
	}
	for(i=0; i<s1; i++)
	{
		crr[i]=arr[i];
	}
	int itr1, itr2=i;  // itr1= 0 itr2 =i ka matlab h ki s1=i ki value jaha se khatm hui h matlan 5 index se brr ki vale save hogi
	for(itr1 =0; itr1<s2; itr1++)
	{
		crr[itr2]=brr[itr1];
		itr2++;
	}
	printf("\n");
	printf("marge two array :- \n");
	int j;
     for(j=0; j<s3; j++)
     {
     	printf("%d ",crr[j]);
	 }
}
