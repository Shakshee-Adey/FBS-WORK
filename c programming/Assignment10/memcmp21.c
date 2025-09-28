#include<stdio.h>
void main()
{
char a[] = "ABC";
char b[] = "ABD";
printf("%d\n", memcmp(a, b, 2));
}
