#include<stdio.h>
void main()
{
	char str1[20]= "My Name is Shakshee";
	char str2[20];
	printf("Adress is %u \n",str1);
	printf("Adress is %u \n",str2);
    char* res = strcpy(str2, str1);
    printf("Addressing result is %u \n",res);
	printf("copied string is :- %s",str2);
	
}
