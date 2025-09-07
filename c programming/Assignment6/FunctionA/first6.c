#include<stdio.h>
void uperlower();
void main()
{
  uperlower();
}
void uperlower()
{
   char n;
   printf("enter a character n :");
   scanf("%c",&n);
   if(n>='A'&&n<='Z')
   {
   	printf("character is uppercase");
   }
   else
   {
   	printf("character is lowercase");
   }
}
