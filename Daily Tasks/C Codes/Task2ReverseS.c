//Reverse string

#include<stdio.h>
void main()
{
	char str[] ="shakshee";
	int len;                                   //int len;
	while(str[len]!='\0')                      //len = strlen(str);
	{                                            //printf("%d",len);
	 len++;                              
	}  
	printf("the length of this string is :-  %d\n",len);                               
	
	// reverse a string
	char temp;
	int i;                                 //strrev(str);
	for(i=0; i< (len-1)/2; i++)
	{
	  	temp = str[i];
	  	str[i]=str[len-1-i];
	  	str[len-1-i]=temp;
	}
	printf("Revers String is :- %s",str);
}
