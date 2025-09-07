#include<stdio.h>
int character(char);
void main()
{
	int ch;
	printf("enter a number: \n");
	scanf("%c",&ch);
	int res = character(ch);
	if(res==1)
	{
		printf("character is UPPERCASE ");
	}
	else
	{
		printf("character is LOWERCASE");
	}
}
 int character(char ch )
 {
 	
	if(ch>='A'&&ch<='Z')
	{
	 return 1;
	}
	else
	{
	 return 0;
	}
 }
