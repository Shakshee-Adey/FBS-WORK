#include<stdio.h>
void main()
{
char str[] = "Hello";
int len = strlen(str);
int i;
for ( i = 0; i < len / 2; i++)
 {
    char temp = str[i];
    str[i] = str[len - i - 1];
    str[len - i - 1] = temp;
}
printf("%s\n", str);
}
