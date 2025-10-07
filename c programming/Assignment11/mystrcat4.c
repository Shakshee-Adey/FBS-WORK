#include<stdio.h>
mystrcat();
void main()
{
	char str[]="shakshee";
	char cpy[]="adey";
	mystrcat(str,cpy);
	printf("%s",str);
}
mystrcat(char*str,char*cpy)
{
	int i=0,j=0;
	while(str[i]!='\0')
	{
		i++;
	}
	while(cpy[j]!='\0')
	{
		str[i]=cpy[j];
		i++;
		j++;
		
	}
	str[i]!= '\0';
}
