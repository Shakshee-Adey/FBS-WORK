#include<stdio.h>
void main()
{
	char str[20]= "My Name is Rasu Adey";
	char des[7]="\0";
	strncpy(des ,str, 7);
	printf("%s",des);
}
