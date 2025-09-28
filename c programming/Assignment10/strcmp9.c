#include<stdio.h>
void main()
{
	char str[20]="Sara";
	char str2[20]="sara";
	char* res = strcmp(str, str2);
	printf("%d",res);
	// when two strings are equal then outcome become 0
	//but when one string take Sara and one take sara  str1<str2 -1
	//str1>str2 1 
}
