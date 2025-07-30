#include<stdio.h>
void main(){
	float maths=75,science=89,english=85,hindi=90,sanscrit=92;
	float sum, percentage;
	sum= maths+science+english+hindi+sanscrit;
	percentage= (sum/500)*100;
	printf("sum is %f and percentage is %f",sum,percentage);
}
