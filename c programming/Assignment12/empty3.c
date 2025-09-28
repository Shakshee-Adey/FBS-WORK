#include<stdio.h>
#include<string.h>
void main()
{
	char str[]="sha kshi gmail.com";
    int i=0,n;
    // Traverse the string and replace spaces
    printf("Enter a string: ");
    fgets(str, sizeof(str), stdin);
    while (str[i] != '\0')
	 {
        if (str[i] == '\n')
		 {
            str[i] = '\0';
            break;
         }
        i++;
       
	   }
	    printf("Enter index to remove: ");
    scanf("%d", &n);

    // Check if n is valid index
    int length = 0;
    while (str[length] != '\0') {
        length++;
    }

    if (n < 0 || n >= length) {
        printf("Invalid index!\n");
        return 1;
    }
    for (i = n; i < length; i++) {
        str[i] = str[i + 1];
    }

    printf("String after removing character at index %d: %s\n", n, str);


}
