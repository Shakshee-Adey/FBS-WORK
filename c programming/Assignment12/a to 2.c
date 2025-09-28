#include<stdio.h>
#include<string.h>
void main()
{
	char str[]="shagmailcom";
	int i=0;
	char ch = '$';
	while (str[i] != '\0')
	 {
       if(str[i]=='a')
       {
       	printf("%c",ch);
	   }
	   else
	   {
	   	printf("%c",str[i]);
	   }
	   i++;
     }
     
 }
