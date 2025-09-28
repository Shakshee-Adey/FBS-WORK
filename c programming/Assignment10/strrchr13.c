#include<stdio.h>
#include <string.h>
void main()
{
	char str[20]="hisara";
	char *res= strrchr(str, 'a');
	printf("adress of str %u\n",str);
	int i=0;
	while(str[i] != '\0')
	{
		printf("%c-%u", str[i], &str[i]);
		i++;
	}
	printf("resulting address %u",res);
}
	
