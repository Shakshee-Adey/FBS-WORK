#include<stdio.h>
void armstrong();  // declaration
void main()
{          //main start here
	armstrong();            // function call
}            //main ends here
 void armstrong()         // defination
 {
	int N;
	printf("enter a number N: ");
	scanf("%d",&N);
	int count=0;
	int temp=N;
	while(temp>0)
	{
	  count++;
	  temp=temp/10;	
	}
	int sum=0;
	temp=N;
	while(temp>0)
	{
		int rem;
		rem = temp%10;
		int res=1;
		int i;
		for(i=1; i<=count; i++)
		{
		   res=res*rem;	
     	}
		sum=sum+res;
	    temp=temp/10;
	}
	if(N==sum)
	{
		printf("number is armstrong");
	}
	else
	{
		printf("not armstrong");
	}
}    // defination end here
