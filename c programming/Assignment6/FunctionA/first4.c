#include<stdio.h>
void vowel();
void main()
{
  vowel();
}
void vowel()
{
   char ch;
   printf("enter a character :");
   scanf("%c",&ch);
   if(ch=='a'||ch=='e'||ch=='o'||ch=='u'||ch=='i')
   {
   	printf("character is vowel");
   }
   else
   {
   	printf("character is consonant");
   }
   
}
