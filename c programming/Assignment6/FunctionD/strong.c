#include<stdio.h>
int factorial(int);
int isstrong(int);
void main()
{
	int n;
	printf("enter a number : \n");
	scanf("%d",&n);
	int res = isstrong(n);
	if(res==1)
		printf("strong number");
	else
		printf("not strong number");
} // main end here
// factorial function start here
int factorial(int rem)  //meaningfull variable nemw likhna jaise rem ki jagah s likh skte h 
    {
        int fact=1,i;
		for(i=1; i<=rem; i++)  //loop ko 2 se start kr skte h 
		{
			fact=fact*i;
		}
		return fact;
	}
// factorial function end here
// isstrong function start here
int isstrong(int n)
	{
	int temp=n;
	int sum=0;
	int rem;
	while(n>0)
	{
		rem=n%10;
		sum=sum+factorial(rem);
		n=n/10;
	}
	if(temp==sum)  // hm direct value return kr skte h jaise return (sum==temp);
	 return 1;
	else
	 return 0;
	}
//isstrong function end here
