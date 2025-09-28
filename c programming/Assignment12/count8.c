#include<stdio.h>
#include<string.h>
void main()
{
	char str[]= "shaksheeadey";
	int i=0;
	int count=0;
	while(str[i]!= '\0')
	{
		count++;
		i++;
	}
	printf("count is %d",count);
}
