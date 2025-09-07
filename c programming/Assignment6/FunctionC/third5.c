#include<stdio.h>
void armstrong(int,int,int,int,int,int);  // declaration
void main()
{   
     int N;
	printf("enter a number N: ");
	scanf("%d",&N);
	int count=0;
	int temp; 
	int sum=0;
	int res=1;
	int i=1;      //main start here
	armstrong(N,count,temp,sum,res,i);            // function call
}            //main ends here
 void armstrong(int N,int count,int temp,int sum,int res,int i)         // defination
 {
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
		printf("number is armstrong");
	}
	else
	{
		printf("not armstrong");
	}
}    // defination end here
