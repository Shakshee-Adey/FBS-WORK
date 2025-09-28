#include<stdio.h>
#include<string.h>
void main()
{
	char str[]= "shakshee";
	char result[20];
	int i=0;
 int count=0;
	while(str[i] != '\0')
	{
		if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u')
		{
			 count++;
		}
		i++;
	}
	printf("%s", count);
}
