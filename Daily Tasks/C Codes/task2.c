// using built in function reverse a string
#include<stdio.h>
void main()
{
	char str[]="shaksheeadey";
	int len = strlen(str);
	printf("length is %d\n",len);
	
	strrev(str);
	printf("revers is %s",str);
}
