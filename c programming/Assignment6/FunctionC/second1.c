#include<stdio.h>
void operator(int , int , char);
void main()
{
	int a, b;
	char op;
	
	printf("enter number a: \n");
	scanf("%d",&a);
	printf("enter number b: \n");
	scanf("%d",&b);
	printf("enter operator %%,+,-,*,/  \n");
	scanf(" %c",&op);
	operator(a,b,op);
}
void operator(int a, int b, char op)
{
	
	if(op=='+')
	printf("result %d\n",a+b);
	 else if(op=='-')
	     printf("result %d\n",a-b);
	     else if(op=='*')
	          printf("result %d\n",a*b);
	          else if(op=='/')
	              printf("result %d\n",a/b);
	              else if(op=='%')
	               printf("result %d\n",a%b);
	                else
	                  printf("invalid");
}
