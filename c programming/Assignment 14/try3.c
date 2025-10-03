#include<stdio.h>
struct student
{
	int Accountno;
	char name[20];
	float balance;
};
void main()
{
	struct student s1;
	s1.Accountno= 1234566778;
	strcpy(s1.name,"shanu");
	s1.balance= 250000;
	printf("%d %s %2f \n",s1.Accountno,s1.name,s1.balance);
	
}
