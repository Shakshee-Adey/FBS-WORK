
#include<stdio.h>
void main()
{
	char *ptr = memchr("abcdef", 'd', 6);
printf("%s\n", ptr);  // Output: def
}

