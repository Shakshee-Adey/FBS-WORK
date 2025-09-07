#include<stdio.h>
int character();
void main()
{
	int res = character();
	if(res==1)
	{
		printf("character is vowel ");
	}
	else
	{
		printf("character is consonent");
	}
}
 int character( )
 {
 	int ch;
	printf("enter a number: \n");
	scanf("%c",&ch);
	if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u')
	{
	 return 1;
	}
	else
	{
	 return 0;
	}
 }
