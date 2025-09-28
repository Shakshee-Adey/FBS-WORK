#include<stdio.h>
#include <string.h>
void main()
{
	char str[20]="hisara";
	char str2[20]= "what";
	char *res= strstr(str, str2);
	if(res != NULL)
	{
		printf("substring found %s",res);
	}
	else
	{
		printf("substring not found ");
	}
}
