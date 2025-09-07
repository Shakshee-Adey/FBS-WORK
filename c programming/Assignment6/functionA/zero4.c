#include<stdio.h>
void swap();    // declaration 
void main() // main start here
{
	swap();  // function call
}           // main end here
void swap()     //function defination
{
	int a=20,b=30,temp;
	temp=a;
	a=b;
	b=temp;
	printf("after swaping a=20 and before swaping a=%d\n",a);
	printf("after swaping b=30 and before swaping b=%d",b);
}
