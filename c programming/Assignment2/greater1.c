#include<stdio.h>
void main(){
	int x=40,y=30,z=70;
	if(x>y)
	{
		if(x>z)
		  printf("x is greater");
		else
		  printf("z is greater");
	}
	else
	  {
	  	if(y>z)
	  	  printf("y is greater");
	  	else
	  	  printf("z is greater");
	  }
}
