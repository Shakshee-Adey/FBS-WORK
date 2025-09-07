#include<stdio.h>
void percentage();
void main()
{
  percentage();	
}
void percentage()
{
	float sum=0,avarage;
	float s1,s2,s3,s4,s5;
	printf("enter a subject 1\n : ");
	scanf("%f",&s1);
	printf("enter a subject 2\n : ");
	scanf("%f",&s2);
	printf("enter a subject 3\n : ");
	scanf("%f",&s3);
	printf("enter a subject 4\n : ");
	scanf("%f",&s4);
	printf("enter a subject 5\n : ");
	scanf("%f",&s5);
	
	sum= s1+s2+s3+s4+s5;
	avarage= sum/5;
	printf("percentage of student : %f",avarage);
}
