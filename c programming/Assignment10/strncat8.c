#include<stdio.h>
void main()
{
	char str[20]="Hi Sara";
	char str2[20]="Thank you";
	strncat(str2, str, 3);
	printf("%s",str2);
}
