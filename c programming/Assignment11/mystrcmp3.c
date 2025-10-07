#include<stdio.h>
int mystrcmp(char*,char*);
void main()
{
	char str[] = "sha";
	char str1[] = "shakshee";
	int compare = mystrcmp(str, str1);
	if(compare==0)
	 printf("string are equal");
	else if(compare>0)
	 printf("string str is grater");
	 else
	  printf("string str1 is greater");
	
}
int mystrcmp(char*str,char*str1)
{
	int i=0;
	while(str[i]!='\0' && str1[i]!='\0')
	{
		if(str[i]!=str1[i])
		{
			return str[i]-str1[i];
		}
		i++;
	}
	return str[i]-str1[i];
}
