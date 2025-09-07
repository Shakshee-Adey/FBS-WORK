#include<stdio.h>
void uperlower(char);
void main()
{
	char n;
   printf("enter a character n :");
   scanf("%c",&n);
  uperlower(n);
}
void uperlower(char f)
{
   if(f>='A'&&f<='Z')
   {
   	printf("character is uppercase");
   }
   else
   {
   	printf("character is lowercase");
   }
}
