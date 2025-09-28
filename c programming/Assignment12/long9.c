#include<stdio.h>
#include<string.h>
void main()
{
	char s1[20];
	char s2[40];
	 printf("enter first string :- \n");
	 scanf("%s",s1);
	 printf("enter second string :- \n");
	 scanf("%s",s2);
	 int i = 0, j=0;
	 int len1=0, len2=0;
     while (s1[i] != '\0')
	  {
         len1++;
        i++;
      }
     while (s2[j] != '\0') 
	 {
        len2++;
        j++;
     }
     if (len1 > len2) 
	 {
        printf("Larger string is: %s\n", s1);
     } 
	 else 
	 {
	  if (len2 > len1) 
	  {
        printf("Larger string is: %s\n", s2);
      } 
	  else 
	  {
        printf("Both strings are of equal length: %s and %s\n", s1, s2);
      }
     }
      
}
