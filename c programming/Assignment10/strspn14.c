#include<stdio.h>
#include <string.h>
void main()
{
	char str1[20]="abcde12345";
	char str2[20]="abcde";
	char *res= strspn(str1, str2);
	printf("%u",res);
}
	
