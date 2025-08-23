#include<stdio.h>
void main(){
	int i=2;
	int n=5,f=0;
	for(i=2; i<=n/2; i++)
	{
		if(n%i==0){
		f=1;
		break;
	}
	if(f==0)
	 printf("not prime");
	else
	 printf("prime");
	}
}
