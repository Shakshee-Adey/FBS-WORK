#include<stdio.h>
#include <string.h>
void main()
{
	char str[20]="hisara";
	printf("adress is %u\n",str);
	int res= strchr(str, 's');
	printf("%d",res);
}
