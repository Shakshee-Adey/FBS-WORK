#include<stdio.h>
#include<string.h>
void main()
{
	char str[]="shagmailcom";
	int i=0;
	while (str[i] != '\0')
	 {
        i++;
    }

    // Swap first and last characters only if length > 1
    if (i > 1) 
	{
        char temp = str[0];
        str[0] = str[i - 1];
        str[i - 1] = temp;
    }

    printf("Modified string: %s\n", str);
}
