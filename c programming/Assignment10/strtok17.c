#include<stdio.h>
#include <string.h>
void main()
{
	char str1[20]="fbcde-df123,jk45";
	char *res= strtok(str1, '-');
	while (res != NULL) 
	{
    
    res = strtok(NULL, "-");
    printf("%s\n", res);
    res++;
}
}

