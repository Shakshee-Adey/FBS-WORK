#include<stdio.h>
int factorial(int); //declaration 
void main()
{
	int n;
	printf("enter a number: \n");
	scanf("%d",&n);
	int res = factorial(n);  //function call
	printf("%d",res);
}// main end here
int factorial(int s) //defination
 {
 	int fact=1;
	int i;
	for(i=2; i<=s; i++)
	{
		fact=fact*i;
	}
	return fact;
 }
