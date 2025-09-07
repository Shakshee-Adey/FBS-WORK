#include<stdio.h>
int character();
void main()
{
	
	int res = character();
	if(res==1)
	{
		printf("character is UPPERCASE ");
	}
	else
	{
		printf("character is LOWERCASE");
	}
}
 int character( )
 {
 	int ch;
	printf("enter a number: \n");
	scanf("%c",&ch);
	if(ch>='A'&&ch<='Z')
	{
	 return 1;
	}
	else
	{
	 return 0;
	}
 }
