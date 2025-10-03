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
	scanf("%d",&s1.rollno);
	scanf("%s",s1.name);
	scanf("%d",&s1.marks);
	scanf("%d",&s2.rollno);
	scanf("%s",s2.name);
	scanf("%d",&s2.marks);
	scanf("%d",&s3.rollno);
	scanf("%s",s3.name);
	scanf("%d",&s3.marks);
	printf("%d %s %d \n",s1.rollno,s1.name,s1.marks);
	printf("%d %s %d \n",s2.rollno,s2.name,s2.marks);
	printf("%d %s %d",s3.rollno,s3.name,s3.marks);
}
