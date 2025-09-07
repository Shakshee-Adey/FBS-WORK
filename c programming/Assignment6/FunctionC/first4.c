#include<stdio.h>
void vowel(char);
void main()
{
    char ch;
   printf("enter a character :");
   scanf("%c",&ch);
  vowel(ch);
}
void vowel(char ch)
{
   
   if(ch=='a'||ch=='e'||ch=='o'||ch=='u'||ch=='i')
   {
   	printf("character is vowel");
   }
   else
   {
   	printf("character is consonant");
   }
   
}
