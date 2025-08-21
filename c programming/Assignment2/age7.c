#include<stdio.h>
void main(){
	int age=-9;
	if(age<12)
	 printf("child");
	else
	 if(age>=12 && age<=19)
	   printf("teenager");
	 else
		if(age>=20 && age<=59)
	     printf("adult");
	    else 
		 if(age>=60)
	         printf("senior");
	     else
	         printf("not valid age");
}


