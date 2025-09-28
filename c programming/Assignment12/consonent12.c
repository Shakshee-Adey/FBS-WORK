#include<stdio.h>
#include<string.h>
void main()
{
	char str[]= "shakshee";
	int i=0;
 int count=0;
	while(str[i] != '\0')
	{
		char ch = str[i];
		if(!str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u')
		{
			 printf("%c",ch);
		}
		i++;
}
}
