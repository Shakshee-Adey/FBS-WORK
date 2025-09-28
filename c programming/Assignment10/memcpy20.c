#include<stdio.h>
void main()
{
char src[] = "CopyMe";
char dest[10];
memcpy(dest, src, strlen(src) + 1);
printf("%s\n", dest);
}
