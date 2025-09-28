#include<stdio.h>
void main()
{
	char str[20]="what is your name";
	printf("str address is %u\n",str);
	char*res= strupr(str);
	printf("Resulting address is :- %u \n",res);
	printf("%s",str);
	
}
