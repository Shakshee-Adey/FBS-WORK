#include <stdio.h>
#include <string.h>

int main()
{
    char str[100];
    int i, j, count;
    int len;
    char v[100] = {0}; 
    printf("Enter a word: ");
    scanf("%s", str);
	len = strlen(str);
	printf("Character Frequency:\n");
    for(i = 0; i<len; i++)
    {
        if(v[i] == 1)    
            continue;
        count = 1;
        for(j = i + 1; j<len; j++)
        {
            if(str[i] == str[j])
            {
                count++;
                v[j] = 1; // mark as counted
            }
        }
printf("%c - %d\n", str[i], count);
    }
return 0;
}

