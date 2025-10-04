#include<stdio.h>
struct complex
{
  float real;
  float imaganary;
};
void storevalue(struct complex*,int);
void displayvalue(struct complex*,int);
void main()
{
	struct complex arr[5];
	storevalue(arr,5);
	displayvalue(arr,5);
}
void storevalue(struct complex*arr,int size)
{
	int i;
	printf("enter a values :- \n");
	for(i=0; i<size; i++)
	{
	   scanf("%f",&arr[i].real);
	   scanf("%f",&arr[i].imaganary);
	   
	}
}
void  displayvalue(struct complex*arr,int size)
{
	int i;
	printf("feet and inches :- \n");
	for(i=0; i<size; i++)
	{
	printf("%f,%f\n", arr[i].real,arr[i].imaganary);
    }
}
