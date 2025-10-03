#include<stdio.h>
struct student
{
	int rollno;
	char name[20];
	int marks;
};
void main()
{
	struct student s1, s2, s3;
	s1.rollno=101;
	strcpy(s1.name,"Akshay");
	s1.marks=85;
	s2.rollno=102;
	strcpy(s2.name,"Pragti");
	s2.marks=75;
	s3.rollno=103;
	strcpy(s3.name,"Shakshee");
	s3.marks=79;
	printf("%d %s %d \n",s1.rollno,s1.name,s1.marks);
	printf("%d %s %d \n",s2.rollno,s2.name,s2.marks);
	printf("%d %s %d",s3.rollno,s3.name,s3.marks);
}
