#include<stdio.h>
int armstrong();  // declaration
void main()
{   
       //main start here
	int total = armstrong();
	if(total==1) 
	{
		printf("number is armstrong");
	}
	else
	{
		printf("not armstrong");
	}
	           // function call
}            //main ends here
int armstrong()         // defination
 {
 	int N;
	printf("enter a number N: ");
	scanf("%d",&N);
	int count=0;
	int temp; 
	int sum=0;
	int res=1;
	int i=1; 
 	temp=N;
	while(temp>0)
	{
	  count++;
	  temp=temp/10;	
	}
	//int sum=0;
	temp=N;
	while(temp>0)
	{
	//	int rem;
		int rem = temp%10;
		res=1;//int res=1;
	//	int i;
		for(i=1; i<=count; i++)
		{
		   res=res*rem;	
     	}
		sum=sum+res;
	    temp=temp/10;
	}
	if(N==sum)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}    // defination end here
