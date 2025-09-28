#include<stdio.h>
#include<string.h>
void main()
{
	char str[]="shagmailcom";
	int i=0, found=0;
	char ch ;
	printf("Enter a string: ");
    scanf("%s", str);  // Note: scanf stops at space

    // Input character to search
    printf("Enter a character to search: ");
    scanf(" %c", &ch);  // Notice the space before %c to consume any leftover newline

    // Traverse and search
    while (str[i] != '\0') {
        if (str[i] == ch) {
            printf("Character '%c' found at index %d\n", ch, i);
            found = 1;
        }
        i++;
        }

    if (!found) {
        printf("Character '%c' not found in the string.\n", ch);
    }

}
