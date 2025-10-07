#include<stdio.h>
int mystrlen(char*);
void main()
{
	char str[] = "firstbit";
	int len = mystrlen(str);
	printf("length is %d",len);
}
int mystrlen(char*str)
{
	int i=0,count=0;
	while(str[i]!='\0')
	{
		count++;
		i++;
	}
	return count;
}
