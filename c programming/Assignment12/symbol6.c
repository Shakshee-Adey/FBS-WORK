#include<stdio.h>
#include<string.h>
void main()
{
	char str[]="shakshi gmail.com";
	char symbol;
	printf("Enter a symbol to replace spaces: ");
    scanf("%c", &symbol);
    int i=0;
    // Traverse the string and replace spaces
    while (str[i] != '\0')
	 {
        if (str[i] == ' ')
		 {
            str[i] = symbol;
         }
        i++;
    }

    // Output the modified string
    printf("Modified string: %s\n", str);
}
