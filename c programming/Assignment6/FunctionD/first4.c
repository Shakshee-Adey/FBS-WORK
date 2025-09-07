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
		printf("character is vowel ");
	}
	else
	{
		printf("character is consonent");
	}
}
 int character(char ch )
 {
 	
	if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u')
	{
	 return 1;
	}
	else
	{
	 return 0;
	}
 }
