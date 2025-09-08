#include<stdio.h>
int factorial(); //declaration 
void main()
{
	int res = factorial();  //function call
	printf("%d",res);
}// main end here
int factorial() //defination
 {
 	int n;
	printf("enter a number: \n");
	scanf("%d",&n);
 	int fact=1;
	int i;
	for(i=2; i<=n; i++)
	{
		fact=fact*i;
	}
	return fact;
 }
