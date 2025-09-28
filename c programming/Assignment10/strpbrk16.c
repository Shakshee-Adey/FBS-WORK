#include<stdio.h>
#include <string.h>
void main()
{
	char str1[20]="fbcde12345";
	char str2[20]="klj";
	char*res= strpbrk(str1, str2);
	if (res != NULL) {
        printf("%c\n", *res);  // Safe
    } else {
        printf("No match found.\n");
    }
}
	
