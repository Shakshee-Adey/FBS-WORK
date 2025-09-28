#include<stdio.h>
void main()
{
	char str[10];
memset(str, '*', 5);
str[5] = '\0';
printf("%s\n", str);  // Output: *****
}
