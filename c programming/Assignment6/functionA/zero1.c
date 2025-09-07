#include<stdio.h>
void sum(); // declaration
void main()
{
	sum();   // function call
}  // main end here
   
   void sum()  //defination
{
	int sum, A,B;
	printf("enter a variable A : ");
	scanf("%d",&A);
	printf("enter a variable B : ");
	scanf("%d",&B);
	sum= A+B;
	printf(" sum = %d",sum);
	
}
