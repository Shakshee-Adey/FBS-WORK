#include<stdio.h>
void main(){
	int s=28;
	if(s%3==0 && s%5==0)
		printf("divisible by both");
	else if(s%5==0 && s%3!=0)
	    printf("divisble by 5 but not 3");
	     else
	       if(s%3==0 && s%5!=0)
	         printf("divisble by 3 but not 5");
	       else
	         if(s%3!=0 && s%5!=0)
	           printf("divisble by none");
}
