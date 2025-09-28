#include<stdio.h>
void main()
{
	char str[10]="Hi Sara";
	char str2[9]=" Thank you";
	strcat(str, str2);
	printf("append to strings :- %s " , str);
}
