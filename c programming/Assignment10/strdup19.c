#include<stdio.h>
void main()
{
char *original = "Hello";
char *copy = strdup(original);
printf("%s\n", copy);  // Output: Hello
free(copy);
}
