#include<stdio.h>
#include<string.h>
void main()
{
	char str[]= "shakshee";
	char result[20];
	int i=0;
	int j=0;
	while(str[i] != '\0')
	{
		if(i%2 !=0)
		{
			result[j]=str[i];
			j++;
		}
		i++;
	}
	result[j] ='\0';
	printf("%s", result);
}
