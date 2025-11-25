//Check if two strings are equal.

#include<stdio.h>
void main()
{
	char str[] ="shakshee";
	char ptr[] ="shakshi";
	int i;
	int flag=1;
	while(str[i]!='\0'||ptr[i]!='\0')
	{
		if(str[i]!=ptr[i])
		{
			flag=0;
			break;
		}
		i++;
	}
	if(flag==1)
	 printf("string are equal");
	else
	 printf("not equal");
} 
