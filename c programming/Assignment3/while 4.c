#include<stdio.h>
void main(){
	int n=202, i=2 , flag=0;
	while(i<=n/2)
	{
		if(n%i==0)
		{
		  flag=1;
	      break;
	    }
	    i++;
	}
	if(flag==0)
	  printf("no. is prime");
	else
	  printf("no. is not prime");
}
