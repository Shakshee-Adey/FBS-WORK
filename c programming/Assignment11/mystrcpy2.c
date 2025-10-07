#include<stdio.h>
char mystrcpy(char*, char*);
void main()
{
	char str1[]="shakshi";
	char str2[10];
	mystrcpy(str2,str1);
	printf("copy string is %s",str2);
}
char mystrcpy(char* str2, char* str1)
{
	int i=0;
	while(str1[i]!= '\0')
	{
		str2[i]=str1[i];
		i++;
	}
	str2[i]='\0';
	return str2;
}
