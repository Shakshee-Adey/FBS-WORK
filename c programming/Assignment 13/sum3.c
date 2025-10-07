#include<stdio.h>
int*sumas();
void main()
{
	int *ptr;
    ptr= sumas();
	int i;
	int sum=0;
	for(i=0; i<6; i++)
	{
		scanf("%d",&ptr[i]);
		sum= sum+ptr[i];
	}
	  printf("%d",sum);
}
int*sumas()
{
	int*arr=(int*)malloc(sizeof(int)*6);
	return arr;
}

