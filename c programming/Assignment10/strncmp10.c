#include<stdio.h>
#include <string.h>
void main()
{
	char str[20]="Saraali";
	char str2[20]="sara";
	int res = strncmp(str, str2, 3);
	printf("%d",res);
}
