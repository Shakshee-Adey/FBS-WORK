#include<stdio.h>
#include <string.h>
void main()
{
	char str1[20]="fbcde12345";
	char str2[20]="abcdef";
	int res= strcspn(str1, str2);
	printf("%u",res);
}
	
