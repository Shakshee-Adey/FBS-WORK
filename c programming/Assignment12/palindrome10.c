#include<stdio.h>
#include<string.h>
void main()
{
	char str[]= "mam";
	char str1[100];
	strcpy(str1, str);
	strrev(str1);
	if(strcmp(str,str1) == 0) // compare krne pr jab result 0 hoga tab true hogi condition
	{
		printf("string is palindrome");
	}
	else
	{
		printf("string is not palindrome");
	}
}
